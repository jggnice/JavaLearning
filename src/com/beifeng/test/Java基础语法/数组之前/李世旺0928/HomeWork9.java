import java.util.Scanner;

public class HomeWork9
{
	public static void main(String[] args) 
	{
		int name;
		int random=(int)(Math.random()*10);
		System.out.println(random);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("我行我素管理系统 》 幸运抽奖");
		System.out.println("请输入4位会员编号：");
		name = scanner.nextInt();
		int k = (name / 100) % 10;
		if(random == k)
			System.out.println(name + "号客户是幸运客户，获得精美MP3一个！");
		else
			System.out.println(name + "号客户，谢谢您的支持！");
		scanner.close();
	}
}