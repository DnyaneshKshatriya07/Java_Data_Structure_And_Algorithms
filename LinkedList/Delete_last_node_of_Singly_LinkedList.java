package Java_Data_Structure_And_Algorithms.LinkedList;

public class Delete_last_node_of_Singly_LinkedList {
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

    public ListNode deletelast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    public static void main(String[] args) {
        Delete_last_node_of_Singly_LinkedList sll = new Delete_last_node_of_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println("After deleting the Last node from linkedlist:- ");
        sll.deletelast();

        sll.display();
    }
}
