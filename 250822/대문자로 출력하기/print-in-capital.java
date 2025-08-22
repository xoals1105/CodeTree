import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int len = string.length();

        char[] arr = string.toCharArray();

        for(int i = 0; i < len; i++)
        {
            if(arr[i] >= 'a' && arr[i] <= 'z') System.out.print((char) (arr[i] - 'a' + 'A'));
            else if(arr[i] >= 'A' && arr[i] <= 'Z') System.out.print(arr[i]);
        }
    }
}