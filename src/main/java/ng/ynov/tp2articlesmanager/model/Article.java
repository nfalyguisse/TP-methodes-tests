package ng.ynov.tp2articlesmanager.model;

public class Article {
    private Long id;
    private String nom;
    private double prix;

    public Article(Long id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public Long getId() { return id; }
    public String getNom() { return nom; }
    public double getPrix() { return prix; }

    public void setId(Long id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrix(double prix) { this.prix = prix; }
}
