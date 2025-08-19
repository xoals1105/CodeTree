import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[2];
        String first_string = "";
        String second_string = "";

        for(int i = 0; i < 2; i++)
            arr[i] = scanner.next();

        for(int i = 0; i < 2; i++)
        {
            first_string += arr[i];
            second_string += arr[1-i];
        }

        if(first_string.equals(second_string)) System.out.println("true");
        else System.out.println("false");
    }
}