import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static String word1 = "";
    public static String word2 = "";

    public static boolean equals()
    {
        if(word1.equals(word2)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        word1 = sc.next();
        word2 = sc.next();

        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();

        Arrays.sort(word1Char);
        Arrays.sort(word2Char);

        word1 = String.valueOf(word1Char);
        word2 = String.valueOf(word2Char);
        
        System.out.println(equals() ? "Yes" : "No");
    }
}