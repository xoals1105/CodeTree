import java.util.Scanner;
public class Main {

    public static int[] arr = new int[100];

    public static int Calculation(int n)
    {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)    max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Calculation(n));
    }
}