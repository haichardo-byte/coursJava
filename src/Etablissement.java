import java.util.ArrayList;
public class Etablissement {
    String nomEtablisement;
    ArrayList <Cours> listeCours;
    public Etablissement(String nomEtablisement) {
        this.nomEtablisement=nomEtablisement;
        this.listeCours= new ArrayList();
    }
   public void afficherCours(){
        System.out.println("liste des cours");
        for (Cours cours : listeCours) {
            cours.afficherInfos();
        }
   }
   public void ajouterCours(Cours cours){
        listeCours.add(cours);
        System.out.println("cours ajoutes");

   }
   public void supprimerCours(Cours cours){
        listeCours.remove(cours);
        System.out.println("cours supprime");
   }
}
