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
		
		System.out.println("我行我素管理系统 》 幸运抽奖");
		System.out.println("请输入4位会员编号：");
		name = scanner.nextInt();
		int k = (name / 100) % 10;
		if(random == k)
			System.out.println(name + "号客户是幸运客户，获得精美MP3一个！");
		else
			System.out.println(name + "号客户，谢谢您的支持！");
		scanner.close();
	}
}
class EX_while {
	public static void main(String[] args) {
		String[] products = { "1.篮球\t", "2.足球\t", "3.羽毛球\t" };
		String[] prices = { "$ 14", "$ 12", "$ 5" };
		String num = "0";
		System.out.println("MyShopping管理系统  》 购物结算");
		System.out.println("***************************************");
		System.out.println("请输入商品编号：\n" + products[0] + products[1]
				+ products[2]);
		System.out.println("***************************************");
		Scanner scanner = new Scanner(System.in);

		try {
			while (!"n".equals(num = scanner.next())) {
				System.out.println(products[Integer.parseInt(num) - 1] + "\t"
						+ prices[Integer.parseInt(num) - 1]);
				System.out.println("结束请输入n");
			}
			System.out.println("程序结束");
		} catch (Exception e) {
			// next方法主动throws number format mismatch exception
			System.out.println("输入格式不对");
			// e.printStackTrace();
		}
		scanner.close();
	}
}

class EX_switch {
	public void main(String[] args) {
		int prize;
		prize = 1;
		System.out.println("请输入名次：");
		Scanner scanner = new Scanner(System.in);
		prize = scanner.nextInt();
		scanner.close();
		switch (prize) {
		case 1:
			System.out.println("您可以参加麻省理工大学组织的1个月夏令营");
			break;
		case 2:
			System.out.println("恭喜获得惠普笔记本电脑一部");
			break;
		case 3:
			System.out.println("恭喜获得移动硬盘一个");
			break;
		default:
			System.out.println("感谢参加比赛！");
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
	 * <font color = "red"> <i> main方法 </i> </font>
	 */
	public void main(String[] args) {

		ArrayList<String> ss = new ArrayList<String>();
		String[] words = { "个位：", "十位：", "百位：", "千位：", "万位：", "十万位：", "百万位：",
				"千万位：", "亿位：" };
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员卡号码：");
		int value;

		try {
			value = input.nextInt();
			System.out.println("会员卡号为：" + value);
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
			System.out.println("各位之和：" + sum);
			if (sum > 20)
				System.out.println("会员卡号为" + value + "的会员，您中奖了！");
		} catch (Exception e) {
			System.out.println("数据格式不对");
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