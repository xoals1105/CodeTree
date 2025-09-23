import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] name = new char[n];
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next().charAt(0);
            score[i] = sc.nextInt();
        }


        int numA = 0;
        int numB = 0;
        int numC = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(name[i] == 'A')   
            {
                if(Hall(numA, numB, numC) != Hall(numA + score[i], numB, numC))
                    cnt++;
                
                // 값을 갱신해줍니다.
                numA += score[i];
            }

            else if(name[i] == 'B')
            {
                if(Hall(numA, numB, numC) != Hall(numA, numB + score[i], numC))
                    cnt++;
                
                // 값을 갱신해줍니다.
                numB += score[i];
            }
            else if(name[i] == 'C')  
            {
                if(Hall(numA, numB, numC) != Hall(numA, numB, numC + score[i]))
                    cnt++;
                
                // 값을 갱신해줍니다.
                numC += score[i];
            } 
        }
        System.out.println(cnt);
    }


    private static int Hall(int A, int B, int C)
    {
        if(A > B && A > C)
            return 1;
        else if(B > A && B > C)
            return 2;
        else if(C > A && C > B)
            return 3;
        else if(A == B && B == C)
            return 7;
        else if(A == B)
            return 4;
        else if(B == C)
            return 5;
        else if(C == A)
            return 6;

        return 0;
    }
}