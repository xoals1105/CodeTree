import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] countArr = new int[10];
        int sum = 0;

        while(a > 1)
        {    
            countArr[a % b]++;    
            a = a / b;     
        }

        for(int i = 0; i < 10; i++)
        {
            sum += countArr[i] * countArr[i];
        }

        System.out.print(sum);
    }
}