import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[10][10];
        for(int i = 0; i < 10; i++)
        {   
            String aa = sc.next();
            for (int j = 0; j < 10; j++) 
                board[i][j] = aa.charAt(j);
        }
        int numB_i = 0;
        int numB_j= 0;
        int numL_i= 0;
        int numL_j = 0;
        for(int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) 
            {
                if(board[i][j] == 'B')
                {
                    numB_i = i;
                    numB_j = j;
                }

                if(board[i][j] == 'L')
                {
                    numL_i = i;
                    numL_j = j;
                }
            }

        int num = Math.abs(numL_i - numB_i) + Math.abs(numL_j - numB_j) - 1;
        System.out.println(num);
    }
}