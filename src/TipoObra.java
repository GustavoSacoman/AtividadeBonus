public abstract class TipoObra {
    
    protected String tipo;

    public TipoObra(String tipo) {
        this.tipo = tipo;
    }




    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + ", ";
    }
}
