package listing4_1;

public class ToDoList {
	private ToDoArray toDoArray;
	private int index = 0;
	
	public ToDoList() {
		super();
		toDoArray = new ToDoArray(2);
	}
	
	public boolean hasMoreElements() {
		return index < toDoArray.size();
	}
	
	public ToDo nextElement() {
		return toDoArray.get(index++);
	}
	
	public void add(ToDo item) {
		toDoArray.add(item);
	}

	private class ToDoArray {
		private ToDo[] toDoArray;
		private int index = 0;
		public ToDoArray(int initSize) {
			super();
			toDoArray = new ToDo[initSize];
		}
		
		void add(ToDo item) {
			if ( index >= toDoArray.length) {
				ToDo[] temp = new ToDo[toDoArray.length * 2];
				for (int i = 0; i < toDoArray.length; i++) {
					temp[i] = toDoArray[i];
				}
				toDoArray = temp;
			}
			toDoArray[index++] = item;
		}
		
		ToDo get(int i) {
			return toDoArray[i];
		}
		
		int size() {
			return index;
		}
	}
	
	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		toDoList.add(new ToDo("#1", "Do laundry."));
		toDoList.add(new ToDo("#2", "Buy groceries."));
		toDoList.add(new ToDo("#3", "Vacuum apartment."));
		toDoList.add(new ToDo("#4", "Write report."));
		toDoList.add(new ToDo("#5", "Wash car."));
		while (toDoList.hasMoreElements()) {
			System.out.println(toDoList.nextElement());
		}
	}
}
