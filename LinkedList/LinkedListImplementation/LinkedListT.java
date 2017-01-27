package LinkedListImplementation;

public class LinkedListT {
	public Node head;
	public int size;
	
	public LinkedListT(){
		head = null;
		size = 0;
	}
	//adding element at Beginning
	public void insertAtHead(int data){
		if(head == null){
			head = new Node(data);
			size ++;
		}else{
			Node temp = head;
			head = new Node(data);
			head.setNext(temp);
			size ++;
		}
	}
	//adding the element At End
	public void insertAtEnd(int data){
		if(head == null){
			head = new Node(data);
			size ++ ;
		}else{
			Node currentNode = head;
			while(currentNode.getNext() != null){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(new Node(data));
			size ++;
		}
	}
	//inserting the Element At Position
	public void addAtPosition(int data, int position){
		if(position < 0 || position > size + 1){
			System.out.println("Invalid Position");
		}else if(position == 0){
			insertAtHead(data);
		}else if(position == size + 1){
			insertAtEnd(data);
		}else{
			Node temp = head;
			for(int i = 1; i<position;i++){
				temp= temp.getNext();
			}
			Node newNode = new Node(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			size ++;
		}
	}
	//Deleting at Head
	
	public void deleteAtStart(){
		if(head != null){
			head = head.getNext();
			size --;
		}
	}
	//deleting at End
	public void deleteAtEnd(){
		Node currentNode = head;
		if(head.getNext() == null){
			head = null;
			size --;
		}else{
			while(currentNode.getNext().getNext() != null){
				currentNode = currentNode.getNext();
			}
			//int temp = currentNode.getNext().getData();
			currentNode.setNext(null);
			size --;
		}
	}
	//removing from position
	public void removeAtPosition(int position){
		if(position < 0 || position > size + 1){
			System.out.println("Invalid Position");
		}
		if(position == 0){
			deleteAtStart();
		}
		if(position == size + 1){
			deleteAtEnd();
		}
		Node tempNode = head;
		for(int i=1;i < position ;i ++){
			tempNode = tempNode.getNext();
		}
		//int data = tempNode.getNext().getData();
		tempNode.setNext(tempNode.getNext().getNext());
		size --;
	}
	// displaying
	
	public void printList(){
		if(head == null){
			System.out.println("Empty");
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.getData() + "-->");
			temp = temp.getNext();
		}
	}
}
