import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int length = string.length();
        int cnt_fisrt = 0;
        int cnt_second = 0;

        for(int i = 0; i < length - 1; i++)
        {
            if(string.substring(i, i + 2).equals("ee")) cnt_fisrt++;
            if(string.substring(i, i + 2).equals("eb")) cnt_second++;
        }

        System.out.println(cnt_fisrt + " " + cnt_second);
    }
}