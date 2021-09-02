package String;

import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        Stack<Character> stk=new Stack<>();
        String s="16032000";
        char a[]=s.toCharArray();
        int m=2;
        stk.push('#');
        for(char c: a){
            while(stk.peek() > c && m > 0){
                m--;
                stk.pop();
            }
            stk.push(c);
        }
        String ans="";
        while((int)(stk.size())>1){
            ans=ans+stk.peek();
            stk.pop();
        }
        StringBuilder sb=new StringBuilder(ans);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}
