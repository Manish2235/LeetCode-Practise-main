/**
 * Definition for singly-linked list.
 *
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode previous=null;

	ListNode current=node;
	while(current.next!=null)
	{
        current.val=current.next.val;
		previous=current;
		current=current.next;
	}
	previous.next=null;
	    
    }
}