import java.util.Scanner;

public class HomeWork3
{
	public static void main(String[] args) {
		System.out.println("输入张浩的Java成绩：");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		if(nextInt > 90)
		System.out.println("老师说：不错，奖励一个iPhone5！");
		scanner.close();
	}
}