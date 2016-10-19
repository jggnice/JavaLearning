package a1019;

import java.util.Scanner;

public class Homework6
{
	static Scanner scanner;
	static String username, password1, password2;

	static void input()
	{
		
		System.out.println("请输入文件名:");
		username = scanner.next();
		System.out.println("请输入Email:");
		password1 = scanner.next();
	}

	public static boolean check()
	{
		int indexat,indexdot;
		input();
		if (!username.endsWith(".java"))
		{
			System.out.println("无效的文件名");
			return false;
		}
		if (-1==(indexat = password1.indexOf("@")))
		{
			System.out.println("无效Email:(无@)");
			return false;
		}
		if (-1==(indexdot = password1.indexOf(".")))
		{
			System.out.println("无效Email:(无.)");
			return false;
		}
		if (indexat > indexdot)
		{
			System.out.println("无效Email");
			return false;
		}
		System.out.println("success:提交成功.");
		return true;
	}
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		System.out.println("*****欢迎进入提交系统****");
		while(!check())
		{
			;
		}
		scanner.close();
	}
}
