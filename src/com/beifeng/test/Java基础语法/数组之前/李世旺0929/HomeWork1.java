import java.util.Scanner;

public class HomeWork1
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String next;
		do
		{
			System.out.println("�ϻ�д����");
			System.out.println("�ϸ����𣿣�y/n��");
			next = scanner.next();
			
		} while ("n".equals(next));
		System.out.println("��ϲ��ͨ���˲��ԣ�");
	}
}