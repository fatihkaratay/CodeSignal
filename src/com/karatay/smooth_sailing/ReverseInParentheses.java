package com.karatay.smooth_sailing;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseInParentheses {
    public static void main(String[] args) {
        String str = "foo(bar(baz))blim"; // returns foobazrabblim

        System.out.println(reverseInParantheses(str));
    }

    public static String reverseInParantheses(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        Stack<Character> st = new Stack<>();
        for(char c: str.toCharArray()){
            if( c == ')') {
                Queue<Character> p = new LinkedList<>();
                while(!st.isEmpty() && st.peek() != '(')
                    p.add(st.pop());
                if(!st.isEmpty())
                    st.pop();
                while(!p.isEmpty())
                    st.push(p.remove());
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());

        return sb.reverse().toString();
    }

    private static String reserveWord(String str) {
        return "reversedWord";
    }
}
