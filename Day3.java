import java.util.Arrays;
import java.util.HashMap;

public class Day3 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 1, 4, 8, 3};
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }
}