public class Day1{

    public static boolean hasDuplicate(int[] nums) {

        for(int i = 1; i < nums.length; i++){
            int temp = nums[0];
            if(temp != nums[i]){
                temp = nums[i];
            }else{
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,5,1,2,3};
        System.out.println(hasDuplicate(nums));
    }
}