import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[10];
        boolean found = false;
        for(int i = 0; i < 10; i++)
            arr[i] = scanner.next();

        char c = scanner.next().charAt(0);

        for(int i = 0; i < 10; i++)
        {
            int length = arr[i].length();

            if(arr[i].charAt(length - 1) == c)
            {
                System.out.println(arr[i]);
                found = true;
            }
        }

        if(found == false)
            System.out.println("None");
    }
}