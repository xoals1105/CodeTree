import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        char[] arr = string.toCharArray();

        for(int i = 2; i < arr.length; i++)
        {
            if(arr[1] == arr[i]) arr[i] = arr[0];
        }

        arr[1] = arr[0];
        string = String.valueOf(arr);

        System.out.println(string);
    }
}