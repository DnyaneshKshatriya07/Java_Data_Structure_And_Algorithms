package Java_Data_Structure_And_Algorithms.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Insert_node_at_the_beginning_of_Singly_LinkedList {
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

    public void insertfirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public static void main(String[] args) {
        Insert_node_at_the_beginning_of_Singly_LinkedList sll = new Insert_node_at_the_beginning_of_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println("Enter the element you want to insert at First:- ");
        Scanner sc= new Scanner(System.in);
        int ele=sc.nextInt();
        sll.insertfirst(ele);

        sll.display();
    }
}
