import java.util.Scanner;

public class HomeWork8
{
	public static void main(String[] args)
	{
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("����༶��������");
			int nextInt = scanner.nextInt();
		for (int i = 0; i < nextInt; i++)
		{
			System.out.println("�������"+(i+1)+"λѧ���ĳɼ���");
			if(scanner.nextInt()<=80)
			{
				continue;
			}
			num++;
		}
		System.out.println("80�����ϵ�ѧ�������ǣ�"+num);
		System.out.println("80�����ϵ�ѧ����ռ�ı���Ϊ��"+100.0*num/nextInt);
	}
}