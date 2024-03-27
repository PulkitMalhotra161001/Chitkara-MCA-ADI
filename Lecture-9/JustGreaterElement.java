/*
 arr[] = {2, 5, 7, 6, 9, 5, 12, 17, 9, 2}
 ans[] = {-1, -1, -1, 7, -1, 6, -1, -1, 12, 5}
 
 Hint: TreeSet
 */

 import java.util.*;

 class HelloWorld {
     public static void main(String[] args) {
         int input[] = {3,4,1,7,3,6,2,6,2,6,3,7,1,11,414,1,51,5};
         int output[] = find(input);
         for(int i:output){
             System.out.print(i+" ");
         }
     }
     static int[] find(int input[]){
         TreeSet<Integer> set = new TreeSet<>();
         int n=input.length;
         int output[] = new int[n];
         for(int i=0;i<n;i++){
             if(set.higher(input[i])==null){
                 output[i] = -1;
             }else{
                 output[i] = set.higher(input[i]);
             }
             
             set.add(input[i]);
         }
         return output;
     }
 }