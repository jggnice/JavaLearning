package a1019;

import java.util.Scanner;

public class Homework6
{
	static Scanner scanner;
	static String username, password1, password2;

	static void input()
	{
		
		System.out.println("�������ļ���:");
		username = scanner.next();
		System.out.println("������Email:");
		password1 = scanner.next();
	}

	public static boolean check()
	{
		int indexat,indexdot;
		input();
		if (!username.endsWith(".java"))
		{
			System.out.println("��Ч���ļ���");
			return false;
		}
		if (-1==(indexat = password1.indexOf("@")))
		{
			System.out.println("��ЧEmail:(��@)");
			return false;
		}
		if (-1==(indexdot = password1.indexOf(".")))
		{
			System.out.println("��ЧEmail:(��.)");
			return false;
		}
		if (indexat > indexdot)
		{
			System.out.println("��ЧEmail");
			return false;
		}
		System.out.println("success:�ύ�ɹ�.");
		return true;
	}
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		System.out.println("*****��ӭ�����ύϵͳ****");
		while(!check())
		{
			;
		}
		scanner.close();
	}
}
