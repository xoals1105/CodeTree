import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int q = scanner.nextInt();
        int len = string.length();

        for(int i = 0; i < q; i++)
        {
            int num = scanner.nextInt();

            switch(num)
            {
                case 1:
                    string = string.substring(1, len) + string.substring(0, 1);
                    System.out.println(string);
                    break;

                case 2:
                    string = string.substring(len - 1, len) + string.substring(0, len - 1);
                    System.out.println(string); 
                    break;

                case 3:
                    char[] arr = string.toCharArray();

                    for(int j = 0; j < len / 2; j++)
                    {
                        char temp = arr[len - j - 1];
                        arr[len - j - 1] = arr[j];   
                        arr[j] = temp;
                    }

                    string = String.valueOf(arr);
                    System.out.println(string);
                    break;
            }
        }
    }
}