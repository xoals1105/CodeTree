import java.util.Scanner;
public class Main {

    public static boolean isAnotherString(String A)
    {
        for(int i = 0; i < A.length() - 1; i++)
        {
            if(A.charAt(i) != A.charAt(i + 1)) 
                return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
    
        if(isAnotherString(A)) System.out.println("Yes");
        else System.out.println("No");
    }
}