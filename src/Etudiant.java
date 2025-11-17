public class Etudiant {

    protected String nom;
    protected String prenom;
    protected int matricule;

    protected Cours[] coursInscrits;
    protected int nombreCoursInscrits;

    public Etudiant(String nom, String prenom, int matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;

        this.coursInscrits = new Cours[10];
        this.nombreCoursInscrits = 0;
    }

    public Etudiant() {
        this.coursInscrits = new Cours[10];
        this.nombreCoursInscrits = 0;
    }

    public void afficherInfos(){
        System.out.println("Nom :" + this.nom);
        System.out.println("Prenom :" + this.prenom);
        System.out.println("Matricule :" + this.matricule);
    }
    public void inscrireACours(Cours cours) {

        if (cours == null) {
            System.out.println("Erreur : le cours est invalide");
            return;
        }


        if (cours.estComplet()) {
            System.out.println("Erreur : le cours " + cours.codeCours + " est déjà complet.");
            return;
        }

        for (int i = 0; i < nombreCoursInscrits; i++) {
            if (coursInscrits[i].codeCours.equals(cours.codeCours)) {
                System.out.println("Erreur : l'étudiant est déjà inscrit au cours " + cours.codeCours + ".");
                return;
            }
        }

        if (nombreCoursInscrits == coursInscrits.length) {
            System.out.println("Erreur : l'étudiant ne peut pas s'inscrire à plus de cours.");
            return;
        }

        coursInscrits[nombreCoursInscrits] = cours;
        nombreCoursInscrits++;

        cours.inscrireEtudiant(this);

        System.out.println(prenom + " " + nom + " inscrit(e) au cours " + cours.codeCours + ".");
    }


    public void afficherMesCours() {
        if (nombreCoursInscrits == 0) {
            System.out.println(nom + " " + prenom + " n'est inscrit(e) à aucun cours.");
            return;
        }

        System.out.println("Cours inscrits de " + prenom + " " + nom + " :");
        for (int i = 0; i < nombreCoursInscrits; i++) {
            System.out.println("- " + coursInscrits[i].codeCours + " : " + coursInscrits[i].nomCours);
        }
    }
    public double calculerFraisInscription() {
        return 7000.0;
    }
}