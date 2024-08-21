import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetMaster {
    private String nomUtilisateur;
    private double budgetMensuel;
    private List<Depense> depenses;

   
    public BudgetMaster(String nomUtilisateur, double budgetMensuel) {
        this.nomUtilisateur = nomUtilisateur;
        this.budgetMensuel = budgetMensuel;
        this.depenses = new ArrayList<>();
    }

    
    public void ajouterDepense(String description, double montant, String categorie, LocalDate date) {
        if (montant >= 0) { 
            Depense nouvelleDepense = new Depense(description, montant, categorie, date);
            depenses.add(nouvelleDepense);
        } else {
            System.out.println("Le montant ne peut pas être négatif.");
        }
    }

    
    public double calculerTotalDepensesMoisEnCours() {
        double total = 0;
        LocalDate maintenant = LocalDate.now();
        for (Depense depense : depenses) {
            if (depense.getDate().getMonth() == maintenant.getMonth() &&
                depense.getDate().getYear() == maintenant.getYear()) {
                total += depense.getMontant();
            }
        }
        return total;
    }

   
    public double obtenirBudgetRestant() {
        double totalDepenses = calculerTotalDepensesMoisEnCours();
        return budgetMensuel - totalDepenses;
    }
}
