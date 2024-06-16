package Java_Data_Structure_And_Algorithms.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Insert_node_at_the_end_of_Singly_LinkedList {
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

    public void insertlast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            newNode=head;
            return;
        }
        ListNode current= head;
        while(null !=current.next){
            current=current.next;
        }
        current.next=newNode;
    }

    public static void main(String[] args) {
        Insert_node_at_the_end_of_Singly_LinkedList sll = new Insert_node_at_the_end_of_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println("Enter the element you want to insert at End:- ");
        Scanner sc= new Scanner(System.in);
        int ele=sc.nextInt();
        sll.insertlast(ele);

        sll.display();
    }
}
