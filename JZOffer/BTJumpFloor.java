package JZOffer;

//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
public class BTJumpFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTJumpFloor test = new BTJumpFloor();
		System.out.println(test.JumpFloorII(11));
	}

	/*
	 * ��Ϊn��̨�ף���һ����n����������1������2��������n�� ��1����ʣ��n-1������ʣ��������f(n-1)
	 * ��2����ʣ��n-2������ʣ��������f(n-2) ����f(n)=f(n-1)+f(n-2)+...+f(1)+f(0)
	 * ��Ϊf(n-1)=f(n-2)+f(n-3)+...+f(1)+f(0) ����f(n)=2*f(n-1),f(0)=1,f(1)=1
	 */
	public int JumpFloorII(int target) {
		int stepts = 1;
		if (target >= 2) {
			for (int i = 1; i <= target - 1; i++) {
				stepts = 2 * stepts;
			}
			// stepts=2*JumpFloorII(target-1);
			// ʹ�õ��������ݹ飬�����for�ȼ���
			// stepts=(int) Math.pow(2, target-1);
		}
		return stepts;
	}

}
