public class EtudiantRegulier extends Etudiant {
    protected String modePaiement;
    protected boolean paiementAJour;

    public EtudiantRegulier(String nom,String prenom, int matricule,String modePaiement, boolean paiementAJour) {
        super( nom, prenom,matricule);
        this.modePaiement = modePaiement;
        this.paiementAJour = paiementAJour;
    }

    public void afficherStatutPaiement() {
        System.out.println("Mode de paiement: " + this.modePaiement + ", Paiement à jour: " + (this.paiementAJour ? "Oui" : "Non"));
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("--- Statut Paiement ---");
        afficherStatutPaiement();
        System.out.println("-----------------------");
    }
    @Override
    public double calculerFraisInscription() {
        return 3000.0;
    }

}
