package Java_Data_Structure_And_Algorithms.LinkedList;

public class Delete_first_node_of_Singly_LinkedList {
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

    public ListNode deletefirst(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    public static void main(String[] args) {
        Delete_first_node_of_Singly_LinkedList sll = new Delete_first_node_of_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println("After deleting the first node from linkedlist:- ");
        sll.deletefirst();

        sll.display();
    }
}
