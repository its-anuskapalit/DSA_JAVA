class Stack {
   int arr[];
   int cap;
   int top;

   Stack(int c) {
       top = -1;
       cap = c;
       arr = new int[cap];
   }
   void push(int x) {
       if (top == cap - 1) {
           System.out.println("Stack is full.");
           return;
       }
       top++;
       arr[top] = x;
   }

   int pop() {
       if (top == -1) {
           System.out.println("Stack is empty.");
           return -1; // or some other error value
       }
       return arr[top--];
   }

   int size() {
       return top + 1;
   }

   int peek() {
       if (top == -1) {
           System.out.println("Stack is empty.");
           return -1; // or some other error value
       }
       return arr[top];
   }

   void printStack() {
       if (top == -1) {
           System.out.println("Stack is empty.");
           return;
       }
       for (int i = 0; i <= top; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }

   public static void main(String args[]) {
       Stack s = new Stack(5);
       s.push(10);
       s.push(20);
       System.out.println("Popped element: " + s.pop());
       s.push(30);
       s.printStack();
   }
}

//============================================================================================

class Stack {
    private Node top;
    private int size;

    // Node class to represent each element in the stack
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Stack() {
        top = null;
        size = 0;
    }

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1; // or some other error value
        }
        int res = top.data;
        top = top.next;
        size--;
        return res;
    }

    int size() {
        return size;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1; // or some other error value
        }
        return top.data;
    }

    void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        System.out.println("Popped element: " + s.pop());
        s.push(30);
        s.printStack();
    }
}
