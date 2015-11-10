//输入一个链表，从尾到头打印链表每个节点的值。
package JZOffer;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class DYLB {
	public static void main(String[] args) {
		DYLB test = new DYLB();
		ListNode list1 = new ListNode(1);
		ListNode list2 = new ListNode(2);
		ListNode list3 = new ListNode(3);
		list1.next = list2;
		list2.next = list3;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = test.printListFromTailToHead(list1);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
    //利用栈结构，从头到尾入栈，再从尾到头出栈
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
}
