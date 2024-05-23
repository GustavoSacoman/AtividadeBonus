import java.util.Scanner;

public class Console {
    
    public static Scanner scanner = new Scanner(System.in);

    public static int lerInt(String msg){
        
        int temp;
        while (true) {
            
        try{
            System.out.print(msg);
           temp = scanner.nextInt();
            break;
        }catch(NumberFormatException e){
            System.out.println("Numero invalido, tente novamente!");
        }finally{
          scanner.nextLine();
        }
    }
        return temp;
    }

    public static double lerDouble(String msg){
        double temp = 0;
        while (true) {
    
        try{
            System.out.print(msg);
            temp = scanner.nextDouble();
            break;
        }catch(Exception e){
            System.out.println("Valor invalido, tente novamente!");
        }finally{
            scanner.nextLine();
        }
        
    }
        return temp;
    
}

    public static String lerString(String msg){

        System.out.print(msg);
        return scanner.nextLine();
    }
}