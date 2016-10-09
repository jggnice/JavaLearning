import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork9 {
	/**
	 * <p align = "center">
	 * <font color = "red"> <i> main方法 </i> </font>
	 */
	public static void main(String[] args) {
		ArrayList<String> ss = new ArrayList<String>();
		String[] words = { "个位：", "十位：", "百位：", "千位：", "万位：", "十万位：", "百万位：","千万位：", "亿位：" };
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员卡号码(0-9位)：");
		int value;

		try {
			value = input.nextInt();
			System.out.println("会员卡号为：" + value);
			int value1 = value;
			int sum = 0;
			int i = 0;
			while (value1 > 0) {
				int num = value1 % 10;
				value1 = value1 / 10;
				ss.add(words[i++] + num);
				sum += num;
			}

			input.close();

			for (int j = ss.size() - 1; j >= 0; j--) {
				System.out.println(ss.get(j));
			}
			System.out.println("各位之和：" + sum);
		} catch (Exception e) {
			System.out.println("数据格式不对");
			// e.printStackTrace();
		}
	}

	/* --- The End --- */
}