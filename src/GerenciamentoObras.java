import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciamentoObras {
    
    private static final String ARQUIVO = "obras.txt";



    public static void adicionarObra(ObraArte obraArte) throws IOException{

        try(FileWriter fw = new FileWriter(ARQUIVO,true);
            BufferedWriter bw = new BufferedWriter(fw)) {

                bw.write(obraArte + "\n");

            }
    }

    public static ArrayList<ObraArte> listarObras() throws IOException, Exception{

        ArrayList<ObraArte> listarObras = new ArrayList<>();

        try(FileReader fr = new FileReader(ARQUIVO);
        BufferedReader br = new BufferedReader(fr)) {

            String linha;

            while ((linha = br.readLine()) != null) {

                
                ObraArte obra = ObraArte.fromString(linha);
                listarObras.add(obra);

            }

            }
            if(listarObras.isEmpty()){
                throw new Exception("\n Nao ha obras cadastradas");

            }

            return listarObras;
    }
    
    
   public static ObraArte buscaObra(String titulo) throws Exception{

        ArrayList<ObraArte> lista = listarObras();

        for(ObraArte temp : lista){
            if (temp.getTitulo().equals(titulo)){
                return temp;
            }
                
            
        }
        throw new Exception("\nObra de arte com o titulo " + titulo + " nao foi encontrado!!");

        
    }

    public static void excluirObra(String titulo) throws Exception{

        ArrayList<ObraArte> listaTemp = listarObras();
        boolean encontrado = false;
        for(ObraArte temp : listaTemp){
            if(temp.getTitulo().equals(titulo)){
           
                ObraArte a = temp;
                listaTemp.remove(a);
                encontrado = true;
                break;
            }
            
        }
        if(!encontrado){
            throw new Exception("A obra de arte com o titilo " + titulo + " nao foi localizada!");
        }

        try(FileWriter fw = new FileWriter(ARQUIVO);
            BufferedWriter bw = new BufferedWriter(fw)){

                for(ObraArte temp : listaTemp){
                bw.write(temp + "\n");
                }
            }
    }
}
