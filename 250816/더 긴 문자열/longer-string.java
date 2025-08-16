import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String first_string = scanner.next();
        String second_string = scanner.next();

        if(first_string.length() > second_string.length()) 
            System.out.println(first_string + " " + first_string.length());
        else if(first_string.length() == second_string.length()) 
            System.out.println("same");
        else
            System.out.println(second_string + " " + second_string.length());
            
    }
}