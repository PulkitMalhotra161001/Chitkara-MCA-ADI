Node deleteNode(Node head, int key) 
{ 
		if (head == null) 
			return null; 
		int flag = 0; 
		// Find the required node 
		Node curr = head, prev = new Node(); 
		while (curr.data != key) { 
			if (curr.next == head) { 
				System.out.printf( 
					"Given node is not found in the list!!!\n"); 
				flag = 1; 
				break; 
			} 

			prev = curr; 
			curr = curr.next; 
		} 

		// Check if the element is not present in the list 
		if (flag == 1) 
			return head; 

		// Check if node is only node 
		if (curr == head && curr.next == head) { 
			head = null; 
			return head; 
		} 

		// If more than one node, check if 
		// it is first node 
		if (curr == head) { 
           //move prev to last node
			prev = head; 
			while (prev.next != head) 
				prev = prev.next; 
            
			head = head.next; 
			prev.next = head; 
		} 

        prev.next = curr.next; 
		return head; 
	} 