package Java_Data_Structure_And_Algorithms.LinkedList;

import java.util.Scanner;

public class Creation_of_Singly_LinkedList {
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

    public void insertlast(int value) {
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
        Creation_of_Singly_LinkedList sll = new Creation_of_Singly_LinkedList();
        
        Scanner sc=new Scanner(System.in);
        int op;
        do {
            System.out.println("Enter the Element You Want To Insert:- ");
            int ele=sc.nextInt();
            sll.insertlast(ele);
            if(sll.head==null){
                sll.head = new ListNode(ele);
            }
            ListNode second = new ListNode(ele);
            System.out.println("You Want To Add Element In The LinkeList(1/0):- ");
            op= sc.nextInt();
        }while (op==1);

        sll.display();
    }
}
