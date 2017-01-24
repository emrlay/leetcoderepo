package TestDriver;

import org.junit.Test;

import add_two_numbers.*;
import utils.Util;

public class addTwoNumbersTest {
	
	@Test
	public void Test(){
		ListNode l1 = buildList(new int[]{5});
		ListNode l2 = buildList(new int[]{5});
		Util.printLinkedList(l1);
		Util.printLinkedList(l2);
		ListNode res = Original.addTwoNumbers(l1, l2);
		Util.printLinkedList(res);
	}
	
	private ListNode buildList(int[] numbers){
		ListNode result = new ListNode(0);
		ListNode p = result;
		for(int number : numbers){
			ListNode newnode = new ListNode(number);
			p.next = newnode;
			p = newnode;
		}
		return result.next;
	}

}
