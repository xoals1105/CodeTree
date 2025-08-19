import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String fisrtString = scanner.next();
        String secondString = scanner.next();

        char[] fisrtArr = fisrtString.toCharArray();
        char[] secondArr = secondString.toCharArray();

        secondArr[0] = fisrtArr[0];
        secondArr[1] = fisrtArr[1];

        fisrtString = String.valueOf(fisrtArr);
        secondString = String.valueOf(secondArr);

        System.out.println(secondString);
    }
}