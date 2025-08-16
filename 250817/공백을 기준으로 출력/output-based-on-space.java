import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String first_str = scanner.nextLine();
        String second_str = scanner.nextLine();

        for(int i = 0; i < first_str.length(); i++)
        {
            if(first_str.charAt(i) != ' ')
                System.out.print(first_str.charAt(i));
        }

        for(int i = 0; i < second_str.length(); i++)
        {
            if(second_str.charAt(i) != ' ')
                System.out.print(second_str.charAt(i));
        }
    }
}