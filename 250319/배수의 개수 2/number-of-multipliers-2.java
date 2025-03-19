import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;
        int a = 0;


        // 출력
        for(int i = 0; i < 10; i++) {
            n = sc.nextInt();

            if(n % 2 == 1){
                a += 0;
                a++;
            }
      
         
        }
        System.out.print(a);
    }
}