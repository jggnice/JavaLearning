import java.util.Scanner;

public class HomeWork3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		System.out.println("������һ��ֵ��");
		value = scanner.nextInt();
		System.out.println("�������ֵ����������¼ӷ���");
		for (int i = 0; i <= value; i++)
		{
			System.out.printf("%d + %d = %d\n", i, value - i, value);
		}
	}
}