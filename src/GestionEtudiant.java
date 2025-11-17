public class GestionEtudiant {
    Etudiant[] listeEtudiants;
    int nombreEtudiantsActuels;
    public GestionEtudiant() {
        this.listeEtudiants = new Etudiant[20];
        this.nombreEtudiantsActuels = 0;
    }
    public void ajouterEtudiant(Etudiant e){
        if (nombreEtudiantsActuels < listeEtudiants.length) {
            listeEtudiants[nombreEtudiantsActuels] = e;
            nombreEtudiantsActuels++;
            System.out.println("Etudiant ajoute");
        } else {
            System.out.println("Le tableau est plein:impossible d’ajouter un nouvel étudiant");
        }
    }
    public void afficherTousLesEtudiants() {
        if (nombreEtudiantsActuels == 0) {
            System.out.println("Aucun etudiant enregistre");
            return;
        }
        for (int i = 0; i < nombreEtudiantsActuels; i++) {
            listeEtudiants[i].afficherInfos();
        }
    }
    public double calculerFraisTotaux() {
        double total = 0.0;
        for (int i = 0; i < nombreEtudiantsActuels; i++) {
            total += listeEtudiants[i].calculerFraisInscription();
        }
        return total;
    }
    public void compterParType() {
        int nbBoursiers = 0;
        int nbEtrangers = 0;
        int nbReguliers = 0;
        for (int i = 0; i < nombreEtudiantsActuels; i++) {
            Etudiant e = listeEtudiants[i];
            if (e instanceof EtudiantBoursier) {
                nbBoursiers++;
            } else if (e instanceof EtudiantEtranger) {
                nbEtrangers++;
            } else if (e instanceof EtudiantRegulier) {
                nbReguliers++;
            }
        }

        System.out.println("Nombre d’étudiants boursiers : " + nbBoursiers);
        System.out.println("Nombre d’étudiants étrangers : " + nbEtrangers);
        System.out.println("Nombre d’étudiants réguliers : " + nbReguliers);
    }
}
