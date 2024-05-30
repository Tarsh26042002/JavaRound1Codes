package practice.helloword;

import java.util.*;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x) {val = x;}
}

public class PracticeClass2 {
	public static ListNode rotateRight(ListNode head,int k) {
		if(head == null || head.next ==null || k==0) {
			return head;
		}
		
		ListNode current = head;
		int length = 1;
		while(current.next!=null) {
			current = current.next;
			length++;
		}
		
		current.next = head;
		
		k = k%length;//normalise k so it could be between the length of the list
		
		int stepsToNewHead = length -k;
		current = head;
		for(int i = 0;i<stepsToNewHead -1;i++) {
			current = current.next;
		}
		
		ListNode newHead = current.next;
		current.next = null;
		
		return newHead;
				
		
	}
	public static void printList(ListNode head) {
		ListNode current  =head;
		while(current!=null) {
			System.out.println(current.val+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static ListNode createList(int[] values) {
		if(values.length==0) return null;
		ListNode head = new ListNode(values[0]);
		ListNode current = head;
		for(int i = 1;i<values.length;i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
		}
		return head;
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of that list: ");
		int size = scanner.nextInt();
		
		int[] values = new int[size];
		System.out.println("Enter the list elements: ");
		
		for(int i = 0;i<size; i++) {
			values[i] = scanner.nextInt();
		}
		
		ListNode head = createList(values);
		
		System.out.println("Enter the number of rotations: ");
		int k = scanner.nextInt();
		
		head = rotateRight(head, k);
		
		System.out.println("Rotated list: ");
		printList(head);
		
		scanner.close();
	}
}
