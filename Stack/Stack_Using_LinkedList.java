package Java_Data_Structure_And_Algorithms.Stack;

import java.util.EmptyStackException;

public class Stack_Using_LinkedList {

    private ListNode top;
    private int length;

    private class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack_Using_LinkedList() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack_Using_LinkedList stack = new Stack_Using_LinkedList();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}