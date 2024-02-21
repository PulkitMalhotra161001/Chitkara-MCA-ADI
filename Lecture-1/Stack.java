class Stack {
  private int[] data;
  private int top;

  public Stack(int capacity) {
    data = new int[capacity];
    top = -1;
  }

  public void push(int element) {
    if (isFull()) {
      System.out.println("Stack Overflow");
      return;
    }
    data[++top] = element;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
      return -1;
    }
    return data[top--];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == data.length - 1;
  }
}

public class Main {
  public static void main(String[] args) {
    Stack stack = new Stack(5);
    stack.push(10);
    stack.push(20);
    System.out.println(stack.pop()); // Output: 20
  }
}
