/*��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 *���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
package JZOffer;

public class KGTH {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We Are Happy");
		System.out.println(str);
		String s = KGTH.replaceSpace(str);
		System.out.println(s);
	}

	public static String replaceSpace(StringBuffer str) {
		int index = 0;
		while (index != -1) {
			index = str.indexOf(" ", index);
			if (index == -1) {
				break;
			}
			str.deleteCharAt(index);
			str.insert(index, "%20");
		}
		return str.toString();

	}
}
