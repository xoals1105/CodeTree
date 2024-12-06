import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sex, age;

        sex = sc.nextInt();
        age = sc.nextInt();

        if (sex == 0) {
            if(age >= 19)
                System.out.println("MAN");
            else
                System.out.println("BOY");
        }

        else (sex == 1) {
            if(age >= 19)
                System.out.println("WOMAN");
            else
                System.out.println("GIRL");
        }


    }
}