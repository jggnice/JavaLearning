package com.beifeng.test;

import java.util.ArrayList;
import java.util.Scanner;

public class EX {
	public static void main(String[] args) {
		VIPCard.main(args);
	}
}
class VIPCard 
{
	public static void main(String[] args) 
	{
		int name;
		int random=(int)(Math.random()*10);
		System.out.println(random);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������ع���ϵͳ �� ���˳齱");
		System.out.println("������4λ��Ա��ţ�");
		name = scanner.nextInt();
		int k = (name / 100) % 10;
		if(random == k)
			System.out.println(name + "�ſͻ������˿ͻ�����þ���MP3һ����");
		else
			System.out.println(name + "�ſͻ���лл����֧�֣�");
		scanner.close();
	}
}
class EX_while {
	public static void main(String[] args) {
		String[] products = { "1.����\t", "2.����\t", "3.��ë��\t" };
		String[] prices = { "$ 14", "$ 12", "$ 5" };
		String num = "0";
		System.out.println("MyShopping����ϵͳ  �� �������");
		System.out.println("***************************************");
		System.out.println("��������Ʒ��ţ�\n" + products[0] + products[1]
				+ products[2]);
		System.out.println("***************************************");
		Scanner scanner = new Scanner(System.in);

		try {
			while (!"n".equals(num = scanner.next())) {
				System.out.println(products[Integer.parseInt(num) - 1] + "\t"
						+ prices[Integer.parseInt(num) - 1]);
				System.out.println("����������n");
			}
			System.out.println("�������");
		} catch (Exception e) {
			// next��������throws number format mismatch exception
			System.out.println("�����ʽ����");
			// e.printStackTrace();
		}
		scanner.close();
	}
}

class EX_switch {
	public void main(String[] args) {
		int prize;
		prize = 1;
		System.out.println("���������Σ�");
		Scanner scanner = new Scanner(System.in);
		prize = scanner.nextInt();
		scanner.close();
		switch (prize) {
		case 1:
			System.out.println("�����Բμ���ʡ����ѧ��֯��1��������Ӫ");
			break;
		case 2:
			System.out.println("��ϲ��û��ձʼǱ�����һ��");
			break;
		case 3:
			System.out.println("��ϲ����ƶ�Ӳ��һ��");
			break;
		default:
			System.out.println("��л�μӱ�����");
			break;
		}
	}
}

class Test_block {
	static int a = (int) (Math.random() * 10);

	public void main(String[] args) {
		{
			int a = 4;
			System.out.println(a);
		}
		System.out.println(a + "");
		{
			int a = 5;
			a++;
			System.out.println(a < 7 ? 11 : 22);
		}
		System.out.printf("%d", 0, a, 10);
	}

}

class HomeWork9 {
	/**
	 * <p align = "center">
	 * <font color = "red"> <i> main���� </i> </font>
	 */
	public void main(String[] args) {

		ArrayList<String> ss = new ArrayList<String>();
		String[] words = { "��λ��", "ʮλ��", "��λ��", "ǧλ��", "��λ��", "ʮ��λ��", "����λ��",
				"ǧ��λ��", "��λ��" };
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա�����룺");
		int value;

		try {
			value = input.nextInt();
			System.out.println("��Ա����Ϊ��" + value);
			int value1 = value;
			int sum = 0;
			int i = 0;
			while (value1 > 0) {
				int num = value1 % 10;
				value1 = value1 / 10;
				ss.add(words[i++] + num);
				sum += num;
			}

			input.close();

			for (int j = ss.size() - 1; j >= 0; j--) {
				System.out.println(ss.get(j));
			}
			System.out.println("��λ֮�ͣ�" + sum);
			if (sum > 20)
				System.out.println("��Ա����Ϊ" + value + "�Ļ�Ա�����н��ˣ�");
		} catch (Exception e) {
			System.out.println("���ݸ�ʽ����");
			// e.printStackTrace();
		}
	}

	/* --- The End --- */
}
class Test_catch {
	public static void main(String[] args)throws Exception {
		try {
			System.out.println("try");
			System.out.println("tryreturn");
			
			return;
//			int a = 1 / 0;
//			throw new Exception();
		} catch (Exception e) {
			System.out.println("catchreturn");
			// System.exit(1);
			return;
			// e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}

}