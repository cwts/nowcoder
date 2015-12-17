package JZOffer;
//输入两个单调递增的链表，输两个链表合成后的链表，需要合成后的链表满足单调不减规则。
/*public class ListNode {
 int val;
 ListNode next =null;

 ListNode(int val)
 {
 this.val=val;
 }s
 }*/
public class ListMerge {
	public static void main(String[] args) {

	}

//不重新开辟空间，只改变节点的next指向。
	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode ls = new ListNode(0);
		ListNode head = ls;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				head.next = list1;
				head = list1;
				list1 = list1.next;
			} else {
				head.next = list2;
				head = list2;
				list2 = list2.next;
			}
		}
		while (list1 != null) {
			head.next = list1;
			head = list1;
			list1 = list1.next;    
		}
		while(list2!=null){
			head.next = list2;
			head = list2;
			list2 = list2.next;
		}
		return ls.next;
	}
}
