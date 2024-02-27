class HelloWorld {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        st.print();
        
        st.pop();
        System.out.println("Updation");
        st.print();
    }
}

class Stack{
    Node head;
    Stack(){
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
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }
    }
    
    void push(int x){
        Node node = new Node(x);
        //adding initial node
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    
    void pop(){
        //list empty
        if(head==null){
            return;
        }
        head=head.next;
    }
    
    int peek(){
        if(head==null)  return -1;
        return head.val;
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
