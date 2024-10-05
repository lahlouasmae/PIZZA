package pizza.asmae.ma.pizzarecipes.classes;

import java.io.Serializable;

public class Produit implements Serializable {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detaisingred;
    private String description;
    private String preparation;
    private static int comp;

    public Produit( String nom, int nbrIngredients, int photo, String duree, String detaisingred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisingred = detaisingred;
        this.description = description;
        this.preparation = preparation;

    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetaisingred() {
        return detaisingred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public static int getComp() {
        return comp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetaisingred(String detaisingred) {
        this.detaisingred = detaisingred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public static void setComp(int comp) {
        Produit.comp = comp;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detaisingred='" + detaisingred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
