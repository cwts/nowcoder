package JZOffer;
//��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�F(0)=0,F(1)=1,F(n)=F(n-1)+F(n-2),n>=2
public class FibonacciArray {
	public static void main(String[] args) {
		FibonacciArray test=new FibonacciArray();
		System.out.println(test.Fibonacci(33));
	}
//�ǵ�����Iteration�� VS �ݹ飨Recursion��
	
//�ݹ鷨���£���n�ܴ�ʱ�����ջ�������Ϊÿһ�ζ���F��0����F��1��������
//	public int Fibonacci(int n) {
//		if (n==0) {
//			return 0;
//		}else if (n==1) {
//			return 1;
//		}
//		else 
//			return Fibonacci(n-1)+Fibonacci(n-2);
//    }
	
//���������£�����ɿռ临�Ӷȸߣ�������ջ���
	public int Fibonacci(int n) {
		if (n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}
		else 
		{
		    int fibo1=0;
		    int fibo2=1;
		    int fibon = 0;
		    for (int i = 2; i <=n; i++) {
		    	fibon=fibo1+fibo2;
		    	fibo1=fibo2;
		        fibo2=fibon;				
			}
		    return fibon;
		}
    }
}
