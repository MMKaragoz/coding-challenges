class Solution {
    public int reverse(int x) {
        int result = 0;
        
        int signed = 1;

        if (x >= (Math.pow(2, 31) - 1) || x <= Math.pow(-2, 31)) return 0;

        if (x < 0) {
            signed = -1;
            x = Math.abs(x);
        }

        int digit = (int) Math.log10(x) + 1;
        
        while (x > 0) {
            int lastDigit = x % 10;
            x /= 10;
            result += lastDigit * Math.pow(10, digit-1);
            digit--;  
        }
        result *= signed;

        if (result >= (Math.pow(2, 31) - 1) || result <= Math.pow(-2, 31) + 1) return 0;

        return result;
    }
}