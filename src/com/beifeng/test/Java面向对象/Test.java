package com.beifeng.test.Java�������;

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
		return "������԰� [�ҵ����ֽ�" + name + ",�Ա���" + sex + ", ����ֵ��" + health
				+ ", �����˵����ܶ���" + love + "]";
	}
	public static void main(String[] args)
	{
		Penguin penguin = new Penguin();
		System.out.println("��ӭ�����������!");
		System.out.println("������Ҫ�����ĳ�������:");
		System.out.println("������Ҫ�����ĳ�������:");
		System.out.println("�����������Ա�:");
		System.out.println("���������Ľ���ֵ:");
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
		System.out.println("������5λѧԱ�ĳɼ�:");
		Scanner scanner =new Scanner(System.in);
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = scanner.nextInt();
		}
		System.out.println("ƽ��ֵ:"+ avg(scores));
		System.out.println("��߷�:"+ max(scores));
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