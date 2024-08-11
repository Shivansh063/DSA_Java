//Question Link : https://leetcode.com/problems/sort-colors/description/?source=submission-ac
/*Problem Description : Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,    with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.*/

public void sortColors(int[] nums) {
        if(nums.length > 1){
            int size = nums.length;
            int zeroNum = 0;
            int oneNum = 0;
            for(int i=0;i<size;i++){
                if(nums[i]==0 ){
                    zeroNum++;
                }
                else if(nums[i]==1 ){
                    oneNum++;
                }
            }
            for(int i=0;i<zeroNum;i++){
                nums[i]=0;
            }
            for(int i=0;i<oneNum;i++){
                nums[i+zeroNum]=1;
            }
            int newSize = (size-zeroNum-oneNum);
            for(int i=0;i<newSize;i++){
                nums[i+zeroNum+oneNum]=2;
            }
        }
    }