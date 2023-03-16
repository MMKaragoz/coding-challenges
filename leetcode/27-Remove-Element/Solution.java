public class Solution {

    public int removeElement(int[] nums, int val) {
        int lengthOfArray = nums.length;
        
        if (lengthOfArray == 0) {
            return 0;
        }

        int count = 0;

        for(int i = 0; i < lengthOfArray; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
