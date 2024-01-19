package dab;

//Fichier : CompteEpargne.java

public class CompteEpargne extends CompteBancaire {
 private float tauxInteret;

 // Constructeur
 public CompteEpargne(String titulaire, float solde, float tauxInteret) {
     // Appel du constructeur de la classe de base
     super(titulaire, solde);
     this.tauxInteret = tauxInteret;
 }

 // Getter pour le taux d'intérêt
 public float getTauxInteret() {
     return tauxInteret;
 }

 // Setter pour le taux d'intérêt
 public void setTauxInteret(float tauxInteret) {
     this.tauxInteret = tauxInteret;
 }

 // Surcharge de la méthode pour créditer avec intérêts
 @Override
 public void crediter(float montant) {
     // Appel de la méthode de la classe de base
     super.crediter(montant);
     // Ajout d'intérêts au solde après le crédit
     float interets = montant * tauxInteret / 100;
     super.crediter(interets);
     System.out.println("Intérêts ajoutés. Nouveau solde : " + getSolde());
 }
}
