import java.util.Scanner;

class IntWrapper
{
    int value;

    public IntWrapper(int value)
    {
        this.value = value;
    }
}


public class Main {

    public static void Swap(IntWrapper n, IntWrapper m)
    {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;     

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int inputFirst = sc.nextInt();
        int inputsecond = sc.nextInt();
        IntWrapper n = new IntWrapper(inputFirst);
        IntWrapper m = new IntWrapper(inputsecond);
       
        Swap(n, m);
        System.out.println(n.value + " " + m.value);
    }
}