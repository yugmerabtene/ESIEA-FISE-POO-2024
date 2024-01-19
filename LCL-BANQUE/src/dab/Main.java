package dab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Création d'un compte bancaire
        CompteBancaire compte = new CompteBancaire("John Doe", 1000.0f);

        // Création d'un compte d'épargne
        CompteEpargne compteEpargne = new CompteEpargne("Jane Doe", 2000.0f, 2.5f);

        int choix;
        do {
            System.out.println("\nMenu Principal :");
            System.out.println("1. Afficher le solde du compte bancaire");
            System.out.println("2. Créditer le compte bancaire");
            System.out.println("3. Débiter le compte bancaire");
            System.out.println("4. Afficher le solde du compte d'épargne");
            System.out.println("5. Créditer le compte d'épargne");
            System.out.println("0. Quitter");

            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    compte.afficherSolde();
                    break;
                case 2:
                    System.out.print("Montant à créditer : ");
                    float montantCredit = scanner.nextFloat();
                    compte.crediter(montantCredit);
                    break;
                case 3:
                    System.out.print("Montant à débiter : ");
                    float montantDebit = scanner.nextFloat();
                    compte.debiter(montantDebit);
                    break;
                case 4:
                    compteEpargne.afficherSolde();
                    break;
                case 5:
                    System.out.print("Montant à créditer dans le compte d'épargne : ");
                    float montantCreditEpargne = scanner.nextFloat();
                    compteEpargne.crediter(montantCreditEpargne);
                    break;
                case 0:
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 0);

        scanner.close();
    }
	

}
