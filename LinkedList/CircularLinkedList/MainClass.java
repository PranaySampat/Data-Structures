package CircularLinkedList;

public class MainClass {
	public static void main(String args[]){
		CircularLinkedListImplementation ct = new CircularLinkedListImplementation();
		ct.addAtHead(5);
		ct.addAtHead(5);
		ct.addAtHead(7);
		ct.addAtHead(11);
		ct.addAtTail(22);
		ct.addAtPosition(45, 3);
		ct.remove(45);
		ct.removeAtHead();
		ct.removeAtTail();
		ct.displayList();
	}
}
