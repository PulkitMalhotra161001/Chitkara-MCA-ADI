public void insertAtEnd(int data) 
{ 
    Node temp = new Node(data); 
    if (tail == null) { 
        head = temp; 
        tail = temp; 
    } 
    else { 
        tail.next = temp; 
        temp.prev = tail; 
        tail = temp; 
    } 
} 

//insertion at beginning
//insertion at a specific index