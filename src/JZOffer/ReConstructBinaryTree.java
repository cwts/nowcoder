package JZOffer;

/*����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 *���������ǰ���������������Ľ���ж������ظ������֡�
 *��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ�������������
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
	 * �����㷨��preStart��preEnd����ʼ�±�ͽ����±� 1.��������ڵ㣨ǰ�����е�һ��Ԫ�أ���
	 * 2.�����ڵ���뵽������������������������������������С� 3.ͨ��������������������Ԫ�ؼ��ϴ���ǰ��������п����������������ǰ�����С�
	 * 4.����������ǰ�����е�һ��Ԫ�طֱ��Ǹ��ڵ�����Ҷ��� 5.���������������4�����п��Եݹ���������
	 **/
	public static TreeNode reConstructCore(int[] pre, int[] in, int preStart,
			int preEnd, int inStart, int inEnd) {
		TreeNode tree = new TreeNode(pre[preStart]);
		tree.left = null;
		tree.right = null;
		// if (preStart == preEnd && inStart == inEnd) {
		// return tree;
		// }
		// ��¼��������е���ǰ������ĵ�һλ���±�
		int inCenter = 0;
		for (inCenter = inStart; inCenter < inEnd; inCenter++) {
			if (in[inCenter] == pre[preStart]) {
				break;
			}
		}
		// �������ĳ���
		int leftTreeLength = inCenter - inStart;
		// �������ĳ���
		int rightTreeLength = inEnd - inCenter;
		// �ع���������preStart + 1�� preStart+leftTreeLength��ȡ���������������У�
		// inStart��inCenter - 1��ȡ����������������
		if (leftTreeLength > 0) {
			tree.left = reConstructCore(pre, in, preStart + 1, preStart
					+ leftTreeLength, inStart, inCenter - 1);
		}
		// �ع�������������ͬ��
		if (rightTreeLength > 0) {
			tree.right = reConstructCore(pre, in,
					preStart + leftTreeLength + 1, preEnd, inCenter + 1, inEnd);
		}
		return tree;

	}

	// �������
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
		int pre[] = { 1, 2, 4, 7, 3, 5, 8, 9, 6 };// ������
		int in[] = { 4, 7, 2, 1, 8, 5, 9, 3, 6 };// ��������
		TreeNode tree = reConstructBinaryTree(pre, in);
		traverseBinTreeRDL(tree);
	}
}
