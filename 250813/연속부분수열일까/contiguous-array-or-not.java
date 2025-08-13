import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] a_arr = new int[a];
        int[] b_arr = new int[b];

        for(int i = 0; i < a; i++)
        {
            a_arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < b; i++)
        {
            b_arr[i] = scanner.nextInt();
        }

        boolean found = false;

        for(int i = 0; i <= a - b; i++)
        {
            int cnt = 0;

            for(int j = 0; j < b; j++)
            {
                if(a_arr[i + j] == b_arr[j])  
                    cnt++;                
                else
                    break;

    
            }

            if(cnt == b) 
            {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Yes" : "No");
    }
}