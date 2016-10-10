package com.beifeng.test.Java面向对象;

import java.util.Scanner;

public class Test
{

}
class Penguin
{
	String name;
	String sex;
	int health;
	int love;

	public Penguin()
	{
		super();
	}
	public Penguin(String name, String sex, int health, int love)
	{
		super();
		this.name = name;
		this.sex = sex;
		this.health = health;
		this.love = love;
	}
	public int getHealth()
	{
		return health;
	}
	public int getLove()
	{
		return love;
	}
	public String getName()
	{
		return name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setHealth(int health)
	{
		this.health = health;
	}
	public void setLove(int love)
	{
		this.love = love;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}
	@Override
	public String toString()
	{
		return "宠物的自白 [我的名字叫" + name + ",性别是" + sex + ", 健康值是" + health
				+ ", 和主人的亲密度是" + love + "]";
	}
	public static void main(String[] args)
	{
		Penguin penguin = new Penguin();
		System.out.println("欢迎您来到宠物店!");
		System.out.println("请输入要领养的宠物名字:");
		System.out.println("请输入要领养的宠物类型:");
		System.out.println("请输入企鹅的性别:");
		System.out.println("请输入企鹅的健康值:");
	}	
}
 class TestMethod
{
	
	private static double avg(double[] scores)
	{
		double sum = 0;
		for (int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		return sum/scores.length;
	}
	public static void main(String[] args)
	{
		double[] scores = new double[5];
		System.out.println("请输入5位学员的成绩:");
		Scanner scanner =new Scanner(System.in);
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = scanner.nextInt();
		}
		System.out.println("平均值:"+ avg(scores));
		System.out.println("最高分:"+ max(scores));
	}

	private static double max(double[] scores)
	{
		double max = 0;
		for (int i = 0; i < scores.length; i++)
		{
			if(scores[i]>max)
				max = scores[i];
		}
		return max;
	}
}