import java.util.Scanner;

public class HomeWork10
{
	public static void main(String[] args) {
		int prize;
		prize = 1;
		System.out.println("���������Σ�");
		Scanner scanner = new Scanner(System.in);
		prize = scanner.nextInt();
		scanner.close();
		switch (prize) {
		case 1:
			System.out.println("�����Բμ���ʡ����ѧ��֯��1��������Ӫ");
			break;
		case 2:
			System.out.println("��ϲ��û��ձʼǱ�����һ��");
			break;
		case 3:
			System.out.println("��ϲ����ƶ�Ӳ��һ��");
			break;
		default:
			System.out.println("��л�μӱ�����");
			break;
		}
	}
}