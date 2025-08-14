import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MIN = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        int maxVal = INT_MIN;
        int testNum = 0;   
        int end = 0;
        int n = scanner.nextInt();
        int location = n;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        while(end >= 0)
        {
            maxVal = INT_MIN;
        for(int i = 0; i < location; i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
                testNum = arr[i];
            }
        }

        int cnt = 0;
        location = 0;
        for(int j = 0; j < n; j++)
        {   
            if(arr[j] == testNum)
            {
                 cnt++;
                if(cnt == 2) 
                {
                    System.out.print(location + 1 + " ");
                    end = j - 2;
                    break; 
                }
               
                location = j;
            } 
            
        }
         if(cnt == 1)
        {
            System.out.print(location + 1 + " "); 
            end = location - 1;
            break;
        }   
        }
    }
}