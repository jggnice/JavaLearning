import java.util.Scanner;
public class HomeWork14
{
	public static void main(String[] args) {
		String[] products = { "1.篮球\t", "2.足球\t", "3.羽毛球\t" };
		String[] prices = { "$ 14", "$ 12", "$ 5" };
		String num = "0";
		System.out.println("MyShopping管理系统  》 购物结算");
		System.out.println("***************************************");
		System.out.println("请输入商品编号：\n" + products[0] + products[1]
				+ products[2]);
		System.out.println("***************************************");
		Scanner scanner = new Scanner(System.in);

		try {
			while (!"n".equals(num = scanner.next())) {
				System.out.println(products[Integer.parseInt(num) - 1] + "\t"
						+ prices[Integer.parseInt(num) - 1]);
				System.out.println("结束请输入n");
			}
			System.out.println("程序结束");
		} catch (Exception e) {
			// next方法主动throws number format mismatch exception
			System.out.println("输入格式不对");
			// e.printStackTrace();
		}
		scanner.close();
	}
}