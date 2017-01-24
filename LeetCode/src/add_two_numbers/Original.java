package add_two_numbers;

public class Original {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode p = result;
		int carry = 0;
		//traverse the two linked-list and do element-wise add ops.
		//it seems that '? :' may get a better performance?
		while(l1 != null || l2 != null || carry != 0){
			ListNode newnode = new ListNode(0);
			int val1 = 0, val2 = 0;
			if (l1 != null)
				val1 = l1.val;
			if (l2 != null)
				val2 = l2.val;
			int number = val1 + val2 + carry;
			carry = number / 10;
			newnode.val = number % 10;
			p.next = newnode;
			p = newnode;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		return result.next;
        
    }

}
