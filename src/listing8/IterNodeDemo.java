package listing8;

class Node
{
	String name;
	Node next;
}

public class IterNodeDemo {

	public static void main(String[] args) {
		Node first = new Node();
		first.name = "First node";
		Node last = new Node();
		last.name = "Last node";
		last.next = null;
		first.next = last;
		Node temp = first;
		while(temp != null) {
			System.out.println(temp.name);
			temp = temp.next;
		}
	}

}
