/**

Question Link : https://leetcode.com/problems/kth-missing-positive-number/description/
Problem Description : Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.Return the kth positive integer that is missing from this array.

**/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int current = 1;
        int index = 0;

        while (missingCount < k) {
            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                missingCount++;
            }
            if (missingCount < k) {
                current++;
            }
        }

        return current;
    }
}
