package a1019;

import java.util.Scanner;

public class Homework4
{
	static Scanner scanner;
	static String username, password1, password2;

	static void input()
	{
		
		System.out.println("请输入用户名");
		username = scanner.next();
		System.out.println("请输入密码");
		password1 = scanner.next();
		System.out.println("请再次输入密码");
		password2 = scanner.next();
	}

	public static boolean check()
	{
		
		input();
		if (username.trim().length() < 3)
		{
			System.out.println("用户名长度不能小于3,密码长度不能小于6");
			return false;
		}
		if (!password1.trim().equals(password2.trim()))
		{
			System.out.println("两次输入的密码不相同!");
			return false;
		}
		if (password1.trim().length() < 6)
		{
			System.out.println("用户名长度不能小于3,密码长度不能小于6");
			return false;
		}
		System.out.println("注册成功!请牢记用户名和密码.");
		return true;
	}
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		System.out.println("*****欢迎进入注册系统****");
		while(!check())
		{
			;
		}
		scanner.close();
	}

}
