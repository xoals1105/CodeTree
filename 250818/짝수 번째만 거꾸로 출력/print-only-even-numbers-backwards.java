import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int len = string.length();
        for(int i = len - 1; i >= 0; i--)
        {
           
                if(i % 2 != 0)
                    System.out.print(string.charAt(i));
        

        }
    }
}