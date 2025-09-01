import java.util.Scanner;
public class Main {

    public static boolean isPalindrome(String input)
    {
        String oppositeString = "";
        for(int i = input.length() - 1; i >= 0; i--)
            oppositeString += input.charAt(i);
        
        if(oppositeString.equals(input)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        System.out.println(isPalindrome(input) ? "Yes" : "No");
    }
}