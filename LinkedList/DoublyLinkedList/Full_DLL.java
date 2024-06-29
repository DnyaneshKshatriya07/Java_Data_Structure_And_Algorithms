package Java_Data_Structure_And_Algorithms.LinkedList.DoublyLinkedList;



public class Full_DLL {

    // Define the Node structure
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head; // Head pointer for the list

    // Constructor to create an empty list
    Full_DLL() {
        this.head = null;
    }

    // Function to insert a node at the front of the list
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Function to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Function to insert a node after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be NULL");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // Function to delete a node from the front of the list
    public void deleteFromFront() {
        if (head == null) return;
        Node temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        temp = null;
    }

    // Function to delete a node from the end
    public void deleteFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp = null;
    }

    // Function to delete a specific node
    public void deleteNode(Node delNode) {
        if (head == null || delNode == null) return;
        if (head == delNode) {
            head = delNode.next;
        }
        if (delNode.next != null) {
            delNode.next.prev = delNode.prev;
        }
        if (delNode.prev != null) {
            delNode.prev.next = delNode.next;
        }
        delNode = null;
    }

    // Function to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Full_DLL dll = new Full_DLL();

        // Insertions
        dll.insertAtEnd(1);
        dll.insertAtFront(2);
        dll.insertAtEnd(3);
        dll.insertAfter(dll.head.next, 4);

        System.out.print("List after insertions: ");
        dll.printList();

        // Deletions
        dll.deleteFromFront();
        System.out.print("List after deleting from front: ");
        dll.printList();

        dll.deleteFromEnd();
        System.out.print("List after deleting from end: ");
        dll.printList();

        dll.deleteNode(dll.head.next); // Assuming this node exists
        System.out.print("List after deleting a specific node: ");
        dll.printList();
    }
}
