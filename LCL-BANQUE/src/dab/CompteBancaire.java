package dab;

public class CompteBancaire {
 private String titulaire;
 private float solde;

 // Constructeur
 public CompteBancaire(String titulaire, float solde) {
     this.titulaire = titulaire;
     this.solde = solde;
 }

 // Getter pour le titulaire du compte
 public String getTitulaire() {
     return titulaire;
 }

 // Setter pour le titulaire du compte
 public void setTitulaire(String titulaire) {
     this.titulaire = titulaire;
 }

 // Getter pour le solde du compte
 public float getSolde() {
     return solde;
 }

 // M�thode pour cr�diter le compte
 public void crediter(float montant) {
     if (montant > 0) {
         solde += montant;
         System.out.println("Cr�dit de " + montant + " effectu�. Nouveau solde : " + solde);
     } else {
         System.out.println("Le montant du cr�dit doit �tre positif.");
     }
 }

 // M�thode pour d�biter le compte
 public void debiter(float montant) {
     if (montant > 0 && montant <= solde) {
         solde -= montant;
         System.out.println("D�bit de " + montant + " effectu�. Nouveau solde : " + solde);
     } else {
         System.out.println("Montant invalide ou solde insuffisant.");
     }
 }

 // M�thode d'affichage du solde
 public void afficherSolde() {
     System.out.println("Solde du compte de " + titulaire + " : " + solde);
 }
}
