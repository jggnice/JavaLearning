import java.util.Scanner;
public class HomeWork14
{
	public static void main(String[] args) {
		String[] products = { "1.����\t", "2.����\t", "3.��ë��\t" };
		String[] prices = { "$ 14", "$ 12", "$ 5" };
		String num = "0";
		System.out.println("MyShopping����ϵͳ  �� �������");
		System.out.println("***************************************");
		System.out.println("��������Ʒ��ţ�\n" + products[0] + products[1]
				+ products[2]);
		System.out.println("***************************************");
		Scanner scanner = new Scanner(System.in);

		try {
			while (!"n".equals(num = scanner.next())) {
				System.out.println(products[Integer.parseInt(num) - 1] + "\t"
						+ prices[Integer.parseInt(num) - 1]);
				System.out.println("����������n");
			}
			System.out.println("�������");
		} catch (Exception e) {
			// next��������throws number format mismatch exception
			System.out.println("�����ʽ����");
			// e.printStackTrace();
		}
		scanner.close();
	}
}