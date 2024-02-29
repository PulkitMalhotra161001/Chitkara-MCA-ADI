// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println( PrefixToInfix("+*ABC") );
    }
    static String PrefixToInfix(String s){
        int n = s.length();
        Stack<String> st = new Stack<>();
        for(int j=n-1;j>=0;j--){
            
            String i = s.charAt(j)+"";
            if(i.equals("+")){
                String b = st.pop();
                String a = st.pop();
                st.push("(" + a+ "+" + b + ")");
            }else if(i.equals("-")){
                String b = st.pop();
                String a = st.pop();
                st.push("(" + a+ "-" + b + ")");
            }else if(i.equals("*")){
                String b = st.pop();
                String a = st.pop();
                st.push("(" + a+ "*" + b + ")");
            }else if(i.equals("/")){
                String b = st.pop();
                String a = st.pop();
                st.push("(" + a+ "/" + b + ")");
            }else{
                // int a = Integer.parseInt(i);
                st.push(i);
            }
        }
        
        return st.pop();
    }
}
