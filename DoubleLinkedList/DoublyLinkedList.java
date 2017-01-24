package DoubleLinkedList;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	public DoublyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	// return size
	public int getSize(){
		return size;
	}
	//add Element at the start of LinkedList
	
	public void insertAtStart(int data){
		Node newNode = new Node(data);
		if(size == 0){
			head = newNode;
			tail = newNode;
			size ++;
		}
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		size ++;
	}
	public void addAtEnd(int data){
		Node newNode = new Node(data);
		if(size ==0){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		}
		size ++;
	}
	public void addAtPosition(int data, int position){
		if(position == 0){
			insertAtStart(data);
		}
		if(position == size + 1){
			addAtEnd(data);
		}
		Node newNode = new Node(data);
		Node tempNode = head;
		for(int i=1; i<position;i++){
			tempNode = tempNode.getNext();
		}
		tempNode.getNext().setPrev(newNode);
		newNode.setNext(tempNode.getNext());
		newNode.setPrev(tempNode);
		tempNode.setNext(newNode);
		size ++;
	}
	
	//deleting at start
	public void deleteAtStart(){
		if(size == 0){
			System.out.println("List is empty");
		}
		head = head.getNext();
		size --;
	}
	public void deleteATEnd(){
		if(size == 0){
			System.out.println("List is empty");
		}
		if(size == 1){
			deleteAtStart();
		}
		Node previousToTail = tail.getPrev();
		tail = previousToTail;
		previousToTail.setNext(null);
		size --;
	}
	public void deleteAtPosition(int position){
		if(position == 0){
			deleteAtStart();
		}
		if(position == size + 1){
			deleteATEnd();
		}
		Node temp = head;
		for(int i=1;i<position;i++){
			temp = temp.getNext();
		}
		temp.getNext().setPrev(temp.getPrev());
		temp.getPrev().setNext(temp.getNext());
		size --;
	}
	// display the list
	public void printlist(){
		Node temp = head;
		System.out.print("[");
		while(temp != null){
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.print("]");
	}
}
