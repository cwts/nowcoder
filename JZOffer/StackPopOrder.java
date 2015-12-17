package JZOffer;
import java.util.Stack;

//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个栈是否为该栈的弹出顺序。
public class StackPopOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pushA=new int[]{1,2,3,4,5};
		int [] pushB=new int[]{5,4,3,2,1};
		StackPopOrder test=new StackPopOrder();
		System.out.println(test.IsPopOrder(pushA, pushB));

	}
	public boolean IsPopOrder(int [] pushA,int [] pushB) {
		Stack<Integer> stack =new Stack<Integer>();
		if (pushA.length==0&&pushB.length==0) {
			return true;
		}
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
		}
		int j=0;
		while (!stack.isEmpty()&&(stack.peek().intValue()==pushB[j])) {
				stack.pop();
				j++;
			}
		return stack.isEmpty()==true;
		}
}
	


