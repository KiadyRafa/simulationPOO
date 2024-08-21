import java.time.LocalDate;

public class Depense {
    private String description;
    private double montant;
    private String categorie;
    private LocalDate date;

    public Depense(String description, double montant, String categorie, LocalDate date) {
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

    public String getCategorie() {
        return categorie;
    }

    public LocalDate getDate() {
        return date;
    }
}
