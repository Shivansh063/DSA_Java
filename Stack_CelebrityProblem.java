import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int M[][] = {{0,1,1,0},{0,0,1,0}, {0,1,0,1,0},{1,1,1,1}};
        int n = 4;
        int celIndex = celebrity(M,n);
        System.out.println("index is : "+celIndex);
    }
    public static int celebrity(int M[][], int n)
    {
    	// code here
    	int arr[] = new int[2999];
    	Stack<Integer> st = new Stack<Integer>();
    	int counter = 0;
    	st.push(-1);
    	int index = -1;
    	for(int i=0;i<n;i++){
    	    counter = 0;
    	    for(int j=0;j<n;j++){
    	        if(M[i][j]==0){
    	            ++counter;
    	        }
    	        else{
    	            counter = 0;
    	            st.push(j);
    	        }
    	    }
    	    if(counter==n && index >0) return -1;
    	    if(counter==n && index == -1){
    	        index = counter;
    	    }
    	    
    	}
    	if(index==-1) return index;
    	while(st.peek() != -1){
    	    ++arr[st.peek()];
    	    st.pop();
    	}
    	int celIndex = -1;
    	for(int i=0;i<arr.length;i++){
    	    if(arr[i]==n-1){
    	        celIndex = i;
    	        break;
    	    }
    	}
    	return celIndex;
    	
    }
}
