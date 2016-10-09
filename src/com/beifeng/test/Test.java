package com.beifeng.test;

import java.util.Scanner;

class Base
{

	private String name;

	public Base()
	{

		name = "Base constructor";

	}

	public Base(String pName)
	{

		name = pName;

	}

	public void method()
	{

		System.out.println(name);

	}

}

class Child extends Base
{

	public Child()
	{

		super("Child constructor");

	}

	public void method()
	{

		System.out.println("Child method");

	}

}

class Sample
{

	public static void main(String[] args)
	{

		Child c = new Child();

		c.method();

	}

}

class A
{

	public A()
	{

		System.out.println("A");

	}

}

class B extends A
{

	public B()
	{

		System.out.println("B");

	}

}

class Teststr
{
	public static void main(String[] args)
	{
		String str = "a_b_a_b";

		String str1 = str.replace("a", "_");

		String str2 = str1.replaceAll("_", "");

		System.out.println(str2);
	}

}

public class Test
{

	public static void main(String[] args)
	{

	}

	public static void Test12(String[] args)
	{
		double[] out = new double[5];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入本月的消费记录");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("请输入第%d笔购物的金额:", i + 1);
			out[i] = scanner.nextDouble();
			sum += out[i];
		}
		System.out.printf("序号\t\t金额（元）\t\n");
		for (int i = 0; i < out.length; i++)
		{
			System.out.printf("%d\t\t%f\t\n", i + 1, out[i]);
		}
		System.out.println("总金额：\t\t" + sum);
	}
}

class Test_travel
{

	public static void main(String[] args)
	{
		boolean b = false;
		int[] scores =
		{ 8, 4, 2, 1, 23, 344, 12 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int value = scanner.nextInt();
		for (int i = 0; i < scores.length; i++)
		{
			if (value == scores[i])
			{
				b = true;
				break;
			}
		}
		if (b)
		{
			System.out.println("包含");
		} else
		{
			System.out.println("不包含");
		}
		scanner.close();
	}
}

class Test99
{
	public static void main(String[] args) throws Exception
	{
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out
						.printf("%d*%d=%d\t", i + 1, j + 1, (i + 1) * (j + 1));
			}
			System.out.println();
		}
	}
}

class HomeWork5_star
{
	static int scale = 10;

	public static void main(String[] args)
	{
		for (int i = 1; i <= 2 * scale - 1; i++)
		{
			for (int j = 1; j <= Math.abs(scale - i); j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (scale - Math.abs(scale - i)) - 1; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
// List<Object> l1 = new ArrayList<Integer>();
// List l2 = new ArrayList<Integer>();
// List<?> l3 = new ArrayList<Integer>();
// List<?> l = new ArrayList<int>();
// ///////////////////////////////////
// List<?> l11 = new ArrayList();l11.add(1);
// List<int> l12 = new ArrayList<int>();l11.add(1);
// List l13 = new ArrayList();l13.add(1);
// List<String> l14 = new ArrayList();l14.add(1);