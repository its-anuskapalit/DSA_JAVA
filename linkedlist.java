//===================LINKEDLIST===========================

//CREATING A LINKEDLIST AND PRINTING ITS ELEMENTS
class Node{
   int data;
   Node next;
   Node(int v) {
       data = v;
       next = null;
   }
}
class LinkedList{
   static void printlist(Node head){
       Node current=head;
       while(current!=null){
           System.out.println(current.data);
           current=current.next;
       }
   }
   public static void main(String args[]){
       Node a=new Node(10);
       a.next=new Node(20);
       a.next.next=new Node(30);
       printlist(a);
   }
}
//===========================================================================

class Node {
   int data;
   Node next;

   Node(int v) {
       data = v;
       next = null;
   }
}

class LinkedList {
   static void printList(Node head) {
       Node current = head;
       while (current != null) {
           System.out.println(current.data);
           current = current.next;
       }
   }

   public static void main(String args[]) {
       // Creating initial linked list
       Node a = new Node(10);
       a.next = new Node(20);
       a.next.next = new Node(30);
       System.out.println("Initial list:");
       printList(a);

       // Adding a new node at the beginning
       Node temp = new Node(5);
       temp.next = a;
       a = temp;
       System.out.println("After adding 5 at the beginning:");
       printList(a);

       // Adding a new node at the end
       Node newnode = new Node(40);
       Node current = a;
       while (current.next != null) {
           current = current.next;
       }
       current.next = newnode;
       System.out.println("After adding 40 at the end:");
       printList(a);
   }
}
//=================================================================
class Node {
   int data;
   Node next;

   Node(int data) {
       this.data = data;
       this.next = null;
   }
}
class Dsa {
   Node head;

   // Method to insert a node at the beginning
   public void insertAtBeginning(int data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
   }

   // Method to insert a node at the end
   public void insertAtEnd(int data) {
       Node newNode = new Node(data);
       if (head == null) {
           head = newNode;
       } else {
           Node current = head;
           while (current.next != null) {
               current = current.next;
           }
           current.next = newNode;
       }
   }

   // Method to delete a node from the beginning
   public void deleteFromBeginning() {
       if (head != null) {
           head = head.next;
       }
   }

   // Method to delete a node from the end
   public void deleteFromEnd() {
       if (head == null) {
           return;
       } else if (head.next == null) {
           head = null;
       } else {
           Node current = head;
           while (current.next.next != null) {
               current = current.next;
           }
           current.next = null;
       }
   }

   // Method to traverse and print the linked list
   public void printList() {
       Node current = head;
       while (current != null) {
           System.out.print(current.data + " ");
           current = current.next;
       }
       System.out.println();
   }

   public static void main(String args[]) {
       Dsa list = new Dsa();

       // Create initial nodes
       list.insertAtEnd(10);
       list.insertAtEnd(20);
       list.insertAtEnd(30);

       // Print the initial list
       System.out.println("Initial linked list:");
       list.printList();

       // Insert element at the beginning
       list.insertAtBeginning(5);
       System.out.println("After inserting 5 at the beginning:");
       list.printList();

       // Insert element at the end
       list.insertAtEnd(40);
       System.out.println("After inserting 40 at the end:");
       list.printList();

       // Delete element from the beginning
       list.deleteFromBeginning();
       System.out.println("After deleting from the beginning:");
       list.printList();

       // Delete element from the end
       list.deleteFromEnd();
       System.out.println("After deleting from the end:");
       list.printList();
   }
}
//===========================================================================================
class Node {
   int data;
   Node next;

   Node(int v) {
       data = v;
       next = null;
   }
}

class LinkedList {
   Node head;

   // Function to insert a node at the beginning
   void insertAtFirst(int data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
       System.out.println("After inserting " + data + " at the beginning:");
       printList();
   }

   // Function to insert a node at the end
   void insertAtLast(int data) {
       Node newNode = new Node(data);
       if (head == null) {
           head = newNode;
       } else {
           Node current = head;
           while (current.next != null) {
               current = current.next;
           }
           current.next = newNode;
       }
       System.out.println("After inserting " + data + " at the end:");
       printList();
   }

