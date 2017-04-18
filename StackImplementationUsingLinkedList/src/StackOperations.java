
public class StackOperations {
	private ListNode head;
	private int size;
	public StackOperations(){
		head = null;
		size = 0;
	}
	public void push(int data){
		ListNode newNode = new ListNode(data);
		newNode.setNext(head);
		head = newNode;
		size ++;
		System.out.println("Pushed " + newNode.getData() + " on stack successfully");
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void pop(){
		if(size == 0){
			System.out.println("Stack is Empty");
		}
		int temp = head.getData();
		head = head.getNext();
		System.out.println("Element with value :" + temp + "has been poped");
		size -- ;
	}
	
	public void peek(){
		if(size == 0){
			System.out.println("Stack is Empty");
		}
		System.out.println("Peek is :" + head.getData());
	}
	
	public void printStack(){
	
		System.out.println("Stack is ");
		System.out.print("[");
		ListNode temp = head;
		while(temp != null){
			System.out.print(" " +temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.print("]");
		System.out.println();
	}
}
