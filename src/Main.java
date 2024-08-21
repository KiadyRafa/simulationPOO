import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nomUtilisateur = scanner.nextLine();

        System.out.print("Entrez votre budget mensuel : ");
        double budgetMensuel = scanner.nextDouble();

        User user = new User(nomUtilisateur, budgetMensuel);

        while (true) {
            System.out.println("\nVoulez-vous ajouter une dépense ? (oui/non)");
            String reponse = scanner.next();
            if (!reponse.equalsIgnoreCase("oui")) {
                break;
            }

            scanner.nextLine();
            System.out.print("Entrez la description de la dépense : ");
            String description = scanner.nextLine();

            System.out.print("Entrez le montant de la dépense : ");
            double montant = scanner.nextDouble();

            System.out.print("Entrez la catégorie de la dépense : ");
            scanner.nextLine();
            String categorie = scanner.nextLine();

            LocalDate date = LocalDate.now();

            user.ajouterDepense(description, montant, categorie, date);
        }

        double totalDepenses = user.getBudgetMaster().calculerTotalDepensesMoisEnCours();
        double budgetRestant = user.getBudgetMaster().obtenirBudgetRestant();

        System.out.println("\nTotal dépensé ce mois-ci : " + totalDepenses);
        System.out.println("Budget restant : " + budgetRestant);

        scanner.close();
    }
}
