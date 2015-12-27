package JZOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ
public class PrintBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//queue��Žڵ㣬�ڵ㰴�մ������´������ҵ�˳����ӣ�ÿ���ڵ����ʱ�Ͱ����������ӽڵ���ӣ�Ȼ��ڵ��ֵ���뵽list��
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if (root==null) {
			return list;
		}
		queue.offer(root);
		while (!queue.isEmpty()) {
		    TreeNode node=queue.poll();
		    if (node.left!=null) {
				queue.offer(node.left);
			}
		    if (node.right!=null) {
				queue.offer(node.right);
			}
			list.add(node.val);
		}
		return list;
	}
}
