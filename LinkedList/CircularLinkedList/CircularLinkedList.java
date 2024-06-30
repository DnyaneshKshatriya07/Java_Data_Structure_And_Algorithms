package Java_Data_Structure_And_Algorithms.LinkedList.CircularLinkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
        length = 4;
    }

    public void display() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
        }
        length++;
    }

    public void insertLast(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public void insertInBetween(int data, int position) {
        if (position < 1 || position > length + 1) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (position == 1) {
            insertFirst(data);
            return;
        }
        if (position == length + 1) {
            insertLast(data);
            return;
        }

        ListNode newNode = new ListNode(data);
        ListNode previous = last.next;
        int count = 1;

        while (count < position - 1) {
            previous = previous.next;
            count++;
        }

        newNode.next = previous.next;
        previous.next = newNode;
        length++;
    }

    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Linked List is already empty");
        }

        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Linked List is already empty");
        }

        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            ListNode current = last.next;
            while (current.next != last) {
                current = current.next;
            }
            current.next = last.next;
            last = current;
        }
        length--;
        return temp;
    }

    public void deleteInBetween(int position) {
        if (position < 1 || position > length) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (position == 1) {
            deleteFirst();
            return;
        }
        if (position == length) {
            deleteLast();
            return;
        }

        ListNode previous = last.next;
        int count = 1;

        while (count < position - 1) {
            previous = previous.next;
            count++;
        }

        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
        length--;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinkedList();
        cll.display();

        cll.insertFirst(200);
        cll.display();

        cll.insertLast(500);
        cll.display();

        cll.insertInBetween(300, 3);
        cll.display();

        cll.deleteFirst();
        cll.display();

        cll.deleteLast();
        cll.display();

        cll.deleteInBetween(2);
        cll.display();
    }
}

