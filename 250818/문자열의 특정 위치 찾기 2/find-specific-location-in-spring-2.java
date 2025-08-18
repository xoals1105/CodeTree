import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String[] fruit_arr = new String[] {"apple", "banana", "grape", "blueberry", "orange"};
        char find_char = scanner.next().charAt(0) ;
        int i = 0;
        int cnt = 0;

        while(i != 5)
        {
            if(fruit_arr[i].charAt(2) == find_char)
            {
                System.out.println(fruit_arr[i]);
                cnt++;
            }
            if(fruit_arr[i].charAt(3) == find_char)
            {    
                System.out.println(fruit_arr[i]);
                cnt++;
            }
            i++;
        }

        System.out.println(cnt);
    }
}