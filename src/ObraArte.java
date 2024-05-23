/**
 * ObraArte
 */
public class ObraArte {
    
    private String titulo;
    private String artista;
    private TipoObra tipoObra;
    private String localizacao;
    private int anoCriacao;
    
    
    public ObraArte(String titulo, String artista, TipoObra tipoObra, String localizacao, int anoCriacao) {
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

    public TipoObra getTipoObra() {
        return tipoObra;
    }


    public void setTipoObra(TipoObra tipoObra) {
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
        
        String titulo = dadosObra[0];
        String artista = dadosObra[1];
        String tipo = dadosObra[2];
        String localizacao = dadosObra[5];
        int anoCriacao = Integer.parseInt(dadosObra[6]);

        TipoObra tipoObra = null;
        switch(tipo.toLowerCase()){
            case "pintura":
            String medium = dadosObra[3];
            String estilo = dadosObra[4];
            tipoObra = new Pintura(tipo, medium, estilo);
            break;
            case "escultura":
            String material = dadosObra[3];
            double tamanho = Double.parseDouble(dadosObra[4]);
            tipoObra = new Escultura(tipo,material, tamanho);
            break;
            case "fotografia":
            String tipoFoto = dadosObra[3];
            String camera = dadosObra[4];
            tipoObra = new Pintura(tipo, tipoFoto, camera);
            break;
            default:
            throw new IllegalArgumentException("\nTipo de obra desconhecido" + tipo);
        }
        return new ObraArte(titulo, artista, tipoObra, localizacao, anoCriacao);




    }
    
    }
    
