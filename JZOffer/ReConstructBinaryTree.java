package JZOffer;

/*输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class ReConstructBinaryTree {
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null) {
			return null;
		}
		TreeNode tree = reConstructCore(pre, in, 0, pre.length - 1, 0,
				in.length - 1);
		return tree;
	}

	/**
	 * 核心算法，preStart和preEnd是起始下标和结束下标 1.先求出根节点（前序序列第一个元素）。
	 * 2.将根节点带入到中序遍历序列中求出左右子树的中序遍历序列。 3.通过左右子树的中序序列元素集合带入前序遍历序列可以求出左右子树的前序序列。
	 * 4.左右子树的前序序列第一个元素分别是根节点的左右儿子 5.求出了左右子树的4种序列可以递归上述步骤
	 **/
	public static TreeNode reConstructCore(int[] pre, int[] in, int preStart,
			int preEnd, int inStart, int inEnd) {
		TreeNode tree = new TreeNode(pre[preStart]);
		tree.left = null;
		tree.right = null;
		// if (preStart == preEnd && inStart == inEnd) {
		// return tree;
		// }
		// 记录中序遍历中等于前序遍历的第一位的下标
		int inCenter = 0;
		for (inCenter = inStart; inCenter < inEnd; inCenter++) {
			if (in[inCenter] == pre[preStart]) {
				break;
			}
		}
		// 左子树的长度
		int leftTreeLength = inCenter - inStart;
		// 右子数的长度
		int rightTreeLength = inEnd - inCenter;
		// 重构左子树，preStart + 1到 preStart+leftTreeLength获取左子树的先序序列，
		// inStart到inCenter - 1获取左子树的中序序列
		if (leftTreeLength > 0) {
			tree.left = reConstructCore(pre, in, preStart + 1, preStart
					+ leftTreeLength, inStart, inCenter - 1);
		}
		// 重构右子树，方法同上
		if (rightTreeLength > 0) {
			tree.right = reConstructCore(pre, in,
					preStart + leftTreeLength + 1, preEnd, inCenter + 1, inEnd);
		}
		return tree;

	}

	// 后须输出
	public static void traverseBinTreeRDL(TreeNode node) {
		if (node == null) {
			return;
		}

		if (node.left != null) {
			traverseBinTreeRDL(node.left);
		}
		if (node.right != null) {
			traverseBinTreeRDL(node.right);
		}
		System.out.println(node.val);
	}

	public static void main(String[] args) {
		int pre[] = { 1, 2, 4, 7, 3, 5, 8, 9, 6 };// 先序列
		int in[] = { 4, 7, 2, 1, 8, 5, 9, 3, 6 };// 中序序列
		TreeNode tree = reConstructBinaryTree(pre, in);
		traverseBinTreeRDL(tree);
	}
}
