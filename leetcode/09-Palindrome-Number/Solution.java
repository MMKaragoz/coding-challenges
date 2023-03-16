public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalX = x;
        int reverseX = 0;
        
        while (x != 0) {
            int digit = x % 10;
            reverseX = reverseX * 10 + digit; 
            x /= 10;
        }
        return reverseX == originalX;
    }

}
