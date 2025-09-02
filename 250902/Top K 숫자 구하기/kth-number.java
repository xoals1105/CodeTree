import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int Findnum(int[] nums, int k)
    {
        int location = 0;
        Arrays.sort(nums);

        return nums[k - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println(Findnum(nums, k));
    }
}