package JZOffer;
/* ��Ŀ����һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ����е�һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * 
 * ��������ת������ص㣬����ֳ����������飬���������鶼�Ƿǵݼ����飬�ҵ�һ������Ԫ�ش��ڵ��ڵڶ��������Ԫ�ء�
 * 		��СԪ�ؾ�����������ķֽ硣ʹ�ö��ַ�����
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
        	//�������ظ�Ԫ�ص����飬���1��0��1��1��1�� �� ��1��1�� 1��0��1�������⴦��
        	if(array[low]==array[high]&&array[low]==array[mid])
        		return MinOrder(array,low,high);
        	//����û���ظ�Ԫ�صĵ������飬���ֲ���
        	else {
        		//����м�Ԫ�ش��ڵ�һ��Ԫ�أ����м�Ԫ��λ��ǰ��ĵ��������飬��ʱ��СԪ��λ���м�Ԫ�صĺ��档
        		//���ǿ����õ�һ��ָ��lowָ���м�Ԫ�ء�
        		if(array[mid]>=array[low])
            		low=mid;
        		//����м�Ԫ��С�ڵ�һ��Ԫ�أ����м�Ԫ��λ�ں���ĵ��������飬��ʱ��СԪ��λ���м�Ԫ�ص�ǰ�档
        		//���ǿ����õڶ���ָ��highָ���м�Ԫ�ء�
            	else 
            		high=mid;
			}
        	       	
        }
        //��high-low=1ʱ,lowΪǰһ����������һ��Ԫ�أ�highΪ��һ������ĵ�һ��Ԫ��,array[high]��Ϊ��Сֵ
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
