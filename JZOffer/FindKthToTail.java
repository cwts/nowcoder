package JZOffer;

//����һ����������������е�����k����㡣
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
	/*����˼·���£�����ָ�룬���õ�һ��ָ��͵ڶ���ָ�붼ָ��ͷ��㣬Ȼ�����õ�һ��ָ����(k-1)���������k���ڵ㡣
	 *Ȼ������ָ��ͬʱ�����ƶ�������һ����㵽��ĩβ��ʱ�򣬵ڶ����������λ�þ��ǵ�����k���ڵ��ˡ�
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
