package queue;

public class Testklasse {
	   public static void main(String[] args) {
	        ArrayQueue queue = new ArrayQueue(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);

	        queue.enqueue(60);

	        System.out.println("Queue elements:");
	        queue.display();

	        queue.dequeue();
	        queue.dequeue();


	        System.out.println("Front element of the queue: " + queue.front());

	        System.out.println("Queue elements after dequeuing:");
	        queue.display();
	    }
	
}
