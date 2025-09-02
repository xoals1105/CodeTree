import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int Group(int[] nums)
    {
        int max = 0;
        for(int i = 0; i < nums.length / 2; i++)
        {
            if(nums[i] + nums[nums.length - 1 - i] > max) 
                max = nums[i] + nums[nums.length - 1 - i];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.println(Group(nums));
    }
}