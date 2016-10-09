package com.beifeng.test.Java�������;

import java.util.Scanner;
/**
 * ��ȭ��Ϸ
 * 
 */

public class CaiQuan
{
	final static int WIN = 1;
	final static int FAIL = 2;
	final static int TIE = 0;
	int a, b;
	int count = 0;
	int ascore = 0;
	int bscore = 0;
	String cname;
	String username;
	String[] computers =
	{ "����", "�ܲ�", "��Ȩ" };
	String[] words =
	{ "����", "ʯͷ", "��" };
	String[] info =
	{ "�;�,��˥!�����ư�!", "��ϲ,��Ӯ��!", "����!,������!" };

	void printResult()
	{
		System.out.println("��ս����:"+ count);
		System.out.println("����\t�÷�");
		System.out.println(username+"\t"+ascore);
		System.out.println(cname+"\t"+bscore);
	}

	int getResult()
	{
		if ((a + 1) % 3 == b)
		{
			bscore++;
			return FAIL;
		} else if (a == b)
		{
			return TIE;
		} else
		{
			ascore++;
			return WIN;
		}
	}

	public void start()
	{
		System.out.println("******************��ӭ������Ϸ����*********************");
		System.out.println("\t\t***********");
		System.out.println("\t\t**��ȭ��ʼ**");
		System.out.println("\t\t***********");
		System.out.println("��ȭ����:1.����2.ʯͷ3.��");

	}

	public static void main(String[] args)
	{
		CaiQuan game = new CaiQuan();
		game.start();
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��Է���ɫ:(1:����2.��Ȩ3.�ܲ�)");
		game.cname = game.computers[scanner.nextInt() - 1];
		System.out.println("�������������:");
		game.username = scanner.next();
		System.out.println("Ҫ��ʼ��?(y/n)");
		if ("n".equals(scanner.next()))
		{
			System.exit(0);
		}
		while (true)
		{
			System.out.println("--------------" + game.username + " VS "
					+ game.cname + "-----------------");
			System.out.println("���ȭ:1.����2.ʯͷ3.��");
			game.a = scanner.nextInt() - 1;
			game.b = (int) (Math.random() * 3);
			System.out.println("���ȭ:" + game.words[game.a]);
			System.out.println(game.cname + "��ȭ:" + game.words[game.b]);
			System.out.println("���:" + game.info[game.getResult()]);
			System.out.println("�Ƿ������һ��:(y/n)");
			if ("n".equals(scanner.next()))
			{
				game.printResult();
				System.exit(0);
			}
			game.count++;
			game.printResult();
		}

	}

}
