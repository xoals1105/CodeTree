import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int q = scanner.nextInt();
        char[] arr = s.toCharArray();

        for(int i = 0; i < q; i++)
        {
            int num = scanner.nextInt();

            switch (num)
            {
                case 1:
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();

                    char temp = arr[b - 1];
                    arr[b - 1] = arr[a - 1];
                    arr[a - 1] = temp;

                    break;

                case 2:
                    char x = scanner.next().charAt(0);
                    char y = scanner.next().charAt(0);

                    for(int j = 0; j < arr.length; j++)
                    {
                        if(arr[j] == x) arr[j] = y;
                    }

                    break;
            }

            s = String.valueOf(arr);
            System.out.println(s);
        }
    }
}