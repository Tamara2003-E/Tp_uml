public class Adresse {
    private int numero ;
    private String rue ;
    private String codePostal;
    private String ville ;
    
    public Adresse (int numero,String rue,String codePostal,String ville)
    {
        this.codePostal = codePostal;
        this.numero=numero;
        this.rue=rue;
        this.ville = ville;
        
    }


    @Override
    public String toString() {
        return numero + rue + codePostal + ville;
    }
}
