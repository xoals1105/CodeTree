import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int XRepetition = 0;       

       
            for (int i = n; i > 0; i--)
            {
                while (XRepetition < i)
                {
                    for (int j = 0; j < i; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                    XRepetition++;
                }
                System.out.println();             
                XRepetition = 0;      
            }        
    }
}