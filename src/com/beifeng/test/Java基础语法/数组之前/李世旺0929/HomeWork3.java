import java.util.Scanner;

public class HomeWork3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		System.out.println("请输入一个值：");
		value = scanner.nextInt();
		System.out.println("根据这个值可以输出以下加法表");
		for (int i = 0; i <= value; i++)
		{
			System.out.printf("%d + %d = %d\n", i, value - i, value);
		}
	}
}