import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
    
        int[] seatArr = new int[n];
        for(int i = 0; i < seat.length(); i++)
            seatArr[i] = seat.charAt(i) - '0';

        int maxLocation = iii(seatArr);

        System.out.println(maxLocation);
    }

    private static int iii(int[] seatArr)
    {
        int length = seatArr.length;
        int answer = 0;
        for(int i = 0; i < length; i++)
        {
            int location = 0;
            int aa = 20;
            boolean find = false;
            for(int j = 0; j < length; j++)
            {
                if(i == j)
                    continue;
               
                if(seatArr[i] == 0)
                    if(seatArr[j] == 1)
                    {
                        find = true;
                        aa = Math.min(aa, Math.abs(j - i));
                        // System.out.println(answer);
                    }
            }

            if(find)
                answer = Math.max(aa, answer);
            
        }

        return answer;
    }
}