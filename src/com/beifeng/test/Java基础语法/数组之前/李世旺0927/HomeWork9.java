import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork9 {
	/**
	 * <p align = "center">
	 * <font color = "red"> <i> main���� </i> </font>
	 */
	public static void main(String[] args) {
		ArrayList<String> ss = new ArrayList<String>();
		String[] words = { "��λ��", "ʮλ��", "��λ��", "ǧλ��", "��λ��", "ʮ��λ��", "����λ��","ǧ��λ��", "��λ��" };
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա������(0-9λ)��");
		int value;

		try {
			value = input.nextInt();
			System.out.println("��Ա����Ϊ��" + value);
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
			System.out.println("��λ֮�ͣ�" + sum);
		} catch (Exception e) {
			System.out.println("���ݸ�ʽ����");
			// e.printStackTrace();
		}
	}

	/* --- The End --- */
}