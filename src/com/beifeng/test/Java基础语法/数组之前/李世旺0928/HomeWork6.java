import java.util.Scanner;

public class HomeWork6
{
	public static void main(String[] args) {
		System.out.println("�����뿼�Գɼ���");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		if(nextInt >= 80)
		System.out.println("����");
		else if(nextInt >= 60)
		System.out.println("�е�");	
		else
		System.out.println("��");
		scanner.close();
	}
}