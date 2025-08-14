import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        int num = 1;

        for(int i = n - 1; i >= 0; i--)
        {
            for(int j = n - 1; j >= 0; j--)
            {
                if(n % 2 == 0)
                {
                   if(i % 2 == 0)
                        arr[n - j - 1][i] = num;
                     else
                         arr[j][i] = num;
                }
                
                else
                {
                    if(i % 2 == 0)
                        arr[j][i] = num;
                    else
                        arr[n - j - 1][i] = num;
                }
                num++;
            }
            
        } 

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}