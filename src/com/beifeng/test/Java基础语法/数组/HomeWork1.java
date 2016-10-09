package com.beifeng.test.Java基础语法.数组;
import java.util.Scanner;
public class HomeWork1
{
	public static void main(String[] args)
	{
		Test_travel.main(args);
	}
}
class test41 {
public static void main(String[] args)
{
	double[] out = new double[5];
	double sum = 0.0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入5位学生的成绩");
	for (int i = 0; i < 5; i++)
	{
	
		out[i] = scanner.nextDouble();
		sum += out[i];
	}
	System.out.println("学生的平均分：\t\t" + sum/5);
}
	
}
class Test
{
	
	public static void main(String[] args)
	{
		double[] out = new double[5];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入本月的消费记录");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("请输入第%d笔购物的金额:",i+1);
			out[i] = scanner.nextDouble();
			sum += out[i];
		}System.out.printf("序号\t\t金额（元）\t\n");
		for (int i = 0; i < out.length; i++)
		{
			System.out.printf("%d\t\t%f\t\n",i+1,out[i]);
		}
		System.out.println("总金额：\t\t" + sum);
	}
}

class Test_travel
{
	
	public static void main(String[] args)
	{
		int sum = 0;
		boolean b = false;
		int [] scores = {8,4,2,1,23,344,12};
		Scanner scanner = new Scanner(System.in);
		for(int z : scores){
			System.out.println(z);
			sum += z;
		}
		System.out.println("数组元素之和："+sum);
		System.out.println("请输入一个数：");
		int value = scanner.nextInt();
		for (int i = 0; i < scores.length; i++)
		{
			if(value == scores[i])
			{
				b = true;
				break;
			}
		}
		if(b)
		{
			System.out.println("包含");
		}else
		{
			System.out.println("不包含");
		}
		scanner.close();
	}
}