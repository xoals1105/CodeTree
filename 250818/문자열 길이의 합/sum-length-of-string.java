import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.next();
            sum += arr[i].length();

            if(arr[i].charAt(0) == 'a')
                cnt++;
        }
        System.out.println(sum + " " + cnt);
        
    }
}