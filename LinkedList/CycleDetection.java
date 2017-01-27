package LeetCodeQuestions;

import LinkedListImplementation.Node;

/**
 * To detect the cycle in LinkedList
 * @author pranaysampat
 *
 */

public class CycleDetection {
	/**
	 * Definition for singly-linked list.
	 * class Node {
	 *     int val;
	 *     Node next;
	 *     Node(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	
	    public boolean hasCycle(Node head) {
	        //we create two pointers, one that will traverse twice than other, if cycle is present the slower one will meet faster one.
	        // The time complexity remains as O(n) and spaceComplexity is O(1) for using fastPtr and SlowPtr
	    	Node fastPtr = head;
	        Node slowPtr = head;
	        while(fastPtr != null && fastPtr.getNext() != null){
	            fastPtr = fastPtr.getNext().getNext();
	            slowPtr = slowPtr.getNext();
	            if(slowPtr == fastPtr){
	                return true;
	            }
	        }
	        return false;
	    }
	

}
