/*
 * Reverse a singly linked list.
 * 
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
    	
        ListNode processNode = head;
        ListNode prevNode = null;
        ListNode nextNode = head.next;
        
        head.next = null;
        
        while (true) {
            prevNode = processNode;
            processNode = nextNode;
            
            if (processNode != null) {
            	nextNode = processNode.next;
                processNode.next = prevNode;
                
            }
            else {
                break;
            }
        }
        
        return prevNode;
    }

}
