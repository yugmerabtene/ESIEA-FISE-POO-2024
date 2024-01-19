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

 // Getter pour le taux d'int�r�t
 public float getTauxInteret() {
     return tauxInteret;
 }

 // Setter pour le taux d'int�r�t
 public void setTauxInteret(float tauxInteret) {
     this.tauxInteret = tauxInteret;
 }

 // Surcharge de la m�thode pour cr�diter avec int�r�ts
 @Override
 public void crediter(float montant) {
     // Appel de la m�thode de la classe de base
     super.crediter(montant);
     // Ajout d'int�r�ts au solde apr�s le cr�dit
     float interets = montant * tauxInteret / 100;
     super.crediter(interets);
     System.out.println("Int�r�ts ajout�s. Nouveau solde : " + getSolde());
 }
}
