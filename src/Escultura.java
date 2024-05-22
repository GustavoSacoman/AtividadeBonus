public class Escultura extends TipoObra{
    
    private String material;
    private double tamanho;

    
    


    public Escultura(String tipo, String material, double tamanho) {
        super(tipo = "Escultura");
        this.material = material;
        this.tamanho = tamanho;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public double getTamanho() {
        return tamanho;
    }


    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    
    @Override
    public String toString() {
        return super.toString() + material + ", " + tamanho;
    }



}
