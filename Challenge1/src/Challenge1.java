
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        CodeGenerator();

        List<String> list = Arrays.asList("Mango", "Lulo", "Pera"); 
		String word = "mora";	
		
		System.out.println(isInIt(list, word));
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

    public static boolean isInIt(List<String> list,String word) {
	    for(String words: list){
	        if (words.equalsIgnoreCase(word)) {
	        	return false;
	        }
	    }
	    return true; 
	}
}




