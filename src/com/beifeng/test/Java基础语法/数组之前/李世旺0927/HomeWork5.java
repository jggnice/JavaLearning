import java.util.Scanner;

public class HomeWork5
{
	/**
	<p>
		<b>
		main方法
		</b>
	*/
	public static void main(String[] args)
	{
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4位会员卡号：");
		name = input.next();
		System.out.println("会员卡号为：" + name);
		input.close();
	}
	/*  --- The End ---*/
}