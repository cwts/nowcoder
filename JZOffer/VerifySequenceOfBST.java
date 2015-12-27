package JZOffer;
//����һ���������飬�жϸ������ǲ���ĳ�������ĺ�������Ľ��������������yes���������no��
//�������������������������ֶ�������ͬ��
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
//���һ����һ���Ƕ����������ĸ��ڵ㣬���ڵ���ߵľ�С�ڸ��ڵ㣬�ұ߾����ڸ��ڵ㣬indexΪ���ҵķֽ�λ�ã��ݹ�
	public boolean IsBST(int[] sequence, int start, int end) {
		if (start>=end) {
			return true;
		}
		int root=sequence[end];
		int index=start;
		//һֱ�ҵ�����root�Ľڵ㣬indexָ���һ������root�Ľڵ�
		while (sequence[index]<root&&index<end) {
			index ++;			
		}
		//����ұߵĽڵ���С�ڸ��ڵ�ľͷ���false
		for (int i = index; i < end; i++) {
			if (sequence[i]<=root) {
				return false;
			}
		}
		return IsBST(sequence, start, index-1)&&IsBST(sequence, index, end-1);
	}
}
