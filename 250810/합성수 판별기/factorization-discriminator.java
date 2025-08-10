import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finder = false;
        // 변수 입력 선언 
        int num;
        num = scanner.nextInt();
        
        for (int i = 2; i < (num - 1); i++)
        {
            if(num % i == 0)
            {
                finder = true;
                break;
            }
        }
        
        if (finder == true) System.out.println("C");

        else System.out.println("N");

    }
}