package Java_Data_Structure_And_Algorithms.LinkedList;

import java.util.Scanner;

public class search_an_element_in_Singly_LinkedList {
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

    public boolean search(int value){
        ListNode current= head;
        while(current!=null){
            if(current.data ==value){
                return true;
            }
            current=current.next;
        }
        return false;   
    }

    public static void main(String[] args) {
        search_an_element_in_Singly_LinkedList sll = new search_an_element_in_Singly_LinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(100);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println("Enter the Element that you want to Search:- ");
        Scanner sc= new Scanner(System.in);
        int value=sc.nextInt();

        if(sll.search(value)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

        
    }
}
