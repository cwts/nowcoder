package JZOffer;

//�������ö�����A��B���ж�B�ǲ���A������
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
		// ��root1�ĸ��ڵ㿪ʼ��root2�ĸ��ڵ�Ƚϣ������Ⱦ���IsSubTree��һ�Ƚ�����ڵ�
		if (root1.val == root2.val) {
			flag = IsSubTree(root1, root2);
		}
		// ������ȣ���root1���ڵ�������ӽڵ��root2�ĸ��ڵ�Ƚ�
		if (!flag) {
			flag = HasSubTree(root1.left, root2);
			if (!flag)
				flag = HasSubTree(root1.right, root2);
		}
		return flag;
	}

	public boolean IsSubTree(TreeNode root1, TreeNode root2) {
		// �ݹ飬��һ�Ƚ�ÿ���ڵ��������������root2==null����һֱ�ȵ���ײ�һ���ڵ㶼����ͬ��
		if (root2 == null)
			return true;
		// ���root1==null&root2!=null������root2���滹�нڵ㣬��root1û�ˣ����ܰ���
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
