public class Fotografia extends TipoObra {  

    private String tipoFoto;
    private String camera;

    public Fotografia(String tipo, String tipoFoto, String camera) {
        super(tipo = "Fotografia");
        this.tipoFoto = tipoFoto;
        this.camera = camera;
    }

    public String getTipoFoto() {
        return tipoFoto;
    }

    public void setTipoFoto(String tipoFoto) {
        this.tipoFoto = tipoFoto;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return super.toString() + tipoFoto + ", " + camera;
    }

}
