/*
 * Reverse a singly linked list.
 * 
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode processNode = head;
        ListNode prevNode = null;
        ListNode nextNode = head.next;
        
        if (head == null) {
            return head;
        }
        
        head.next = null;
        
        while (true) {
            prevNode = processNode;
            processNode = nextNode;
            
            if (processNode != null) {
//            	System.out.println(processNode.val);
            	nextNode = processNode.next;
                processNode.next = prevNode;
                
            }
            else {
                break;
            }
        }
        
//        prevNode.next = null;
        System.out.println(prevNode.val);
        
        return prevNode;
    }

}
