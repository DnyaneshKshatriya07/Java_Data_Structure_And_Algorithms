import java.util.ArrayList;

public class StackAL {

    static class Stack {
        private ArrayList<Integer> list;

        public Stack() {
            list = new ArrayList<>();
        }

        public void push(int data) {
            list.add(data);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return list.remove(list.size() - 1);
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
