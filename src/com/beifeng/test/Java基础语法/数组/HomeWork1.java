package com.beifeng.test.Java�����﷨.����;
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
	System.out.println("������5λѧ���ĳɼ�");
	for (int i = 0; i < 5; i++)
	{
	
		out[i] = scanner.nextDouble();
		sum += out[i];
	}
	System.out.println("ѧ����ƽ���֣�\t\t" + sum/5);
}
	
}
class Test
{
	
	public static void main(String[] args)
	{
		double[] out = new double[5];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뱾�µ����Ѽ�¼");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("�������%d�ʹ���Ľ��:",i+1);
			out[i] = scanner.nextDouble();
			sum += out[i];
		}System.out.printf("���\t\t��Ԫ��\t\n");
		for (int i = 0; i < out.length; i++)
		{
			System.out.printf("%d\t\t%f\t\n",i+1,out[i]);
		}
		System.out.println("�ܽ�\t\t" + sum);
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
		System.out.println("����Ԫ��֮�ͣ�"+sum);
		System.out.println("������һ������");
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
			System.out.println("����");
		}else
		{
			System.out.println("������");
		}
		scanner.close();
	}
}