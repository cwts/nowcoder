package JZOffer;
//��������������������������������ϳɺ��������Ҫ�ϳɺ���������㵥����������
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

//�����¿��ٿռ䣬ֻ�ı�ڵ��nextָ��
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
