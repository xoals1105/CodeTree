import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        String nString = Integer.toString(n);
        int length = nString.length();

        for(int i = 0; i < length; i++)
        {
            sum += Integer.parseInt(String.valueOf(nString.charAt(i)));
        }

        System.out.println(sum);
    }
}