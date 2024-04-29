package queue;

public class ArrayQueue {
	private int capacity; // generelle Größe
	private int front;
	private int rear;
	private int[] queue;

	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	
	/**
	 * Überprüft, ob die Queue leer ist.
	 * 
	 * @return true, wenn die Queue leer ist, ansonsten false
	 */
	public boolean isEmpty() {
	    if(front == rear) {
	        return true;
	    }
	    return false;
	}

	/**
	 * Überprüft, ob die Queue voll ist.
	 * 
	 * @return true, wenn die Queue voll ist, ansonsten false
	 */
	public boolean isFull() {
	    if(rear == capacity) {
	        return true;
	    }
	    return false;
	}

	/**
	 * Fügt ein Element am Ende der Queue hinzu, sofern die Queue nicht voll ist.
	 * 
	 * @param element das Element, das hinzugefügt werden soll
	 */
	public void enqueue(int element) {
	    if(!isFull()) {
	        queue[rear] = element;
	        rear++;
	    } else {
	        System.out.println("Queue is full!");
	    }
	}

	/**
	 * Entfernt das Element am Anfang der Queue, sofern die Queue nicht leer ist.
	 */
	public void dequeue() {
	    if(!isEmpty()) {
	        for(int i = 0; i < rear-1; i++) {
	            queue[i] = queue[i+1];
	        }
	        if(rear < capacity) {
	            queue[rear] = 0;
	        }
	        rear--;
	    } else {
	        System.out.println("Queue is empty!");
	    }
	}

	/**
	 * Gibt das Element am Anfang der Queue zurück.
	 * 
	 * @return das Element am Anfang der Queue, oder -1, wenn die Queue leer ist
	 */
	public int front() {
	    if(!isEmpty()) {
	        return queue[front];
	    }
	    return -1; // keine saubere Lösung -> Exception Handling
	}

	/**
	 * Zeigt alle Elemente in der Queue an.
	 */
	public void display() {
	    if(!isEmpty()) {
	        for(int i = 0; i < rear-1; i++) {
	            System.out.println(queue[i]);
	        }
	    } else {
	        System.out.println("Queue is empty!");
	    }
	}}

