package Java_Data_Structure_And_Algorithms.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Delete_node_from_Singly_LinkedList_at_given_position {
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

    public void delete(int position){
        if(position==1){
            head=head.next;
        }
        else{
            ListNode previous= head;
            int count=1;

            while(count< position-1){
                previous=previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next=current.next;
        }
        
    }

    public static void main(String[] args) {
        Delete_node_from_Singly_LinkedList_at_given_position sll = new Delete_node_from_Singly_LinkedList_at_given_position();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println("Enter the Position where you want to delete:- ");
        Scanner sc= new Scanner(System.in);
        int position=sc.nextInt();
        sll.delete(position);

        sll.display();
    }
}
