import java.util.EmptyStackException;

public class QueueUsingStacks {
    private Stack stack1; 
    private Stack stack2; 

    public QueueUsingStacks(int capacity) {
        stack1 = new Stack(capacity);
        stack2 = new Stack(capacity);
    }

   
    public void enqueue(int item) {
        stack1.push(item);
    }

   
    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (stack2.isEmpty()) {
            transferElements();
        }
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (stack2.isEmpty()) {
            transferElements();
        }
        return stack2.peek();
    }

    
    private void transferElements() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Peek: " + queue.peek()); 

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Peek: " + queue.peek()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
}

class Stack {
    private int capacity;
    private int[] stackArray;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack Overflow");
        }
        stackArray[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
}