public void addNode(int value) {
    Node newNode = new Node(value);

    if (head == null) {
        head = newNode;
    } else {
        tail.nextNode = newNode;
    }

    tail = newNode;
    tail.nextNode = head;
}
