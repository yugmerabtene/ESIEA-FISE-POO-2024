package lcl;

public class CompteBancaire {
    private String titulaire;
    private final float solde;

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

    // Méthode pour créditer le compte
    public void crediter(float montant) {
        if (montant > 0) {
            // Note: Using a local variable instead of modifying the field directly
            float nouveauSolde = solde + montant;
            System.out.println("Crédit de " + montant + " effectué. Nouveau solde : " + nouveauSolde);
        } else {
            System.out.println("Le montant du crédit doit être positif.");
        }
    }

    // Méthode pour débiter le compte
    public void debiter(float montant) {
        if (montant > 0 && montant <= solde) {
            // Note: Using a local variable instead of modifying the field directly
            float nouveauSolde = solde - montant;
            System.out.println("Débit de " + montant + " effectué. Nouveau solde : " + nouveauSolde);
        } else {
            System.out.println("Montant invalide ou solde insuffisant.");
        }
    }

    // Méthode d'affichage du solde
    public void afficherSolde() {
        System.out.println("Solde du compte de " + titulaire + " : " + solde);
    }
}
