/**
@author Pranay Sampat
*/

/** Question

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

*/

//solution
/**
The solution remains simple of adding two nodes values and maintaining a carry variable if sum exceeds 10,
so first two nodes add to 7 with carry 0, while 2nd nodes results in sum 10 which proceeds with carry of 1 added to 3+4
last nodes of linkedlist
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode newList = new ListNode(0);
        ListNode newListDummy = newList;
        while(l1 != null || l2 !=null){
            if(l1 !=null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            newListDummy.next = new ListNode(carry % 10);
            newListDummy = newListDummy.next;
            carry = carry/10;
        }
        
        if(carry == 1){
            newListDummy.next = new ListNode(carry);
        }
        return newList.next;
    }
}