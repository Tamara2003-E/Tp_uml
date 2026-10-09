public class Musee {
    private final String nom;

    public Musee(String nom)
    {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Musee : " + nom ;
}

    public String getNom() {
        return nom;
    }
