package JZOffer;

//输入一个链表，输出该链表中倒数第k个结点。
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindKthToTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode [] list=new ListNode[10];
		for(int i=0;i<list.length;i++)
		{
			list[i]=new ListNode(i);
		}
		for(int i=0;i<list.length;i++)
		{
			if (i==list.length-1) {
				list[i].next=null;
			}
		    else {
				list[i].next=list[i+1];
			}
		}
		ListNode iter=list[0];
		while(iter!=null){
			System.out.println(iter.val);
			iter=iter.next;
		}
		FindKthToTail test =new FindKthToTail();
		System.out.println(test.ReturnkthNode(list[0],11));
	}
	/*代码思路如下：两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点。
	 *然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。
	 */
   public ListNode ReturnkthNode(ListNode head,int k) {
        if (head==null||k<=0) {
			return null;
		}
        ListNode first=head;
        ListNode second=head;
        for(int i=1;i<k;i++)
        {
        	if (first.next!=null) {
				first=first.next;
			}
        	else {
				return null;
			}
        }
        while (first.next!=null) {
			first=first.next;
			second=second.next;
		}
       return second;
    }

}
