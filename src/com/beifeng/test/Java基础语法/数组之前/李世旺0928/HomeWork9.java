import java.util.Scanner;

public class HomeWork9
{
	public static void main(String[] args) 
	{
		int name;
		int random=(int)(Math.random()*10);
		System.out.println(random);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������ع���ϵͳ �� ���˳齱");
		System.out.println("������4λ��Ա��ţ�");
		name = scanner.nextInt();
		int k = (name / 100) % 10;
		if(random == k)
			System.out.println(name + "�ſͻ������˿ͻ�����þ���MP3һ����");
		else
			System.out.println(name + "�ſͻ���лл����֧�֣�");
		scanner.close();
	}
}