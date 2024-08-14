// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/**
 Problem Statement : Find Missing Element from an array having one duplicate
 Description : 
 {2,5,6,7,4,1,7} -> if N = 7, then array will contains element [1,N] but one element is missing and one element is duplicate. Missing -> 3, Duplicate -> 7
 Answer  : 3
our function will return missing element and -1 if nothing found.
 **/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        //int arr[] = {2,5,6,7,4,1,7};
        int arr[] = {1,5,2,6,7,8};
        int ans = findMissingFromDuplicateArray(arr);
        if(ans != -1) System.out.println("Element :"+ ans);
        else System.out.println("No Missing Element Found");
    }

    static int findMissingFromDuplicateArray(int arr[]){
        int answer = -1;

        try{
            for(int i=0;i<arr.length;i++){
                int index = Math.abs(arr[i])-1;
                arr[index] = arr[index]* -1;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i] > 0){
                    answer = i+1;
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println("Error Occured : "+ e.getMessage());
        }
        return answer;
    }

}
