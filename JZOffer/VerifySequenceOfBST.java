package JZOffer;
//输入一个整数数组，判断该数组是不是某二叉树的后序遍历的结果。如果是则输出yes，否则输出no。
//假设输入的数组的任意两个数字都互不相同。
public class VerifySequenceOfBST {
          
	public static void main(String[] args) {
		
	}
	public boolean VerifySquenceOfBST(int[] sequence) {
		int count=sequence.length;
		if (count==0) {
			return false;
		}
		return IsBST(sequence,0,count-1);
	}
//最后一个数一定是二叉搜索树的根节点，根节点左边的均小于根节点，右边均大于根节点，index为左右的分界位置，递归
	public boolean IsBST(int[] sequence, int start, int end) {
		if (start>=end) {
			return true;
		}
		int root=sequence[end];
		int index=start;
		//一直找到大于root的节点，index指向第一个大于root的节点
		while (sequence[index]<root&&index<end) {
			index ++;			
		}
		//如果右边的节点有小于根节点的就返回false
		for (int i = index; i < end; i++) {
			if (sequence[i]<=root) {
				return false;
			}
		}
		return IsBST(sequence, start, index-1)&&IsBST(sequence, index, end-1);
	}
}
