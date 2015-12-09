package JZOffer;
//输入一个链表，反转链表后，输出链表的所有元素。
/*class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class ReverseList {
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
	    l1.next=l2;
	    l2.next=l3;
	    l3.next=null;
	    ReverseList test=new ReverseList();
	    ListNode rl=test.ReverseListnode(l1);
	    while (rl!=null) {
			System.out.println(rl.val);
			rl=rl.next;
		}
	}	
	//p指向当前节点，h指向p的前一个节点，tmp指向p的后一个节点，将p.next指向h即可，挨个向后移动
	public ListNode ReverseListnode(ListNode head) {
		ListNode p=head;
		ListNode h=null;
		while(p!=null){
			ListNode tmp=p.next;
			p.next=h;
			h=p;
			p=tmp;
		}
		return h;
    }
}
