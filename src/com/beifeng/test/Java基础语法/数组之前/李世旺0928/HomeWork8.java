import java.util.Scanner;

public class HomeWork8
{
	public static void main(String[] args) {
		System.out.println("����������ɼ���s����");
		Scanner scanner = new Scanner(System.in);
		int nextDouble = scanner.nextDouble();
		if(nextDouble > 10)
		{System.out.println("��Ե����");}
		else
		{
			System.out.println("�������Ա�");
			String sex = next();
			if("��".equals(sex))
				System.out.println("�������������");
			if("Ů".equals(sex))
				System.out.println("����Ů�������");
		}
	}
}