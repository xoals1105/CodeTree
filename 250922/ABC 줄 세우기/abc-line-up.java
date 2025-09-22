import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
    
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if((char)('A' + i) == arr[i])
                continue;

            char alphabet = (char)('A' + i);
            for(int j = 0; j < n; j++)
            {
                if(alphabet == arr[j])
                {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                    cnt += Math.abs(j - i);
                }
            }
        }

        System.out.println(cnt);
    }
}