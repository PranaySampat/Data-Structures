package CircularLinkedList;

public class CircularLinkedListImplementation {
	private Node tail;
	private int size;
	public CircularLinkedListImplementation(){
		tail = null;
		size = 0;
	}
	public int getSize(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public void addAtHead(int data){
		Node newNode = new Node(data);
		if(tail == null){
			tail = newNode;
			tail.setNext(tail);
		}
		newNode.setNext(tail.getNext());
		tail.setNext(newNode);
		size ++;
	}
	public void addAtTail(int data){
		Node newNode = new Node(data);
		if(tail == null){
			tail = newNode;
			tail.setNext(tail);
		}
		newNode.setNext(tail.getNext());
		tail.setNext(newNode);
		// Need update the new tail
		tail = newNode;
	}
	// adding at position remains same as Singly Linked List
	public void addAtPosition(int data, int position){
		if(position == 0){
			addAtHead(data);
		}
		else if(position == size + 1){
			addAtTail(data);
		}
		else{
			//keeping the head Node
			Node tempNode = tail.getNext();
			Node newNode = new Node(data);
			for(int i =1 ;i<position;i++){
				tempNode = tempNode.getNext();
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
			size ++;
		}
	}
	//removing at head
	public void removeAtHead(){
		Node temp = tail.getNext();
		if(tail.getNext() == tail){
			tail = null;
			size --;
		}
		else{
			tail.setNext(temp.getNext());
			temp.setNext(null);
			size --;
		}
	}
	public void removeAtTail(){
		// to remove from tail we need to first traverse till node before tail
		Node tempNode = tail;
		while(tempNode.getNext() != tail){
			tempNode = tempNode.getNext();
		}
		// tempNode will be the one previous to tailNode
		Node temp = tail;
		if(tempNode == tail){
			tail = null;
			size --;
		}else{
			tempNode.setNext(temp.getNext());
			tail = tempNode;
			temp.setNext(null);
			size --;
		}
	}
	// removing at Position remains same as Singly LinkedList
	public int remove (int data){ // removes the node which matches the data
		if(tail == null){
			return Integer.MIN_VALUE;
		}
		Node head = tail.getNext();
		Node tailNode = tail;
		//determine the position to be removed
		for(int i=0;i<size && (!(head.getData() == data));i++){
			tailNode = head;
			head = head.getNext();
		}
		if(head.getData() == data){
			if(tail == tail.getNext()){
				tail =null; // Basically if the data was present at tail and tail is the only node
			}else{
				if(head == tail){
					tail = tailNode; // if element is found at tail, just update the tail with previous node
				}
				tailNode.setNext(tailNode.getNext().getNext());
			}
			head.setNext(null);
			size --;
			return head.getData();
		}
		return Integer.MAX_VALUE;
	}
	//display
	public void displayList(){
		Node temp = tail.getNext();
		System.out.print("[");
		
		while(temp != tail){
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.print(tail.getData() + " ");
		System.out.print("]");
	}
}
