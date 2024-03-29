import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++)
            al.add(i);
            
        // System.out.println("Min: "+Collections.min(al));
        // System.out.println("Max: "+Collections.max(al));
        // Collections.reverse(al);
        // Collections.reverseOrder();
        // Collections.rotate(al,1);
        // Collections.shuffle(al);
        // Collections.sort(al);
        // copy, addAll, binarySearch, fill
        // emptyList(), emptySet(), emptyMap()
        // etc.
        System.out.println(al);
        
        //forward direction
        Iterator<Integer> itr = al.iterator();
        
        while(itr.hasNext()){
            int i =itr.next();
            System.out.println(i);
        }
        //  including ArrayList, Vector, LinkedList, Stack, etc
        //  It extends the iterator interface.
        ListIterator<Integer> al_it = al.listIterator();
        while (al_it.hasNext()) {
            System.out.println(al_it.next());
        }
        
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
          Integer i = it.next();
          if(i % 2 == 0) {
            it.remove();
          }
        }
        System.out.println(al);
    }
}