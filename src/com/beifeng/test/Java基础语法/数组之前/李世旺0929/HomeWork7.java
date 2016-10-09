import java.util.Scanner;

public class HomeWork7
{
	public static void main(String[] args)
	{
		System.out.println("输入学生姓名：");
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		for (int i = 0; i < 5; i++)
		{
			System.out.println("请输入第"+(i+1)+"门课的成绩：");
			if(scanner.nextInt() < 0)
			{
				System.out.println("抱歉，分数录入错误，请重新录入");
				break;
			}
			
		}
	}
}