import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);

        String s = scanner.next();
        boolean found_fisrt = false;
        boolean found_second = false;

        int len = s.length();

        if(s.contains("ee"))    found_fisrt = true;
        if(s.contains("ab"))    found_second = true;
        
        System.out.print(found_fisrt ? "Yes" : "No");
        System.out.print(" ");
        System.out.print(found_second ? "Yes" : "No");
    }
}