import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String FindString(String[] words, int k, String t)
    {
        int cnt = 0;

        for(int i = 0; i < words.length; i++)
        {
            if(words[i].substring(0, t.length()).equals(t)) cnt++;
            if(cnt == k) return words[i];    
        }

        return "NotFound";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        Arrays.sort(words);
        System.out.println(FindString(words, k, t));
    }
}