import java.util.Scanner;

public class HomeWork1
{
	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		System.out.println(nextInt+"��"+ (0 == nextInt%2 ? "ż��": "����"));
		scanner.close();
	}
}