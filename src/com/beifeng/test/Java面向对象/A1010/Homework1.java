package com.beifeng.test.Java�������.A1010;

import java.util.Scanner;
/**
 * 
 * ����˵����һ�������������˵�������ȡ��ͬ�۸����Ʊ��
 * ���д�����࣬��ȷ������ʹ�ö��󣬸�������ξ�����
 * ���������Ʊ�۸�
 * �����ڵ���18����С�ڵ���60��Ʊ��20Ԫ��С��18���
 * ����60����Ʊ�������
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
			System.out.print("����������:");
			name = scanner.next();
			//����Ϊnʱ�˳�����
			if("n".equals(name))
			{
				System.out.println("�˳�����");
				System.exit(0);
			}
			System.out.print("����������:");
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
			System.out.println(name + "������Ϊ:" + age + ",��Ʊ���");
		} else
		{
			System.out.println(name + "������Ϊ:" + age + ",��Ʊ�۸�Ϊ:20Ԫ");
		}
		System.out.println();
	}

	
}
