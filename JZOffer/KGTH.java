/*请实现一个函数，将一个字符串中的空格替换成“%20”。
 *例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
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
