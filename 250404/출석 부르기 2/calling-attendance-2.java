import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n;

        while(true) {

            n = sc.nextInt();

            if(n == 1)
                System.out.println("John");
            else if(n == 2)
                System.out.println("Tom");
            else if(n == 3)
                System.out.println("Paul");
            else if(n == 4)
                System.out.println("Sam");
            else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}