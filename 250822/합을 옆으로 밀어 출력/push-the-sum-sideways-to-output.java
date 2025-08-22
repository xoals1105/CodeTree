import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < count; i++)
        {
            int num = scanner.nextInt();
            sum += num;
        }

        String string = Integer.toString(sum);
        int length = string.length();   
        string = string.substring(1, length) + string.substring(0, 1);

        System.out.println(string);    
    }
}