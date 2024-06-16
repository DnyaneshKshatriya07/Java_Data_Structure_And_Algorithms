package Java_Data_Structure_And_Algorithms.LinkedList.SinglyLinkedList;

public class Length_of_Singly_LinkedList {
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
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    int count=0;
    public void length() {
        ListNode current = head;
        while (current != null) {
            count++;
            current=current.next;
        }
        System.out.println("Length of LinkedList is:- "+count);
    }

    public static void main(String[] args) {
        Length_of_Singly_LinkedList sll = new Length_of_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
        sll.length();
    }
}
