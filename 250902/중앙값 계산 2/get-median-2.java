import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int location = 1;

    public static int FindOddMedian(int[] arr, int location)
    {
        Arrays.sort(arr, 0, location);
        if(location == 1) return arr[0];
        else return(arr[location / 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        while(location <= arr.length)
        {
            System.out.print(FindOddMedian(arr, location) + " ");
            location += 2;
        }
    }
}