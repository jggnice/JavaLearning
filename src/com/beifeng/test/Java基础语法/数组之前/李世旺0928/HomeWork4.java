import java.util.Scanner;

public class HomeWork4
{
	public static void main(String[] args) {
		System.out.println("�����źƵ�Java�ɼ���");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("�����źƵ����ֳɼ���");
		int b = scanner.nextInt();
		if((a > 90 && b > 80 )||( a == 100 && b > 70))
		System.out.println("��ʦ˵����������һ��iPhone5��");
		scanner.close();
	}
}