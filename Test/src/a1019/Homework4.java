package a1019;

import java.util.Scanner;

public class Homework4
{
	static Scanner scanner;
	static String username, password1, password2;

	static void input()
	{
		
		System.out.println("�������û���");
		username = scanner.next();
		System.out.println("����������");
		password1 = scanner.next();
		System.out.println("���ٴ���������");
		password2 = scanner.next();
	}

	public static boolean check()
	{
		
		input();
		if (username.trim().length() < 3)
		{
			System.out.println("�û������Ȳ���С��3,���볤�Ȳ���С��6");
			return false;
		}
		if (!password1.trim().equals(password2.trim()))
		{
			System.out.println("������������벻��ͬ!");
			return false;
		}
		if (password1.trim().length() < 6)
		{
			System.out.println("�û������Ȳ���С��3,���볤�Ȳ���С��6");
			return false;
		}
		System.out.println("ע��ɹ�!���μ��û���������.");
		return true;
	}
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		System.out.println("*****��ӭ����ע��ϵͳ****");
		while(!check())
		{
			;
		}
		scanner.close();
	}

}
