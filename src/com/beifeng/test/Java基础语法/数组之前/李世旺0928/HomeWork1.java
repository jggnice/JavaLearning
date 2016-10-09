import java.util.Scanner;

public class HomeWork1
{
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		System.out.println(nextInt+"是"+ (0 == nextInt%2 ? "偶数": "奇数"));
		scanner.close();
	}
}