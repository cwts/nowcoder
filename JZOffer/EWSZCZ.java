package JZOffer;
/*
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class EWSZCZ {
      public static void main(String[] args) {
		int [][]arr=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
    	int target= 2 ;
    	boolean b= EWSZCZ.Find(arr, target);
    	System.out.println("result:"+b);
	  }
      //�����½ǿ�ʼ���ң�target�������ң�targetС���������
	 public static boolean Find(int [][] array,int target) {
		 
		int m=array.length-1;
		int n=0;
		while (m>=0&&n<=array[0].length-1){
			if (target<array[m][n]) {
				m--;				
			}
			else if (target>array[m][n]) {
				n++;				
			}
			else {
				return true;
			}
		}
       return false;
	  }
}
