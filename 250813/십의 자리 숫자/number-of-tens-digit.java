import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        int[] countArr = new int[10];

        for(int i = 0; i < 100; i++)
        {
            arr[i] = scanner.nextInt();
            if(arr[i] == 0) break;
            countArr[arr[i] / 10]++;           
        }

        for(int i = 1; i < 10; i++)
        {
            System.out.println(i + " - " + countArr[i]);
        }
    } 
}