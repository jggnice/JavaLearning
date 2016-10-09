import java.util.Scanner;

public class HomeWork6
{
	public static void main(String[] args) {
		System.out.println("请输入考试成绩：");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		if(nextInt >= 80)
		System.out.println("良好");
		else if(nextInt >= 60)
		System.out.println("中等");	
		else
		System.out.println("差");
		scanner.close();
	}
}