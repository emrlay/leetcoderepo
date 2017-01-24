package utils;

import add_two_numbers.*;

public class Util {
	/**
	 * Generic method to output an array of type integer
	 * @param ts array to output
	 */
	public static void printIntArr(int[] ts){
		for(int t : ts){
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	/**
	 * Method to output a linked list
	 * @param l linked list to output
	 */
	public static void printLinkedList(ListNode l){
		while(l != null){
			System.out.print(l.val+" ");
			l = l.next;
		}
		System.out.println();
	}

}
