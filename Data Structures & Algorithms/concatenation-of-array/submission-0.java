class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
    // Set value at the first half
        ans[i] = nums[i];
    // Set value at the second half using the offset
        ans[i + n] = nums[i];
        
}
return ans;
    }
}