import java.util.Scanner;
public class Main {

    public static final int MAX_N = 100;

    public static char[] arr = new char[MAX_N + 1];

    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);

            arr[position] = ch;
        }

        int answer = 0;
        for(int i = 0; i <= MAX_N; i++)
        {          
            for(int j = i + 1; j <= MAX_N; j++)
            {
                if(arr[i] == 0 || arr[j] == 0)
                    continue;
            
                int cntG = 0;
                int cntH = 0;

                for(int k = i; k <= j; k++) 
                {
                    if(arr[k] == 'H')
                        cntH++;
                    if(arr[k] == 'G')
                        cntG++;
                }

                if(cntG == 0 || cntH == 0 || cntG == cntH)
                {
                    int sum = j - i;
                    answer = Math.max(sum, answer);
                }
            }
        }

        System.out.println(answer);
    }
}