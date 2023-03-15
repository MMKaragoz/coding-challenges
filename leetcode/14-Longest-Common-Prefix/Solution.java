class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String longestCommonPrefix = new String("");

        longestCommonPrefix = strs[0];

        for(String str: strs) {
            while(!str.startsWith(longestCommonPrefix)) {
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
            }
        }

        return longestCommonPrefix;
    }

    
}