
public class MainClass {
		public static void main(String args[]){
			StackOperations stackOperations = new StackOperations();
			System.out.println("Pushing 55 on stack");
			stackOperations.push(55);
			System.out.println("Pushing 11 on stack");
			stackOperations.push(11);
			stackOperations.printStack();
			System.out.println("Size of Stack is " + stackOperations.getSize());
			stackOperations.pop();
			stackOperations.peek();
		}
}
