import java.util.Scanner;

public class HomeWork8
{
	public static void main(String[] args)
	{
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入班级总人数：");
			int nextInt = scanner.nextInt();
		for (int i = 0; i < nextInt; i++)
		{
			System.out.println("请输入第"+(i+1)+"位学生的成绩：");
			if(scanner.nextInt()<=80)
			{
				continue;
			}
			num++;
		}
		System.out.println("80分以上的学生人数是："+num);
		System.out.println("80分以上的学生所占的比例为："+100.0*num/nextInt);
	}
}