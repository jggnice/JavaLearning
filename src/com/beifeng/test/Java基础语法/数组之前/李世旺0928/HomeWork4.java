import java.util.Scanner;

public class HomeWork4
{
	public static void main(String[] args) {
		System.out.println("输入张浩的Java成绩：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("输入张浩的音乐成绩：");
		int b = scanner.nextInt();
		if((a > 90 && b > 80 )||( a == 100 && b > 70))
		System.out.println("老师说：不错，奖励一个iPhone5！");
		scanner.close();
	}
}