import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);

            char[] symptomArr = new char[3];
            int[] temperatureArr = new int[3];
            int[] countArr = new int[4];

            for(int i = 0; i < 3; i++)
            {
                symptomArr[i] = scanner.next().charAt(0);
                temperatureArr[i] = scanner.nextInt();

                if (symptomArr[i] == 'Y' && temperatureArr[i] >= 37) countArr[0]++;
                else if (symptomArr[i] == 'N' && temperatureArr[i] >= 37) countArr[1]++;
                else if (symptomArr[i] == 'Y' && temperatureArr[i] < 37) countArr[2]++;
                else countArr[3]++;               
            }

            for(int i = 0; i < 4; i++)
            {
                System.out.print(countArr[i] + " ");
            }

            if(countArr[0] == 2)
                System.out.print("E");
    }
}