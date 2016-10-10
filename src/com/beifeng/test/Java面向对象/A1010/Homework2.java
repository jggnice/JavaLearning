package com.beifeng.test.Java面向对象.A1010;

import java.util.Scanner;

public class Homework2
{
	public static void main(String[] args)
	{
		String userid;
		String password;
		String newpassword;
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名:");
		userid = scanner.next();
		System.out.print("请输入密码:");
		password = scanner.next();
		User tep = new User(userid,password);
		if (new User().Validate(tep))
		{
			System.out.print("请输入新密码:");
			newpassword = scanner.next();
			System.out.println("修改密码成功,您的新密码为:"+ newpassword);
			
		}else
		{
			System.out.println("用户名和密码不 匹配!");
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