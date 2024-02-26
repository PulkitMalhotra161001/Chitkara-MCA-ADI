class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();
        
        for(String i:operations){
            
            if(i.equals("+")){
                
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
                
            }else if(i.equals("C")){
                
                st.pop();
                
            }else if(i.equals("D")){
                int a = st.peek();
                st.push(2*a);
                
            }else{
                //integer in form of string
                int temp = Integer.parseInt(i);
                st.push(temp);
                
            }
        }
        
        int ans=0;
        while(st.size()>0){
            ans+=st.pop();
        }
        
        return ans;
        
    }
}
