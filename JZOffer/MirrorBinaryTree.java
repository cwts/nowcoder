package JZOffer;

//将给定的二叉树变成他的镜像:
//	元二叉树：
//                   8
//            |		           |            
//            6			       10           
//          |    |           |    |
//          5    7           9    11
//    镜像二叉树：
//          
//                   8
//          |		        |            
//          10			    6        
//        |    |         |     |
//       11    9         7     5

/*
 class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;

 TreeNode(int x) {
 val = x;
 }
 }
 */
public class MirrorBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void Mirror(TreeNode root) {
		if (root == null)
			return;
		TreeNode tmp = null;
		tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		if (root.left != null) {
			Mirror(root.left);
		}
		if (root.right != null) {
			Mirror(root.right);
		}
	}

}
