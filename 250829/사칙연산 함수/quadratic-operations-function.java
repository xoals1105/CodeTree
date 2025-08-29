import java.util.Scanner;
public class Main {

    public static int Plus(int a, int b)
    {
        return a + b;
    }

    public static int Minus(int a, int b)
    {
        return a - b;
    }
    
    public static int Multiplication(int a, int b)
    {
        return a * b;
    } 

    public static int Division(int a, int b)
    {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int b = sc.nextInt();
        boolean find = true;       
        switch(o)
        {
            case '+':
                System.out.println(a + " " + o + " " + b + " = " + Plus(a, b));
                find = false; 
                break;
            case '-':
                System.out.println(a + " " + o + " " + b + " = " + Minus(a, b));
                find = false; 
                
                break;
            case '*':
                System.out.println(a + " " + o + " " + b + " = " + Multiplication(a, b));
                find = false; 
                
                break;
            case '/':
                System.out.println(a + " " + o + " " + b + " = " + Division(a, b));
                find = false; 
                
                break; 
        }

        if(find) System.out.println("False");
    }
}