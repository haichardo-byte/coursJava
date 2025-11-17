class EtudiantEtranger extends Etudiant {
    private String paysOrigine;
    protected String typeVisa;
    protected String dateExpirationVisa;
    public EtudiantEtranger(String nom,String prenom, int matricule, String paysOrigine, String typeVisa, String dateExpirationVisa) {
        super(nom, prenom,matricule);
        this.paysOrigine = paysOrigine;
        this.typeVisa = typeVisa;
        this.dateExpirationVisa = dateExpirationVisa;
    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Pays d origine : " + paysOrigine);
    }
    public void afficherInfosVisa() {
        System.out.println("Pays d'origine: " + this.paysOrigine + ", Type Visa: " + this.typeVisa + ", Expiration: " + this.dateExpirationVisa);
    }
    @Override
    public double calculerFraisInscription() {
        return 5000.0;
    }

}
