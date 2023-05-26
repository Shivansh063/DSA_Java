import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "{{}{{{{}}}}}{}{}{{{{{{{{{}}}}}}}}}";
        int max = countRev(s);
        System.out.println("max value is :: "+max);
    }

    public static int countRev (String s)
    {
        // your code here
       if(s.length() % 2 !=0) return -1;
        // your code here
        Stack<Character> st = new Stack<Character>();
        st.push('@');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.peek() != '@' && st.peek() == '{'){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.peek() == '@') return 0;
        int counter = 0;
        char previousElement = st.peek();
        st.pop();
        while(st.peek() != '@'){
            if(previousElement == st.peek()) counter++;
            else counter = counter+2;
            st.pop();
            if(st.peek() == '@') break;
            previousElement = st.peek();
            st.pop();
        }
        return counter;
    }
}
