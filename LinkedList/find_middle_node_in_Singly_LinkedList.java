package Java_Data_Structure_And_Algorithms.LinkedList;

public class find_middle_node_in_Singly_LinkedList {
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

    public ListNode middle() {
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr;
    }

    public static void main(String[] args) {
        find_middle_node_in_Singly_LinkedList sll = new find_middle_node_in_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Original Linked List:");
        sll.display();

        System.out.print("Middle Element of Linked List:- ");

        ListNode middNode= sll.middle();
        System.out.println(middNode.data);
    }
}
