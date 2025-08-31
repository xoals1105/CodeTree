import java.util.Scanner;
public class Main {

    public static void Modify(int[] ModifyArr)
    {
        for(int i = 0; i < ModifyArr.length; i++)
        {
            if(ModifyArr[i] % 2 == 0)
                ModifyArr[i] /= 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[50];
        for(int i = 0; i < n; i++) 
            arr[i] = scanner.nextInt();
            
        Modify(arr); 

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}