public void deleteAtEnd() 
{ 
    if (tail == null) { 
        return; 
    } 
  
    if (head == tail) { 
        head = null; 
        tail = null; 
        return; 
    } 
  
    Node temp = tail; 
    tail = tail.prev; 
    tail.next = null; 
    temp.prev = null; 
}

//Deletion of the first node in the list.
//Deletion of a node at a specific position in the list.