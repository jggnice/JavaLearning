import java.util.Scanner;

public class HomeWork8
{
	public static void main(String[] args) {
		System.out.println("请输入比赛成绩（s）：");
		Scanner scanner = new Scanner(System.in);
		int nextDouble = scanner.nextDouble();
		if(nextDouble > 10)
		{System.out.println("无缘决赛");}
		else
		{
			System.out.println("请输入性别：");
			String sex = next();
			if("男".equals(sex))
				System.out.println("进入男子组决赛");
			if("女".equals(sex))
				System.out.println("进入女子组决赛");
		}
	}
}