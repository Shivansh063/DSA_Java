import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode newNode = new ListNode(7);
        ListNode newNode1 = new ListNode(4);
        ListNode newNode2 = new ListNode(3);
        ListNode newNode3 = new ListNode(5);
      head.next = newNode;
      newNode.next = newNode1;
      newNode1.next = newNode2;
      newNode2.next = newNode3;
      int arr[] = nextLargerNodes(head);
      for(int i : arr){
        System.out.print(i + " -> ");
      }

    }

  public static int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        int valArr[] = new int[10000];
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            valArr[size++] = curr.val;
            curr=curr.next;

        }
        int arr[] = new int[size];
        for(int i=size-1;i>=0;i--){
          System.out.println("line 37 : "+valArr[i]);
            if(st.peek()==0){
                arr[i] = 0;
                st.push(valArr[i]);
            }
            else if(st.peek() > valArr[i]){
                arr[i] = st.peek();
                st.push(valArr[i]);
            }
            else{
                while(st.peek() !=0 && st.peek() <= valArr[i] ){
                    st.pop();
                }
                arr[i] = st.peek();
                st.push(valArr[i]);
            }
        }

        return arr;
    }
    
}
class ListNode{
  int val;
  ListNode next;

  public ListNode(int d){
    val = d;
    next =null;
  }
}
