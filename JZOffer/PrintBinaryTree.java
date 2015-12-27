package JZOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印
public class PrintBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//queue存放节点，节点按照从上向下从左向右的顺序入队，每个节点出队时就把他的左右子节点入队，然后节点的值加入到list中
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
