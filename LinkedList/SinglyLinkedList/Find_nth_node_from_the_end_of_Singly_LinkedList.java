package Java_Data_Structure_And_Algorithms.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Find_nth_node_from_the_end_of_Singly_LinkedList {
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

    public ListNode findNTH(int n) {
        ListNode mainptr=head;
        ListNode refptr=head;
        int count=0;
        while(count<n){
            refptr=refptr.next;
            count++;
        }
        while(refptr!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;
        }
        return mainptr;
    }

    public static void main(String[] args) {
        Find_nth_node_from_the_end_of_Singly_LinkedList sll = new Find_nth_node_from_the_end_of_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Original Linked List:");
        sll.display();

        System.out.println("Enter the value of n:- ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print(n+"th node from the end of a Singly Linked List is:- ");

        ListNode Nth= sll.findNTH(n);
        System.out.println(Nth.data);
    }
}
