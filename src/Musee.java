public class Musee {
    private final String nom;
    Adresse adresse ;

    public Musee(String nom,int numero,String rue,String codePostal,String ville) {
        this.nom = nom;
        this.adresse = new Adresse(numero,rue,codePostal,ville);
    }



    @Override
    public String toString() {
        return "Musee : " + nom + adresse;
    }

    public String getNom() {
        return nom;
    }
}
