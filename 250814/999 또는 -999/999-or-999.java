import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        int minVal = INT_MAX;
        int maxVal = INT_MIN;

        int[] arr = new int[100];
        for(int i = 0; i < 100; i++)
        {
            arr[i] = scanner.nextInt();

            if(arr[i] == -999 || arr[i] == 999) break;
            if(arr[i] > maxVal) maxVal = arr[i];
            if(arr[i] < minVal) minVal = arr[i];
        }
        System.out.println(maxVal + " " + minVal);
    
    }
}