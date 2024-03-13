class HelloWorld {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(6);
        q.add(4);
        q.print();
        
        System.out.println();
        q.remove();
        q.print();
        
        System.out.println();
        q.add(1);
        q.print();
    }
    
}

class Queue{
    Node head;
    Node tail;
    Queue(){
        head=null;
        tail=null;
    }
    void add(int x){
        Node node = new Node(x);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=tail.next;
        }
    }
    int remove(){
        int ans = head.val;
        
        head=head.next;
        
        if(head==null){
            tail=null;
        }
        
        return ans;
    }
    
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next=null;
    }
}
