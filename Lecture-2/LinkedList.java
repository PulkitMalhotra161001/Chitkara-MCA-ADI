// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtHead(4);
        
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        
        list.print();
        
        list.removeHead();
        
        System.out.println("Update");
        
        list.print();
    
        // System.out.println("Size: "+list.size());
        
        // list.insertAtEnd(284);
        // System.out.println("Size: "+list.size());
        // list.removeLast();
        // System.out.println("Size: "+list.size());
        // list.print();
    }
}

class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }
    int size(){
        Node curr=head;
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        return size;
    }
    void print(){
        // if(curr)
        // for(Node curr=head;curr!=null;curr=curr.next){
        //     System.out.println(curr.val);
        // }
        Node curr=head;
        printViaRec(curr);
        
        // Node curr=head;
        // while(curr!=null){
        //     System.out.println(curr.val);
        //     curr=curr.next;
        // }
    }
    void printViaRec(Node curr){
        if(curr==null)   return;
        System.out.println(curr.val);
        printViaRec(curr.next);
    }
    
    void insertAtHead(int x){
        Node node = new Node(x);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    
    void insertAtEnd(int x){
        Node node = new Node(x);
        if(head==null){
            head=node;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next = node;
        }
    }
    
    void removeLast(){
        //list size is 0
        if(head==null){
            System.out.println("No node present");
            return;
        }
        
        //last node (list has 1 node)
        if(head.next==null){
            head=null;
        }else{
            //linked list
            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
    }
    void removeHead(){
        if(head==null){
            return;
        }
        head=head.next;
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
