package listing5_1;

public class Queue<E>
{
	private E[] elements;
	private int head, tail;
	
	@SuppressWarnings("unchecked")
	public Queue(int size) {
		elements = (E[]) new Object[size];
		head = 0;
		tail = 0;
	}
	
	public void insert(E element) {
		if(isFull()) {
			return;
		}
		elements[tail] = element;
		tail = (tail+1)%elements.length;
	}
	
	public E remove() {
		if(isEmpty()) {
			return null;
		}
		E element = elements[head];
		head = (head+1)%elements.length;
		return element;
	}

	private boolean isEmpty() {
		return head == tail;
	}

	private boolean isFull() {
		return (tail + 1)%elements.length == head;
	}
	
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>(5);
		System.out.println(queue.isEmpty());
		queue.insert("A");
		queue.insert("B");
		queue.insert("C");
		queue.insert("D");
		queue.insert("E");
		System.out.println(queue.isFull());
		System.out.println(queue.remove());
		queue.insert("F");
		while(!queue.isEmpty())
			System.out.println(queue.remove());
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
	}
	
}
