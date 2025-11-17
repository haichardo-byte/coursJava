public class Cours {
       String codeCours;
       String nomCours;
       String enseignant;
       int nombreHeures;
       int nombreCredits;
       int capaciteMax;
       int nombreInscrits;
       public Cours(String codeCours, String nomCours, String enseignant, int nombreHeures, int nombreCredits, int capaciteMax) {
           this.codeCours = codeCours;
           this.nomCours = nomCours;
           this.enseignant = enseignant;
           this.nombreHeures = nombreHeures;
           this.nombreCredits = nombreCredits;
           this.capaciteMax = capaciteMax;
           this.nombreInscrits = 0;
       }
       public void afficherInfos() {
           System.out.println("code cours: " + codeCours);
           System.out.println("nom cours: " + nomCours);
           System.out.println("enseignant: " + enseignant);
           System.out.println("nombre heures: " + nombreHeures);
           System.out.println("nombre credits: " + nombreCredits);
           System.out.println("capacite max: " + capaciteMax);
           System.out.println("nombre inscrits: " + nombreInscrits);
       }
       public boolean estComplet() {
           if (nombreInscrits >= capaciteMax) {
               return true;
           } else {
               return false;
           }
       }
       public void inscrireEtudiant(Etudiant e) {
           boolean c=this.estComplet();
           if (c==true){
               System.out.println("Le cours est deja complet");
           }
           else{
               nombreInscrits +=1 ;
               System.out.println("Etudiant inscrit au cours");
           }

       }
       public void desinscrireEtudiant() {
           if (nombreInscrits > 0) {
               nombreInscrits -=1 ;
               System.out.println("Etudiant desincrit du cours");
           }
           else{
               System.out.println("Aucun etudiant a desinscrire du cours");
           }
       }
       public double calculerTauxRemplissage(){
           double taux=(double)nombreInscrits/capaciteMax*100.0;
           return taux;
       }

}
