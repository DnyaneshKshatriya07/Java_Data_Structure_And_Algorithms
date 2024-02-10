package Java_Data_Structure_And_Algorithms.LinkedList;

public class Reverse_Singly_LinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public static void main(String[] args) {
        Reverse_Singly_LinkedList sll = new Reverse_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Original Linked List:");
        sll.display();

        sll.reverse();

        System.out.println("Reversed Linked List:");
        sll.display();
    }
}
