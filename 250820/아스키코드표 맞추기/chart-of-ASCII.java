import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
            System.out.print((char) arr[i] + " ");
        }
    }
}