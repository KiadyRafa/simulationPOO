import java.time.LocalDate;

public class Depense {
    private String description;
    private double montant;
    private Categorie categorie;
    private LocalDate date;

    public Depense(String description, double montant, Categorie categorie, LocalDate date) {
        this.description = description;
        this.montant = montant;
        this.categorie = categorie;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public double getMontant() {
        return montant;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public LocalDate getDate() {
        return date;
    }

    public enum Categorie {
        NOURRITURE_ET_RESTAURATION,
        TRANSPORT,
        DIVERTISSEMENT,
        SERVICES_PUBLICS,
        AUTRES
    }
}
