import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Peek (head): " + pq.peek());

        System.out.println("Poll (removed): " + pq.poll());

        System.out.println("After poll: " + pq);

        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        System.out.println("Final elements in order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}