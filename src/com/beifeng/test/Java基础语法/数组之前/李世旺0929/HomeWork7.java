import java.util.Scanner;

public class HomeWork7
{
	public static void main(String[] args)
	{
		System.out.println("����ѧ��������");
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		for (int i = 0; i < 5; i++)
		{
			System.out.println("�������"+(i+1)+"�ſεĳɼ���");
			if(scanner.nextInt() < 0)
			{
				System.out.println("��Ǹ������¼�����������¼��");
				break;
			}
			
		}
	}
}