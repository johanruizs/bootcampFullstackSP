
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        CodeGenerator();
    }


    public static void CodeGenerator(){

        String codeType;
        Scanner readType = new Scanner(System.in);
    
        System.out.print("Please type in your code type (a or b): ");
        codeType = readType.nextLine();
             
        String code;
    
        if (codeType.equalsIgnoreCase("A")){
            code = "54";
            for (int i=1; i<=8; i++) {
                    
                int number = (int)(Math.random()*10);
                String a = String.valueOf(number);
                    
                code = code + a;	
            }
            System.out.println(code);
    
            } else if (codeType.equalsIgnoreCase("B")){
                code = "08";
                for (int i=1; i<=8; i++) {
                   
                   int number = (int)(Math.random()*10);
                   String a = String.valueOf(number);
                   
                   code = code + a;	
               }
               System.out.println(code);
    
            } else {
    
                System.out.println("Your type code is invalid.");
    
            }
    
    }
}




