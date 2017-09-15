
public class Tester {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		traverseList(node1);
		System.out.println("");
		ReverseLinkedList ob = new ReverseLinkedList();
		ListNode result = ob.reverseList(node1);
		System.out.println(result.val);
		traverseList(result);
//		System.out.println(node1.next.val);
	}
	
	public static void traverseList(ListNode head) {
		if (head == null) {
			return;
		}
		
		System.out.print(head.val + " ");
		traverseList(head.next);
	}

}
