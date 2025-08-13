import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int[] elementArr = new int[n];
        int[] one_questionArr = new int[q];
        int[] two_questionArr = new int[q];
        int[] three_questionArr = new int[q];


        for(int i = 0; i < n; i++)
        {
            elementArr[i] = scanner.nextInt();
        }

        for(int i = 0; i < q; i++)
        {
            int index = -1;

            one_questionArr[i] = scanner.nextInt();
            two_questionArr[i] = scanner.nextInt();
            
            switch(one_questionArr[i])
            {
                case 1:
                    System.out.println(elementArr[two_questionArr[i] - 1]);
                    break;

                case 2:
                    for(int j = 0; j < n; j++)
                    {
                        if(elementArr[j] == two_questionArr[i]) 
                        {
                            index = j + 1;
                            break;
                        }
                    }

                    if(index == -1) System.out.println("0");
                    else System.out.println(index);
                    break;
                    
                case 3:
                    three_questionArr[i] = scanner.nextInt();

                    for(int j = two_questionArr[i]; j <= three_questionArr[i]; j++)
                    {
                        System.out.print(elementArr[j - 1] + " ");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}