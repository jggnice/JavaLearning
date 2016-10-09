import java.util.Scanner;

public class HomeWork4
{
	/**
	<p>
		<b>
		main方法
		</b>
	*/
	public static void main(String[] args)
	{
		String name, name1;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的姓名：");
		name = input.next();
		System.out.print("请输入您的号码：");
		name1 = input.next();
		System.out.println(name + "你好，你的等待号码为：" + name1);
		input.close();
	}
	/*  --- The End ---*/
}