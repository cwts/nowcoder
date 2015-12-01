package JZOffer;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class BTJumpFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTJumpFloor test = new BTJumpFloor();
		System.out.println(test.JumpFloorII(11));
	}

	/*
	 * 因为n级台阶，第一步有n种跳法：跳1级、跳2级、到跳n级 跳1级，剩下n-1级，则剩下跳法是f(n-1)
	 * 跳2级，剩下n-2级，则剩下跳法是f(n-2) 所以f(n)=f(n-1)+f(n-2)+...+f(1)+f(0)
	 * 因为f(n-1)=f(n-2)+f(n-3)+...+f(1)+f(0) 所以f(n)=2*f(n-1),f(0)=1,f(1)=1
	 */
	public int JumpFloorII(int target) {
		int stepts = 1;
		if (target >= 2) {
			for (int i = 1; i <= target - 1; i++) {
				stepts = 2 * stepts;
			}
			// stepts=2*JumpFloorII(target-1);
			// 使用迭代，不递归，上面的for等价于
			// stepts=(int) Math.pow(2, target-1);
		}
		return stepts;
	}

}
