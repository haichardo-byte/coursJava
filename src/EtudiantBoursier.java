public class EtudiantBoursier extends Etudiant {
        private double montantBourse;

        public EtudiantBoursier(String nom, String prenom, int matricule, double montantBourse) {
            super(nom,prenom,matricule);
            this.montantBourse = montantBourse;
        }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Montant de la bourse : " + montantBourse);
    }
    @Override
    public double calculerFraisInscription() {
        return 0.0;
    }
}
