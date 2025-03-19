import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
    // Read the number of integers N
        int n = sc.nextInt();
        
        // Loop through the next N integers
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            // Check if the number is odd
            if (num % 2 != 0 && num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}