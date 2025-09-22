import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] personArr = new int[3];

        for(int i = 0; i < 3; i++)
            personArr[i] = sc.nextInt();

        Arrays.sort(personArr);

        int cnt = 0;
        while(true)
        {
            if(personArr[0] + 1 == personArr[1] && personArr[1] + 1 == personArr[2])
                break;
            
            int temp = personArr[1] - 1;
            personArr[2] = personArr[1];
            personArr[1] = temp;

            cnt++;
        }

        System.out.println(cnt);
    }
}