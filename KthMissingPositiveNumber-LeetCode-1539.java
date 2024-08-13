/**

Question Link : https://leetcode.com/problems/kth-missing-positive-number/description/
Problem Description : Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.Return the kth positive integer that is missing from this array.

**/

class Solution {

    public int findKthPositive(int[] arr, int k) {

        int arraySize = arr.length;
        int numberOfElements =  arr[arraySize-1] - arraySize;
        int answer = 0;
        if(numberOfElements == arr[arraySize-1]){
            answer = arr[arraySize-1] + k;
        } 
        else if(numberOfElements == k){
            answer = arr[arraySize-1]-1;
        }
        else if(numberOfElements < k){
            answer = arr[arraySize-1] + (k-numberOfElements);
        }
        else{
            int total = arr[0]-1;
            if(total >= k){
                answer = k;
            }
            else{
                for(int i=1;i<arraySize;i++){
                    total = total + (arr[i] - arr[i-1]-1);
                    if(total >=k){
                        answer = arr[i];
                        break;
                    }
                }
                answer = answer - (total-k+1);
            }
        }
        return answer;
    }
}