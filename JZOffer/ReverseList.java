package JZOffer;
//����һ��������ת�����������������Ԫ�ء�
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
	//pָ��ǰ�ڵ㣬hָ��p��ǰһ���ڵ㣬tmpָ��p�ĺ�һ���ڵ㣬��p.nextָ��h���ɣ���������ƶ�
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
