//Bug: add and remove out of bound
//minHeap implementation

class HelloWorld {
    public static void main(String[] args) {
        Heap heap = new Heap(25);
        heap.add(4);
        heap.add(7);
        heap.add(1);
        heap.add(5);
        heap.add(9);
        heap.add(2);
        
        System.out.println(heap.remove());
        heap.add(3);
        // System.out.println(heap.remove());
    }
}

class Heap{
	//we can take list for dynamic size
    int arr[];
    //i is for putting position
    int i=1;
    
    //parameterized constructors
    Heap(int n){
        arr = new int[n];
    }
    
    
    void add(int x){
        //put at last
        arr[i]=x;
        
        int cur=i;
        //compare with parent and put x value at it's correct position
        while(cur>1 && arr[cur/2]<arr[cur]){
            swap(cur/2,cur,arr);
            //move to parent
            cur=cur/2;
        }

        // System.out.println("Add");
        // print();

        
        i++;
    }
    
    int remove(){
        //max value is on top
        int ans = arr[1];
        //we removed 1 value from heap
        //so new insert index is decreased
        i--;
        
        //put smallest value
        arr[1]=arr[i];
        
        //start from parent
        //put min value to it's correct position
        int cur=1;
        while(true){
            int first_child = 2*cur, second_child = 2*cur+1;
            int largest = cur;
            
            //check first child value
            if(first_child<i && arr[first_child]>arr[largest])   largest=first_child;
            
            //check second_child value
            if(second_child<i && arr[second_child]>arr[largest])   largest=second_child;
            
            //if largest value is from first or second child
            if(largest!=cur){
                //then put largest value on top
                swap(largest,cur,arr);
                cur=largest;
                
            }else{
                //if largest value is already on top then do nothing
                break;
            }
        }
        
        // System.out.println("Remove");
        // print();
        
        return ans;
    }
    void print(){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void swap(int i,int j,int a[]){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
