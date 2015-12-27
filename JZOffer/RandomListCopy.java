package JZOffer;
//����һ����������ÿ���ڵ����нڵ�ֵ�Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��Ҫ�����һ�������������Ŀ���
class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}

public class RandomListCopy {
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		RandomListNode curret = pHead;
		// �Ȳ�����randomָ�룬��ÿһ���ڵ㴴��һ���µĽڵ㣬�½ڵ��nextָ��ָ��ԭ�ڵ��next�ڵ㣬ԭ�ڵ��nextָ���½ڵ�
		while (curret != null) {
			RandomListNode node = new RandomListNode(curret.label);
			node.next = curret.next;
			curret.next = node;
			curret = curret.next;
		}
		// �ٿ���randomָ���ָ��currentʼ��ָ��ԭ���Ľڵ㣬current.nextָ���µĽڵ㣬���ǣ��½ڵ��random����current��random
		curret = pHead;
		while (curret != null) {
			if (curret.random != null) {
				curret.next.random = curret.random;
			}
			curret = curret.next.next;
		}		
		//����ڰ��¾ɽڵ�֮������ӶϿ����ڵ��next.next�ڵ���Ǳ���Ӧ���ǵ�next��pnewָ���������ͷ���
		curret = pHead;
		RandomListNode pnew = curret.next;
		RandomListNode temp = pnew;
		while (curret != null) {
			curret.next = curret.next.next;
			if (temp.next != null) {
				temp.next = temp.next.next;
			}
			curret = curret.next;
			temp = temp.next;
		}
		return pnew;
	}

}
