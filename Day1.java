public class Day1{

    public static boolean hasDuplicate(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,5};
        System.out.println(hasDuplicate(nums));
    }
}