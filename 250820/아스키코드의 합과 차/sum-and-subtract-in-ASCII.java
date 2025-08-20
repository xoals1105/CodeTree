import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자를 입력받습니다.
        String s1 = sc.next();
        char a = s1.charAt(0);
        String s2 = sc.next();
        char b = s2.charAt(0);
        
        // 문자의 아스키코드를 구합니다.
        int aNum = (int)a;
        int bNum = (int)b;
        
        // 두 아스키코드 값의 합을 출력합니다.
        System.out.print((aNum + bNum) + " ");
        
        // 두 아스키코드 값의 차를 출력합니다.
        if(aNum > bNum) {
            System.out.println(aNum - bNum);
        }
        else {
            System.out.println(bNum - aNum);
        }
    }
}

