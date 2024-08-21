import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetMaster {
    private double budgetMensuel;
    private List<Depense> depenses;

    public BudgetMaster(double budgetMensuel) {
        this.budgetMensuel = budgetMensuel;
        this.depenses = new ArrayList<>();
    }

    public void ajouterDepense(Depense depense) {
        depenses.add(depense);
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
        return budgetMensuel - calculerTotalDepensesMoisEnCours();
    }

    public List<Depense> getDepenses() {
        return depenses;
    }

    public double getBudgetMensuel() {
        return budgetMensuel;
    }
}
