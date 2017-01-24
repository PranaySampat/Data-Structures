package DoubleLinkedList;

public class MainMethod {
	public static void main(String args[]){
		DoublyLinkedList dt = new DoublyLinkedList();
		dt.insertAtStart(55);
		dt.insertAtStart(44);
		dt.addAtEnd(33);
		dt.addAtEnd(108);
		dt.addAtPosition(22, 2);
		dt.deleteATEnd();
		dt.printlist();
	}
}
