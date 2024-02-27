class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='#'){
                
                if(st1.isEmpty())    continue;
                st1.pop();
                
            }else{
                st1.push(c);
            }
        }
        
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c=='#'){
                
                if(st2.isEmpty())       continue;
                st2.pop();
                
            }else{
                st2.push(c);
            }
        }
        
        if(st1.size()==st2.size()){
            while(st1.size()>0){
                int a = st1.pop();
                int b = st2.pop();
                
                if(a==b)    continue;
                else    return false;
            }
            return true;
        }else{
            return false;
        }
    }
}
