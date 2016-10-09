import java.util.Scanner;

public class HomeWork10
{
	public static void main(String[] args) {
		int prize;
		prize = 1;
		System.out.println("请输入名次：");
		Scanner scanner = new Scanner(System.in);
		prize = scanner.nextInt();
		scanner.close();
		switch (prize) {
		case 1:
			System.out.println("您可以参加麻省理工大学组织的1个月夏令营");
			break;
		case 2:
			System.out.println("恭喜获得惠普笔记本电脑一部");
			break;
		case 3:
			System.out.println("恭喜获得移动硬盘一个");
			break;
		default:
			System.out.println("感谢参加比赛！");
			break;
		}
	}
}