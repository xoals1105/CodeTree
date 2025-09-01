import java.util.Scanner;

class IntWrapper
{
    int value;
 

    public IntWrapper(int value)
    {
        this.value = value;
        this.value = value;
    }
}

public class Main {

    public static void Calculation(IntWrapper a, IntWrapper b)
    {
        if(a.value > b.value)
        {
            b.value += 10;
            a.value *= 2;
        }
        else
        {
            a.value += 10;
            b.value *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_a = sc.nextInt();
        int input_b = sc.nextInt();
    
        IntWrapper a = new IntWrapper(input_a);
        IntWrapper b = new IntWrapper(input_b);
        Calculation(a, b);

        System.out.println(a.value + " " + b.value);
    }
}