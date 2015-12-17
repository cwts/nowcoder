package JZOffer;

//输入两棵二叉树A、B，判断B是不是A的子树
public class SubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public boolean HasSubTree(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return false;
		if (root1 == null && root2 != null)
			return false;
		boolean flag = false;
		// 从root1的根节点开始和root2的根节点比较，如果相等就用IsSubTree逐一比较其余节点
		if (root1.val == root2.val) {
			flag = IsSubTree(root1, root2);
		}
		// 如果不等，用root1根节点的左右子节点和root2的根节点比较
		if (!flag) {
			flag = HasSubTree(root1.left, root2);
			if (!flag)
				flag = HasSubTree(root1.right, root2);
		}
		return flag;
	}

	public boolean IsSubTree(TreeNode root1, TreeNode root2) {
		// 递归，逐一比较每个节点左右子树，如果root2==null表明一直比到最底层一个节点都是相同的
		if (root2 == null)
			return true;
		// 如果root1==null&root2!=null，表明root2后面还有节点，而root1没了，不能包含
		if (root1 == null & root2 != null) {
			return false;
		}
		if (root2.val == root1.val) {
			return IsSubTree(root1.left, root2.left)
					&& IsSubTree(root1.right, root2.right);
		}
		return false;
	}

}
