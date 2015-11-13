package JZOffer;
/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class EWSZCZ {
      public static void main(String[] args) {
		int [][]arr=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
    	int target= 2 ;
    	boolean b= EWSZCZ.Find(arr, target);
    	System.out.println("result:"+b);
	  }
      //从左下角开始查找，target大则向右，target小则向左查找
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
