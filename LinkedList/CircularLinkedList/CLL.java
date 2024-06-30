package Java_Data_Structure_And_Algorithms.LinkedList.CircularLinkedList;

public class CLL {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void add(int data) {
        insertLast(data);
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertInBetween(int data, int position) {
        if (position < 0) {
            throw new IndexOutOfBoundsException("Position can't be negative");
        }
        Node newNode = new Node(data);
        if (position == 0) {
            insertFirst(data);
            return;
        }
        Node current = head;
        Node previous = null;
        int count = 0;
        while (count < position && current.next != head) {
            previous = current;
            current = current.next;
            count++;
        }
        if (count != position) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        previous.next = newNode;
        newNode.next = current;
    }

    public void deleteFirst() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteLast() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = head;
            tail = current;
        }
    }

    public void deleteInBetween(int position) {
        if (position < 0) {
            throw new IndexOutOfBoundsException("Position can't be negative");
        }
        if (head == null) return;

        if (position == 0) {
            deleteFirst();
            return;
        }
        Node current = head;
        Node previous = null;
        int count = 0;
        while (count < position && current.next != head) {
            previous = current;
            current = current.next;
            count++;
        }
        if (count != position) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        previous.next = current.next;
        if (current == tail) {
            tail = previous;
        }
    }

    public void display() {
        Node current = head;
        if (head != null) {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list:");
        list.display();

        list.insertFirst(0);
        System.out.println("List after inserting 0 at the beginning:");
        list.display();

        list.insertLast(6);
        System.out.println("List after inserting 6 at the end:");
        list.display();

        list.insertInBetween(3, 3);
        System.out.println("List after inserting 3 at position 3:");
        list.display();

        list.deleteFirst();
        System.out.println("List after deleting the first node:");
        list.display();

        list.deleteLast();
        System.out.println("List after deleting the last node:");
        list.display();

        list.deleteInBetween(3);
        System.out.println("List after deleting node at position 3:");
        list.display();
    }
}