   // Function to delete a node from the beginning
   void deleteFromFirst() {
       if (head == null) {
           System.out.println("List is empty, nothing to delete.");
       } else {
           head = head.next;
           System.out.println("After deleting from the beginning:");
       }
       printList();
   }

   // Function to delete a node from the end
   void deleteFromLast() {
       if (head == null) {
           System.out.println("List is empty, nothing to delete.");
       } else if (head.next == null) {
           head = null;
       } else {
           Node current = head;
           while (current.next.next != null) {
               current = current.next;
           }
           current.next = null;
       }
       System.out.println("After deleting from the end:");
       printList();
   }

   // Function to insert a node at a given position
   void insertAtPosition(int data, int position) {
       Node newNode = new Node(data);
       if (position == 1) {
           newNode.next = head;
           head = newNode;
       } else {
           Node current = head;
           for (int i = 1; i < position - 1 && current != null; i++) {
               current = current.next;
           }
           if (current != null) {
               newNode.next = current.next;
               current.next = newNode;
           } else {
               System.out.println("Position out of bounds");
               return;
           }
       }
       System.out.println("After inserting " + data + " at position " + position + ":");
       printList();
   }

   // Function to delete a node from a given position
   void deleteFromPosition(int position) {
       if (head == null) {
           System.out.println("List is empty, nothing to delete.");
       } else if (position == 1) {
           head = head.next;
       } else {
           Node current = head;
           for (int i = 1; i < position - 1 && current.next != null; i++) {
               current = current.next;
           }
           if (current.next != null) {
               current.next = current.next.next;
           } else {
               System.out.println("Position out of bounds");
               return;
           }
       }
       System.out.println("After deleting from position " + position + ":");
       printList();
   }

   // Function to print the linked list
   void printList() {
       Node current = head;
       if (current == null) {
           System.out.println("List is empty.");
           return;
       }
       while (current != null) {
           System.out.print(current.data + " ");
           current = current.next;
       }
       System.out.println();
   }

   public static void main(String args[]) {
       LinkedList list = new LinkedList();

       list.insertAtFirst(10);
       list.insertAtLast(20);
       list.insertAtLast(30);
       list.insertAtPosition(15, 2);
       list.insertAtPosition(5, 1);
       list.deleteFromFirst();
       list.deleteFromLast();
       list.deleteFromPosition(2);
   }
}

//==============================================================================================================
class DoublyNode{
    int data;
    DoublyNode prev;
    DoublyNode next;
    DoublyNode(int v){
        data=v;
        prev=next=null;
    }
}
class DLinkedList{
    DoublyNode head;
    void insertAtFirst(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head != null) {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("After inserting " + data + " at the beginning:");
        printList();
    }

    // Function to insert a node at the end
    void insertAtLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        System.out.println("After inserting " + data + " at the end:");
        printList();
    }

    // Function to delete a node from the beginning
    void deleteFromFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println("After deleting from the beginning:");
        }
        printList();
    }

    // Function to delete a node from the end
    void deleteFromLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
        } else if (head.next == null) {
            head = null;
        } else {
            DoublyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
        System.out.println("After deleting from the end:");
        printList();
    }

    // Function to insert a node at a given position
    void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Position out of bounds");
            return;
        }
        DoublyNode newNode = new DoublyNode(data);
        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            DoublyNode current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                current.next = newNode;
            } else {
                System.out.println("Position out of bounds");
                return;
            }
        }
        System.out.println("After inserting " + data + " at position " + position + ":");
        printList();
    }

    // Function to delete a node from a given position
    void deleteFromPosition(int position) {
        if (position <= 0 || head == null) {
            System.out.println("Position out of bounds or list is empty, nothing to delete.");
            return;
        }
        if (position == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            DoublyNode current = head;
            for (int i = 1; i < position && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            } else {
                System.out.println("Position out of bounds");
                return;
            }
        }
        System.out.println("After deleting from position " + position + ":");
        printList();
    }

    // Function to print the doubly linked list
    void printList() {
        DoublyNode current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        DLinkedList list = new DLinkedList();
        list.insertAtFirst(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtPosition(15, 2);
        list.insertAtPosition(5, 1);
        list.deleteFromFirst();
        list.deleteFromLast();
        list.deleteFromPosition(2);
    }
}
