import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void AscendingOrder(int[] arr)
    {
        Arrays.sort(arr);
    }

    public static Integer[] DescendingOrder(int[] arr)
    {
        Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr1, Collections.reverseOrder());

        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        AscendingOrder(arr);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();
        Integer[] arr1 = DescendingOrder(arr);
        for(int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
    }
}