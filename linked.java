////CREATIONA AND TRANVERSAL IN LINKEDLIST
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=next;
//    }
//}
//class Linkedlist{
//    Node head;
//    public void addNode(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//        }else{
//            Node currect=head;
//            while(currect.next!=null){
//                currect=currect.next;
//            }
//            currect.next=newNode;
//        }
//    }
//    public void traverse(){
//        if(head==null){
//            System.out.println("List is emtry");
//            return;
//        }
//        Node current=head;
//        while(current!=null){
//            System.out.print(current.data+" ->");
//            current=current.next;
//        }
//        System.out.println("null");
//    }
//}
//public class linked {
//    public static void main(String args[]){
//        Linkedlist list=new Linkedlist();
//        list.addNode(10);
//        list.addNode(20);
//        list.addNode(30);
//        list.addNode(40);
//        list.addNode(50);
//        System.out.println("The linked list is :");
//        list.traverse();
//    }
//}

////Count the Number of Nodes in a Linked List
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=next;
//    }
//}
//class LinkedList{
//    Node head;
//    public void addNode(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//        }else{
//            Node current=head;
//            while(current.next!=null){
//                current=current.next;
//            }
//            current.next=newNode;
//        }
//    }
//    public int count(){
//        int c=0;
//        Node current=head;
//        while(current!=null){
//            c++;
//            current=current.next;
//        }
//        return c;
//    }
//}
//public class linked{
//    public static void main(String args[]){
//        LinkedList ll=new LinkedList();
//        ll.addNode(55);
//        ll.addNode(66);
//        ll.addNode(77);
//        System.out.println(ll.count());
//    }
//}

////Search for an Item in a Linked List
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=next;
//    }
//}
//class Linkedlist{
//    Node head;
//    public void add(int data){
//        Node newnode=new Node(data);
//        if(head==null){
//            head=newnode;
//        }else{
//            Node current=head;
//            while(current.next!=null){
//                current=current.next;
//            }
//            current.next=newnode;
//        }
//    }
//    public boolean search(int key){
//        Node current=head;
//        while(current!=null) {
//            if (current.data == key) {
//                return true;
//            }
//            current = current.next;
//        }
//            return false;
//
//    }
//}
//
//public class linked {
//    public static void main(String[] args) {
//        Linkedlist list = new Linkedlist();
//
//        // Adding nodes to the linked list
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        // Searching for an item
//        int key = 50;
//        if (list.search(key)) {
//            System.out.println("Item " + key + " found in the linked list.");
//        } else {
//            System.out.println("Item " + key + " not found in the linked list.");
//        }
//    }
//}

////Java program that includes different methods to add an item at the beginning of the linked list, insert an item at the end, and insert a node after a given node
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=next;
//    }
//}
//class CreateLl{
//    Node head;
//    public void add(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//        }else{
//            Node current=head;
//            while(current.next!=null){
//                current=current.next;
//            }
//            current.next=newNode;
//        }
//    }
//    public void show(){
//        Node current=head;
//        while(current!=null){
//            System.out.print(current.data+"->");
//            current=current.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//    public void addinfirst(int data){
//        Node newnode=new Node(data);
//        newnode.next=head;
//        head=newnode;
//
//    }
//    public void addinlast(int data){
//        Node newnode=new Node(data);
//        Node cur=head;
//        while(cur.next!=null){
//            cur=cur.next;
//        }
//        cur.next=newnode;
//    }
//    public void addinposition(int data,int x){
//        Node cur=head;
//        while(cur!=null && cur.data!=x){
//            cur=cur.next;
//        }
//        if(cur!=null){
//            Node newNode=new Node(data);
//            newNode.next=cur.next;
//            cur.next=newNode;
//
//        }
//    }
//}
//public class linked{
//    public static void main(String args[]){
//        CreateLl ll=new CreateLl();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        ll.show();
//        ll.addinfirst(0);
//        ll.show();
//        ll.addinlast(4);
//        ll.show();
//        ll.addinposition(10,2);
//        ll.show();
//    }
//}

