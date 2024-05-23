import java.io.IOException;

public class Sistema {
    
    public static void sistema(){
        int op;

        do{
            interfaceUsuario();
            op = Console.lerInt("Selecione uma opcao: ");
            verificaOp(op);
        }while(op != 0);

    }

    public static void interfaceUsuario(){

        System.out.println("##Menu##");
        System.out.println("1-Cadastrar obra de arte");
        System.out.println("2-Buscar obra de arte");
        System.out.println("3-Listar todas as obras");
        System.out.println("4-Excluir obra de arte");
        System.out.println("0-Sair");
    }

    public static void verificaOp(int op){

        switch (op) {
            case 1:
            interfaceTipoObra();
            op = Console.lerInt("Escolha uma das opcoes: ");
            cadastraTipoObra(op);
                break;
            case 2:
           try{
            String temp = Console.lerString("Digite o titulo da obra para busca-la: ");
            ObraArte busca = GerenciamentoObras.buscaObra(temp);
            System.out.println("\nObra encontrada: " + busca );
           }
           catch(Exception e){
            System.out.println(e.getMessage());
           }
            break;
            
            case 3:
            try{
                for (ObraArte temp : GerenciamentoObras.listarObras()) {
                    System.out.println(temp);
                }
    
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                break;
                
            case 4:
            try{
            String temp = Console.lerString("Digite o titulo da obra exclui-la: ");
            GerenciamentoObras.excluirObra(temp);
           }
            catch(Exception e){
            System.out.println(e.getMessage());
           }
            break;
            case 0:
                System.out.println("Saindo.....");
                System.exit(0);
            break;
            default:
            System.out.println("Opcao invalida, digite novamente!");
                break;
        }
    }
    public static void interfaceTipoObra(){

        System.out.println("##Menu tipo de obra##");
        System.out.println("1-Pintura");
        System.out.println("2-Escultura");
        System.out.println("3-Fotografia");
        System.out.println("0-Sair");
    }
    public static void cadastraTipoObra(int op){

        switch (op) {
            case 1:
                String titulo = Console.lerString("Digite o titulo da pintura: ");
                String artista = Console.lerString("Digite o nome do artista da pintura: ");
                String medium = Console.lerString("Digite o medium da pintura: ");
                String estilo = Console.lerString("Digite o estilo da pintura: ");
                String localizacao = Console.lerString("Digite a localizacao da pintura: ");
                int anoCriacao = Console.lerInt("Digite o ano de criacao da pintura: ");

                Pintura p = new Pintura("Pintura",medium, estilo);
                try{
                    ObraArte ob = new ObraArte(titulo, artista, p, localizacao, anoCriacao);
                    GerenciamentoObras.adicionarObra(ob);
                }catch(IOException e){
                    System.out.println(e.getMessage());
                }

                break;
            case 2:
                 titulo = Console.lerString("Digite o titulo da escultura: ");
                 artista = Console.lerString("Digite o nome do artista da escultura: ");
                String material = Console.lerString("Digite o material da escultura: ");
                double tamanho = Console.lerDouble("Digite o tamanho da escultura(em cm): ");
                localizacao = Console.lerString("Digite a localizacao da escultura: ");
                anoCriacao = Console.lerInt("Digite o ano de criacao da escultura: ");

                Escultura e = new Escultura("Escultura",material, tamanho);
                try{
                    ObraArte ob = new ObraArte(titulo, artista, e, localizacao, anoCriacao);
                    GerenciamentoObras.adicionarObra(ob);
                }catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
                break;
                case 3:

                titulo = Console.lerString("Digite o titulo da fotografia");
                artista = Console.lerString("Digite o nome do artista da fotografia: ");
                String tipoFoto = Console.lerString("Digite o tipo de foto: ");
                String camera = Console.lerString("Digite a camera que foi feita a fotografia: ");
                localizacao = Console.lerString("Digite a localizacao da fotografia: ");
                anoCriacao = Console.lerInt("Digite o ano de criacao da fotografia: ");

                Fotografia f = new Fotografia("Fotografia", tipoFoto, camera);

                try{
                    ObraArte ob = new ObraArte(titulo, artista, f, localizacao, anoCriacao);
                    GerenciamentoObras.adicionarObra(ob);
                }catch(IOException exc){
                    System.out.println(exc.getMessage());
                }
                break;
            default:
            System.out.println("\nOpção inválida Digite novamente:");
            break;
                
}

    }
}