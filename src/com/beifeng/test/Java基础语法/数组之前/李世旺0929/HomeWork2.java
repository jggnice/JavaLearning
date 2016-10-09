import java.util.Scanner;

public class HomeWork2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String name;
		int sum = 0;
		System.out.println("输入学生姓名：");
		name = scanner.next();
		for (int i = 0; i < 5; i++)
		{
			System.out.println("请输入5门功课中第%d们课的成绩：");
			sum += scanner.nextInt();
		}
		System.out.println(name + "的平均分是" + sum/5);
	}
}
