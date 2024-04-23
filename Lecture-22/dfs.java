// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n = 8;
        List<List<Integer>> list = using_adj_list(n);
        
        System.out.println(list);
        
        boolean vis[] = new boolean[n];
        dfs(list,vis,3);
    }
    static void dfs(List<List<Integer>> list,boolean vis[],int st){
        
        //mark
        vis[st] = true;
        
        //print
        System.out.print(st+" ");
        
        for(Integer nbr:list.get(st)){
            if(!vis[nbr]){
                vis[nbr]=true;
                dfs(list,vis,nbr);
            }
        }
    }
    static List<List<Integer>> using_adj_list(int n){
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(new ArrayList<Integer>());
        }
        
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(2).add(1);
        list.get(2).add(5);
        list.get(2).add(6);
        list.get(3).add(1);
        list.get(3).add(4);
        list.get(4).add(3);
        list.get(4).add(5);
        list.get(4).add(7);
        list.get(5).add(2);
        list.get(5).add(4);
        list.get(6).add(2);
        list.get(6).add(3);
        list.get(7).add(4);
        
        return list;
        

        
        
        
        
        
    }
}
