public class Stack {
  private int capacity;
  private int[] NumArray;
  private int top;

  
  public Stack(int capacity) {
      this.capacity = capacity;
      this.NumArray = new int[capacity];
      this.top = -1;
  }

 
  public void push(int item) {
      if (top == capacity - 1) {
          System.out.println("Stack is Full.");
          return;
      }
      NumArray[++top] = item;
  }

  
  public int pop() {
      if (top == -1) {
          System.out.println("Stack is Empty.");
          return -1; 
      }
      return NumArray[top--];
  }

  
  public int peek() {
      if (top == -1) {
          System.out.println("Empty Stack");
          return -1; 
      }
      return NumArray[top];
  }

  
  public boolean isEmpty() {
      return (top == -1);
  }

 
  public static void main(String[] args) {
      Stack stack = new Stack(5);
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);

      System.out.println("Peek: " + stack.peek());

      System.out.println("Popped: " + stack.pop());
      System.out.println("Popped: " + stack.pop());
      System.out.println("Popped: " + stack.pop());
      System.out.println("Popped: " + stack.pop());
      System.out.println("Popped: " + stack.pop());
      System.out.println("Popped: " + stack.pop()); 
}
}