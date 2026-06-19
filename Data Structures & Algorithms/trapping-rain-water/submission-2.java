class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftM=0;
        int rightM=0;
        int water=0;
        while(left<right)
        {
            //int area=height[left]*height[right];
            
            if(height[left]<height[right])
            {
                if(height[left]>=leftM)
                {
                    leftM=height[left];
                }
                else
                {
                    water+=leftM-height[left];
                }
                left++;
            }
            else
            {
                if(height[right]>=rightM)
                {
                    rightM=height[right];
                }
                else
                {
                    water+=rightM-height[right];
                }
                right--;
            }
        }
        return water;
    }
}
