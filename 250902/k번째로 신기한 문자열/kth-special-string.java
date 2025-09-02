import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String FindString(String[] words, int k, String t)
    {
        int cnt = 0;
        String[] tStartingString = new String[words.length];

        for(int i = 0; i < (int)words.length; i++)
        {
            if(words[i].substring(0, t.length()).equals(t))
            {
                tStartingString[cnt] = words[i];
                cnt++;
            }   
        }

        Arrays.sort(tStartingString, 0, cnt);

        return tStartingString[k - 1];
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
        
        System.out.println(FindString(words, k, t));
    }
}