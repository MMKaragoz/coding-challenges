public class Solution {
    
    public int removeDuplicates(int[] nums) {
        int lengthOfArray = nums.length;
        
        if (lengthOfArray == 0) {
            return 0;
        }

        int uniqueCount = 0;

        for (int i = 1; i < lengthOfArray; i++) {
            if (nums[i] != nums[uniqueCount]) {
                uniqueCount++;
                nums[uniqueCount] = nums[i];
            }
        }

        return uniqueCount + 1;
    }
}
