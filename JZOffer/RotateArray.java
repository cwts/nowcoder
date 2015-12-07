package JZOffer;
/* 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减序列的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * 
 * 分析：旋转数组的特点，数组分成两个子数组，两个子数组都是非递减数组，且第一个数组元素大于等于第二个数组的元素。
 * 		最小元素就是两个数组的分界。使用二分法查找
 * 
 * 
 */
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RotateArray test=new RotateArray();
        int [] array = {1,2,2,2,2,2};
        int result= test.minNumberInRotateArray(array);
        System.out.println(result);
	}
	public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0)
        	return 0;
        int low=0;
        int high=array.length-1;
        int mid=0;
        while(array[low]>=array[high])
        {
        	if((high-low)==1)
        	{
        		mid=high;
        		break;
        	}
        	mid=(high+low)/2;
        	//对于有重复元素的数组，如｛1，0，1，1，1｝ 和 ｛1，1， 1，0，1｝，特殊处理
        	if(array[low]==array[high]&&array[low]==array[mid])
        		return MinOrder(array,low,high);
        	//对于没有重复元素的递增数组，二分查找
        	else {
        		//如果中间元素大于第一个元素，则中间元素位于前面的递增子数组，此时最小元素位于中间元素的后面。
        		//我们可以让第一个指针low指向中间元素。
        		if(array[mid]>=array[low])
            		low=mid;
        		//如果中间元素小于第一个元素，则中间元素位于后面的递增子数组，此时最小元素位于中间元素的前面。
        		//我们可以让第二个指针high指向中间元素。
            	else 
            		high=mid;
			}
        	       	
        }
        //当high-low=1时,low为前一个数组的最后一个元素，high为后一个数组的第一个元素,array[high]即为最小值
        return array[mid];
        		
        
    }

	private int MinOrder(int[] num,int left,int right){
	        int result = num[left];
	        for(int i = left + 1;i < right;++i){
	            if(num[i] < result){
	                result = num[i];
	            }//if
	        }//for
	        return result;
	    }
	
}
