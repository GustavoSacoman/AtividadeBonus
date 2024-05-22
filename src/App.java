

public class App {
    public static void main(String[] args) throws Exception {
       
        Pintura p = new Pintura("AA", "BBBB","CCCC");
        
        try{
            ObraArte ob = new ObraArte("aaa","aaaaaa",p,"asdad",2015);
            GerenciamentoObras.adicionarObra(ob);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            for (ObraArte temp : GerenciamentoObras.listarObras()) {
                System.out.println(temp);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
        
    }
}
