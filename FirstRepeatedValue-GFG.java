/*
  Geeks For Geeks : First Repeating Element (https://www.geeksforgeeks.org/problems/first-repeating-element4018/1)

  Problem Description : Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

  Note:- The position you return should be according to 1-based indexing. 

  For Example : arr[] = [1, 5, 3, 4, 3, 5, 6]
  Answer = 2 (Because 5 is repeated more than once and at smallest index)

  **/


class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Your code here
        int answer = -1;
        Map<Integer, Integer> mapValue = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mapValue.containsKey(arr[i])){
                int val = mapValue.get(arr[i]) + 1;
                mapValue.put(arr[i],val);
            }
            else{
                mapValue.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(mapValue.get(arr[i]) > 1){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}