////Deletion from first and last
//class Node{
//    Node next;
//    int data;
//    Node(int data){
//        this.data=data;
//        this.next=next;
//    }
//}
//class Create {
//    Node head;
//
//    public void add(int data) {
//        Node newnode = new Node(data);
//        if (head == null) {
//            head = newnode;
//        } else {
//            Node cur = head;
//            while (cur.next != null) {
//                cur = cur.next;
//            }
//            cur.next = newnode;
//        }
//    }
//
//    public void show() {
//        Node cur = head;
//        while (cur != null) {
//            System.out.print(cur.data + "->");
//            cur = cur.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//
//    public void deletefromfirst() {
//        if (head == null) {
//            System.out.println("Empty list");
//        } else {
//            head = head.next;
//        }
//    }
//
//    public void deletefromlast() {
//        Node cur = head;
//        while (cur.next.next != null) {
//            cur = cur.next;
//        }
//        cur.next = null;
//    }
//
//    public void deletefromposition(int key) {
//        Node current = head;
//        while (current.next != null && current.next.data != key) {
//            current = current.next;
//        }
//        if (current.next == null) { // Key not found
//            System.out.println("Node with key " + key + " not found.");
//        } else {
//            current.next = current.next.next; // Skip the node with the given key
//            System.out.println("Node with key " + key + " deleted.");
//        }
//    }
//
//    public void deleteWithKey(int key) {
//        if (head == null) {
//            System.out.println("The list is empty. Nothing to delete.");
//        } else if (head.data == key) { // If the head node is the key
//            head = head.next;
//            System.out.println("Node with key " + key + " deleted.");
//        } else {
//            Node current = head;
//            while (current.next != null && current.next.data != key) { // Find the node before the one to delete
//                current = current.next;
//            }
//
//            if (current.next == null) { // Key not found
//                System.out.println("Node with key " + key + " not found.");
//            } else {
//                current.next = current.next.next; // Skip the node with the given key
//                System.out.println("Node with key " + key + " deleted.");
//            }
//        }
//    }
//}
//public class linked{
//    public static void main(String args[]){
//        Create ll=new Create();
//        ll.add(10);
//        ll.add(20);
//        ll.add(30);
//        ll.add(40);
//        ll.show();
//        ll.deletefromfirst();
//        ll.show();
//        ll.deletefromlast();
//        ll.show();
//    }
//}


////CIRCULAR LINKEDLIST
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class Circular{
//    Node head;
//    public void add(int data){
//        Node newnode=new Node(data);
//        if(head==null){
//            head=newnode;
//            newnode.next=head;
//        }else{
//            Node cur=head;
//            while(cur.next!=head){
//                cur=cur.next;
//            }
//            cur.next=newnode;
//            newnode.next=head;
//        }
//    }
//    public void print(){
//        Node cur=head;
//        do{
//            System.out.print(cur.data+"->");
//            cur=cur.next;
//        }while(cur!=head);
//        System.out.println("(back to head)");
//    }
//}
//class CircularLinkedListDemo {
//    public static void main(String[] args) {
//        Circular cll = new Circular();
//        cll.add(10);
//        cll.add(20);
//        cll.add(30);
//        cll.add(40);
//        System.out.println("Circular Linked List:");
//        cll.print();
//    }
//}
class Node{
    int data;
    Node next;
    Node(int data){
        this.next=null;
        this.data=data;
    }
}
class create{
    Node head;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
        }else {
            Node cur=head;
            while(cur.next!=head){
                cur=cur.next;
            }
            cur.next=newNode;
            newNode.next=head;
        }
    }
    public void print(){
        Node cur=head;
        do{
            System.out.print(cur.data+"->");
            cur=cur.next;
        }while(cur!=head);
        System.out.println("(back to head)");

    }
    public void addfirst(int data){
        Node newnode=new Node(data);
        
    }
}
class CircularLinkedListDemo {
    public static void main(String[] args) {
        create cll = new create();

        // Add some elements to the circular linked list
        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        // Print the circular linked list
        System.out.println("Circular Linked List:");
        cll.print();
    }
}