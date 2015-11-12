package JZOffer;
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
import java.util.Stack;
/*<分析>：
 入队：将元素进栈A
 出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
 如果不为空，栈B直接出栈
 */
public class Stacks2Queue {
	private  Stack<Integer> stack1 = new Stack<Integer>();
	private  Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks2Queue test=new Stacks2Queue();
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println(test.pop());
		System.out.println(test.pop());
        test.push(4);
        System.out.println(test.pop());
		System.out.println(test.pop());
	}

}
