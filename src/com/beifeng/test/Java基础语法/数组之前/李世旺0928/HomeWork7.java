import java.util.Scanner;

public class HomeWork7
{
	public static void main(String[] args) {
		System.out.println("������������");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		if(nextInt >= 5000000)
		System.out.println("�ҿ����򿭵�����");
		else if(nextInt >= 1000000)
		System.out.println("�ҿ�����������");	
		else if(nextInt >= 500000)
		System.out.println("�ҿ�����������");
		else if(nextInt >= 100000)
		System.out.println("�ҿ��������");	
		else
		System.out.println("�ҿ�����ݰ���");	
		scanner.close();
	}
}