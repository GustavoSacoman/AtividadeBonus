public class Pintura extends TipoObra {
    
    private String medium;
    private String estilo;

        
    


    public Pintura(String tipo, String medium, String estilo) {
        super(tipo = "Pintura");
        this.medium = medium;
        this.estilo = estilo;
    }

    public String getMedium() {
        return medium;
    }
    public void setMedium(String medium) {
        this.medium = medium;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

   
    @Override
    public String toString() {
        return super.toString() + medium + ", " + estilo;
    }

}
