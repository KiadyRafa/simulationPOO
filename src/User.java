import java.time.LocalDate;

public class User {
    private String nom;
    private BudgetMaster budgetMaster;

    public User(String nom, double budgetMensuel) {
        this.nom = nom;
        this.budgetMaster = new BudgetMaster(budgetMensuel);
    }

    public String getNom() {
        return nom;
    }

    public BudgetMaster getBudgetMaster() {
        return budgetMaster;
    }

    public void ajouterDepense(String description, double montant, String categorie, LocalDate date) {
        Depense depense = new Depense(description, montant, categorie, date);
        budgetMaster.ajouterDepense(depense);
    }
}
