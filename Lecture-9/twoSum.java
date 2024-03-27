import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int a[] = {3,14,5,-251,4,1,-51,1,5,1,51,-4,-14,1};
        int target = 18;
        System.out.println( twoSum(a,target) );
    }
    static boolean twoSum(int a[],int target){
        int n = a.length;
        Set<Integer> set = new HashSet<>();
        
        for(int i:a){
            if(set.contains(target-i)){
                return true;
            }
            
            set.add(i);
        }
        
        return false;
    }
}