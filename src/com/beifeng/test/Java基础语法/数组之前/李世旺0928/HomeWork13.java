import java.util.Scanner;
public class HomeWork13
{
	public static void main(String[] args) {
		System.out.println("�ϸ�����?��y/n����");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		while("n".equals(next))
		{
			System.out.println("�����Ķ��̳�");
			System.out.println("�����ϻ����\n");
			System.out.println("�ϸ�����?��y/n����");
			next = scanner.next();
		}
		System.out.println("�����ѧϰ����");
		scanner.close();
	}
}