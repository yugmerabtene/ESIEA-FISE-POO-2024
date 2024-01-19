package lcl;

public class Main {
    public static void main(String[] args) {
        // Cr�ation d'un compte bancaire
        CompteBancaire compte = new CompteBancaire("John Doe", 1000.0f);

        // Affichage du solde initial
        System.out.println("Solde initial du compte de " + compte.getTitulaire() + " : " + compte.getSolde());

        // Cr�diter le compte
        crediterCompte(compte, 500.0f);

        // D�biter le compte
        debiterCompte(compte, 200.0f);

        // Affichage du solde mis � jour
        compte.afficherSolde();

        // Cr�ation d'un compte d'�pargne
        CompteEpargne compteEpargne = new CompteEpargne("Jane Doe", 2000.0f, 2.5f);

        // Affichage du solde initial du compte d'�pargne
        System.out.println("Solde initial du compte d'�pargne de " + compteEpargne.getTitulaire() + " : " + compteEpargne.getSolde());

        // Cr�diter le compte d'�pargne avec int�r�ts
        crediterCompte(compteEpargne, 500.0f);

        // Affichage du solde mis � jour du compte d'�pargne
        compteEpargne.afficherSolde();
    }

    // M�thode pour cr�diter un compte
    private static void crediterCompte(CompteBancaire compte, float montant) {
        compte.crediter(montant);
        System.out.println("Cr�dit de " + montant + " effectu�. Nouveau solde : " + compte.getSolde());
    }

    // M�thode pour d�biter un compte
    private static void debiterCompte(CompteBancaire compte, float montant) {
        compte.debiter(montant);
        System.out.println("D�bit de " + montant + " effectu�. Nouveau solde : " + compte.getSolde());
    }
}
