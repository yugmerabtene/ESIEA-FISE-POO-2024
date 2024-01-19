package lcl;

public class Main {
    public static void main(String[] args) {
        // Création d'un compte bancaire
        CompteBancaire compte = new CompteBancaire("John Doe", 1000.0f);

        // Affichage du solde initial
        System.out.println("Solde initial du compte de " + compte.getTitulaire() + " : " + compte.getSolde());

        // Créditer le compte
        crediterCompte(compte, 500.0f);

        // Débiter le compte
        debiterCompte(compte, 200.0f);

        // Affichage du solde mis à jour
        compte.afficherSolde();

        // Création d'un compte d'épargne
        CompteEpargne compteEpargne = new CompteEpargne("Jane Doe", 2000.0f, 2.5f);

        // Affichage du solde initial du compte d'épargne
        System.out.println("Solde initial du compte d'épargne de " + compteEpargne.getTitulaire() + " : " + compteEpargne.getSolde());

        // Créditer le compte d'épargne avec intérêts
        crediterCompte(compteEpargne, 500.0f);

        // Affichage du solde mis à jour du compte d'épargne
        compteEpargne.afficherSolde();
    }

    // Méthode pour créditer un compte
    private static void crediterCompte(CompteBancaire compte, float montant) {
        compte.crediter(montant);
        System.out.println("Crédit de " + montant + " effectué. Nouveau solde : " + compte.getSolde());
    }

    // Méthode pour débiter un compte
    private static void debiterCompte(CompteBancaire compte, float montant) {
        compte.debiter(montant);
        System.out.println("Débit de " + montant + " effectué. Nouveau solde : " + compte.getSolde());
    }
}
