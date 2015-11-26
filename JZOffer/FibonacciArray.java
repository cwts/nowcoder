package JZOffer;
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。F(0)=0,F(1)=1,F(n)=F(n-1)+F(n-2),n>=2
public class FibonacciArray {
	public static void main(String[] args) {
		FibonacciArray test=new FibonacciArray();
		System.out.println(test.Fibonacci(33));
	}
//是迭代（Iteration） VS 递归（Recursion）
	
//递归法如下，当n很大时会造成栈溢出，因为每一次都将F（0）和F（1）存起来
//	public int Fibonacci(int n) {
//		if (n==0) {
//			return 0;
//		}else if (n==1) {
//			return 1;
//		}
//		else 
//			return Fibonacci(n-1)+Fibonacci(n-2);
//    }
	
//迭代法如下，会造成空间复杂度高，但不会栈溢出
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
