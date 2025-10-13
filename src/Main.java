public class Main {
    public static void main(String[] args) {
        Cours c1=new Cours("JAVA_BD_4", "Programmation Orientée Objet en Java","Ali",4,3,2);
        Cours c2=new Cours("PYTHON", "Programmation","SARA",2,3,25);
        Cours c3=new Cours("RESAUX", "Signal","Mohammed",4,3,30);
        c1.afficherInfos();
        c2.afficherInfos();
        c3.afficherInfos();
        c1.inscrireEtudiant();
        c2.inscrireEtudiant();
        c1.inscrireEtudiant();
        c1.inscrireEtudiant();
        c1.desinscrireEtudiant();
        System.out.println("taux de remplissage: "+c1.calculerTauxRemplissage());
        Etablissement e1=new Etablissement("Euromed");
        Etablissement e2=new Etablissement("universite");
        e1.ajouterCours(c1);
        e1.ajouterCours(c3);
        e2.ajouterCours(c2);
        e1.afficherCours();
        e2.afficherCours();
        e1.supprimerCours(c3);
        e1.afficherCours();
    }
}
