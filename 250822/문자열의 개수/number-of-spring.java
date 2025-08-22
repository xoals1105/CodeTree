import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[200];
        int cnt = 0;

        while(true)
        {
            arr[cnt] = scanner.next();

            if(arr[cnt].equals("0")) break;

            cnt++;
        }

        System.out.println(cnt);

        for(int i = 0; i < cnt; i+=2)
            System.out.println(arr[i]);
    }
}