import java.util.Scanner;

public class HomeWork1
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String next;
		do
		{
			System.out.println("上机写程序！");
			System.out.println("合格了吗？（y/n）");
			next = scanner.next();
			
		} while ("n".equals(next));
		System.out.println("恭喜你通过了测试！");
	}
}