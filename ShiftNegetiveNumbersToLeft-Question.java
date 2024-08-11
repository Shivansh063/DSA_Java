import java.util.*;
import java.lang.*;
import java.io.*;
// Shift Negetive Numbers to left Side of an Array and no Need to maintain the order for positive numbers.
class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-4,-5,-10,5,6,7,-8};
        System.out.println("Before Shift");
        for(int i : arr){
            System.out.print(i+" ");
        }
        shiftNegetiveNumbersToLeft(arr);
        System.out.println();
        System.out.println("After Shift");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    static void shiftNegetiveNumbersToLeft(int arr[]){
        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                int a = arr[i];
                arr[i] = arr[index];
                arr[index] = a;
                index++;
            }
        }
    }
}
