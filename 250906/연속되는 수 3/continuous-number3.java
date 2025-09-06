import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int a = 1, b = 1, length = 1;

        for(int i = 1; i < arr.length; i++)
        {
            if((arr[i] > 0) && (arr[i - 1] > 0))
                a++; 
            else a = 1;     
            if ((arr[i] < 0) && (arr[i - 1] < 0))
                b++;
            else b = 1;


            length = Math.max(length, Math.max(a, b));
        }

        System.out.println(length);
    }
}