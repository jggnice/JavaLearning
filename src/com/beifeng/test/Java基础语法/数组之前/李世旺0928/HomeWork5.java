import java.util.Scanner;

public class HomeWork5
{
	public static void main(String[] args) {
		System.out.println("�����źƵ�Java�ɼ���");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		if(nextInt > 90)
		System.out.println("��ʦ˵����������һ��iPhone5��");
		else
			System.out.println("��ʦ˵���ͷ���5������");
		scanner.close();
	}
}