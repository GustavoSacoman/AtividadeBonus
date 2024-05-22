/**
 * ObraArte
 */
public class ObraArte {
    
    private String titulo;
    private String artista;
    private String tipoObra;
    private String localizacao;
    private int anoCriacao;

    
    public ObraArte(String titulo, String artista, String tipoObra, String localizacao, int anoCriacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.tipoObra = tipoObra;
        this.localizacao = localizacao;
        this.anoCriacao = anoCriacao;
    }



    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getTipoObra() {
        return tipoObra;
    }
    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public int getAnoCriacao() {
        return anoCriacao;
    }
    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public String toString() {
        return titulo + ", " + artista + ", " + tipoObra + ", " + localizacao + ", " + anoCriacao;
    }

    public static ObraArte fromString(String linha) {

        String[] dadosObra = linha.split(", ");

        return new ObraArte(dadosObra[0], 
        dadosObra[1], 
        dadosObra[2],
        dadosObra[3],
        Integer.parseInt(dadosObra[4]));

    }
    
}