import java.util.Scanner;
public class HomeWork13
{
	public static void main(String[] args) {
		System.out.println("合格了吗?（y/n）：");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		while("n".equals(next))
		{
			System.out.println("上午阅读教程");
			System.out.println("下午上机编程\n");
			System.out.println("合格了吗?（y/n）：");
			next = scanner.next();
		}
		System.out.println("完成了学习任务");
		scanner.close();
	}
}