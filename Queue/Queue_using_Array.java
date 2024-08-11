package Java_Data_Structure_And_Algorithms.Queue;

// queue using array
public class Queue_using_Array {
    static class Queue {
        int arr[];
        int size;
        int rear;

        // Constructor
        public Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }

            arr[++rear] = data;
        }

        // O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5); // Create an instance of the Queue class
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove()); // Should print 1
        System.out.println(q.peek());   // Should print 2
    }
}
