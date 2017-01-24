package LinkedListImplementation;

public class MainMethod {
	public static void main(String args[]){
		LinkedListT newLinkedList = new LinkedListT();
		newLinkedList.insertAtHead(5);
		newLinkedList.insertAtHead(10);
		newLinkedList.insertAtEnd(15);
		newLinkedList.addAtPosition(45, 1);
		newLinkedList.addAtPosition(77, 3);
		newLinkedList.deleteAtEnd();
		newLinkedList.deleteAtStart();
		newLinkedList.removeAtPosition(0);
		newLinkedList.printList();
	}
}
