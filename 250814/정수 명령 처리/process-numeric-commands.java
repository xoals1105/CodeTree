import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++)
        {
            String input = sc.next();
         
            switch(input)
            {
                case "push":
                    int num = sc.nextInt();
                    stack.push(num);
                    break;

                case "pop":
                    System.out.println(stack.pop());
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    System.out.println(stack.isEmpty() ? "1" : "0");
                    break;

                case "top":
                    System.out.println(stack.peek());
                    break;
            }
        }

    }
}