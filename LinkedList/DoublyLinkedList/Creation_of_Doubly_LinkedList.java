package Java_Data_Structure_And_Algorithms.LinkedList.DoublyLinkedList;

public class Creation_of_Doubly_LinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data; // Can be any generic type
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Creation_of_Doubly_LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0; // or head == null
    }

    public int length() {
        return length;
    }

    public void displayForward() {
        if (head == null) {
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if (head == null) {
            return;
        }

        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }


    public void insertEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public static void main(String[] args) {
        Creation_of_Doubly_LinkedList dll = new Creation_of_Doubly_LinkedList();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);

        dll.displayForward();

        dll.displayBackward();
    }
}