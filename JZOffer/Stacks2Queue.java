package JZOffer;
//������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint����
import java.util.Stack;
/*<����>��
 ��ӣ���Ԫ�ؽ�ջA
 ���ӣ��ж�ջB�Ƿ�Ϊ�գ����Ϊ�գ���ջA������Ԫ��pop����push��ջB��ջB��ջ��
 �����Ϊ�գ�ջBֱ�ӳ�ջ
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
