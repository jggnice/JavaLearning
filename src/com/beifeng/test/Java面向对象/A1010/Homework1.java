package com.beifeng.test.Java面向对象.A1010;

import java.util.Scanner;
/**
 * 
 * 需求说明：一个景区根据游人的年龄收取不同价格的门票。
 * 请编写游人类，正确创建和使用对象，根据年龄段决定能
 * 够购买的门票价格
 * （大于等于18岁且小于等于60岁票价20元、小于18岁或
 * 大于60岁免票）并输出
 * 
 * */
public class Homework1
{

	public static void main(String[] args)
	{
		String name;
		int age;
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			System.out.print("请输入姓名:");
			name = scanner.next();
			//名字为n时退出程序
			if("n".equals(name))
			{
				System.out.println("退出程序");
				System.exit(0);
			}
			System.out.print("请输入年龄:");
			age = scanner.nextInt();
			Visitor visitor = new Visitor(name, age);
			visitor.print();
		}
	}

}
class Visitor
{
	String name;
	int age;

	public Visitor(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	void print()
	{
		if (age < 18 || age > 60)
		{
			System.out.println(name + "的年龄为:" + age + ",门票免费");
		} else
		{
			System.out.println(name + "的年龄为:" + age + ",门票价格为:20元");
		}
		System.out.println();
	}

	
}
