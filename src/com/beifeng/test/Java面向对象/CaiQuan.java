package com.beifeng.test.Java面向对象;

import java.util.Scanner;
/**
 * 猜拳游戏
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
	{ "刘备", "曹操", "孙权" };
	String[] words =
	{ "剪刀", "石头", "布" };
	String[] info =
	{ "和局,真衰!等着瞧吧!", "恭喜,你赢了!", "哈哈!,你输了!" };

	void printResult()
	{
		System.out.println("对战次数:"+ count);
		System.out.println("姓名\t得分");
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
		System.out.println("******************欢迎进入游戏世界*********************");
		System.out.println("\t\t***********");
		System.out.println("\t\t**猜拳开始**");
		System.out.println("\t\t***********");
		System.out.println("出拳规则:1.剪刀2.石头3.布");

	}

	public static void main(String[] args)
	{
		CaiQuan game = new CaiQuan();
		game.start();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择对方角色:(1:刘备2.孙权3.曹操)");
		game.cname = game.computers[scanner.nextInt() - 1];
		System.out.println("请输入你的姓名:");
		game.username = scanner.next();
		System.out.println("要开始吗?(y/n)");
		if ("n".equals(scanner.next()))
		{
			System.exit(0);
		}
		while (true)
		{
			System.out.println("--------------" + game.username + " VS "
					+ game.cname + "-----------------");
			System.out.println("请出拳:1.剪刀2.石头3.布");
			game.a = scanner.nextInt() - 1;
			game.b = (int) (Math.random() * 3);
			System.out.println("你出拳:" + game.words[game.a]);
			System.out.println(game.cname + "出拳:" + game.words[game.b]);
			System.out.println("结果:" + game.info[game.getResult()]);
			System.out.println("是否进入下一轮:(y/n)");
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
