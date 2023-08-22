import java.util.Arrays;

public class Easy169 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        Easy169 easy169 = new Easy169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums1 = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(easy169.majorityElement(nums1));
    }
}
