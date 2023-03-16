public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        for(int i = 0, j = 0; j < n; i+=2, j++) {
            result[i] = nums[j]; 
            result[i+1] = nums[n+j];
        }

        return result;
    }
}
