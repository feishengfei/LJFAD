package listing4_1;

interface Iterator {
	boolean hasMoreElements();
	Object nextElement();
}

public class ToDoList {
	private ToDo[] toDoList;
	private int index = 0;
	public ToDoList(int size) {
		toDoList = new ToDo[size];
	}
	
	public Iterator iterator(){
		class Iter implements Iterator {
			int index = 0;

			@Override
			public boolean hasMoreElements() {
				return index < toDoList.length;
			}

			@Override
			public Object nextElement() {
				return toDoList[index++];
			}
		}
		return new Iter();
	}
	
	public void add(ToDo item) {
		toDoList[index++] = item;
	}
	
	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList(5);
		toDoList.add(new ToDo("#1", "Do laundry."));
		toDoList.add(new ToDo("#2", "Buy groceries."));
		toDoList.add(new ToDo("#3", "Vacuum apartment."));
		toDoList.add(new ToDo("#4", "Write report."));
		toDoList.add(new ToDo("#5", "Wash car."));
		Iterator iter = toDoList.iterator();
		while(iter.hasMoreElements()) {
			System.out.println(iter.nextElement());
		}
	}
}
