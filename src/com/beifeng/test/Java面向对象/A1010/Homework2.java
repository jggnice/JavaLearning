package com.beifeng.test.Java�������.A1010;

import java.util.Scanner;

public class Homework2
{
	public static void main(String[] args)
	{
		String userid;
		String password;
		String newpassword;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������û���:");
		userid = scanner.next();
		System.out.print("����������:");
		password = scanner.next();
		User tep = new User(userid,password);
		if (new User().Validate(tep))
		{
			System.out.print("������������:");
			newpassword = scanner.next();
			System.out.println("�޸�����ɹ�,����������Ϊ:"+ newpassword);
			
		}else
		{
			System.out.println("�û��������벻 ƥ��!");
		}
	}
}

class User
{
	private String userid = "admin1";
	private String password = "111111";

	public String getUserid()
	{
		return userid;
	}

	public void setUserid(String userid)
	{
		this.userid = userid;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public User(String userid, String password)
	{
		super();
		this.userid = userid;
		this.password = password;
	}

	public User()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	boolean  Validate(User user)
	{
		if (this.userid.equals(user.userid)
				&& this.password.equals(user.password))
		{
			return true;
		}
		return false;
	}
}