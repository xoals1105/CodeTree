import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        int minVal = INT_MAX;
        int maxVal = INT_MIN;
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++)
        {
            arr[i] = scanner.nextInt();

            if(arr[i] > maxVal && arr[i] < 500)
                maxVal = arr[i];
            if(arr[i] < minVal && arr[i] > 500)
                minVal = arr[i];
        }

        System.out.println(maxVal + " " + minVal);
    }
}