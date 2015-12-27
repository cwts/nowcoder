package JZOffer;
//输入一个复杂链表（每个节点中有节点值以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），要求输出一个这个复杂链表的拷贝
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
		// 先不考虑random指针，对每一个节点创建一个新的节点，新节点的next指针指向原节点的next节点，原节点的next指向新节点
		while (curret != null) {
			RandomListNode node = new RandomListNode(curret.label);
			node.next = curret.next;
			curret.next = node;
			curret = curret.next;
		}
		// 再考虑random指针的指向，current始终指向原来的节点，current.next指向新的节点，于是，新节点的random就是current的random
		curret = pHead;
		while (curret != null) {
			if (curret.random != null) {
				curret.next.random = curret.random;
			}
			curret = curret.next.next;
		}		
		//最后在把新旧节点之间的链接断开，节点的next.next节点就是本来应该是的next，pnew指向新链表的头结点
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
