import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int maxVal = arr[0];

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
                cnt = i;
            }
        }
        int temp = arr[cnt];
        arr[cnt] = arr[0];
        arr[0] = temp;
        maxVal = arr[1];

        for(int i = 1; i < n; i++)
        {
            if(arr[i] > maxVal)
                maxVal = arr[i];            
        }
        arr[1] = maxVal;

        System.out.print(arr[0] + " " + arr[1]);
    }
}