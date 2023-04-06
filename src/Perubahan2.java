public class Perubahan2 {
    private int front, rear;
    private String[] queue;

    public Perubahan2(int capacity) {
        this.queue = new String[capacity];
    }

    public void enqueue(String data) {
        if (rear == queue.length) {
            System.out.println("Queue is full");
            return;
        }

        queue[rear++] = data;
        System.out.println("Enqueued: " + data);
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Dequeued: " + queue[front++]);
    }

    public void peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Peek: " + queue[front]);
    }

    public static void main(String[] args) {
        Perubahan2 queue = new Perubahan2(4);
        queue.enqueue("Java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");

        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
    }
}