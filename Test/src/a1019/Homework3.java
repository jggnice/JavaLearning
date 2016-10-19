package a1019;

import java.util.Random;

public class Homework3
{
	public static void main(String[] args)
	{
		Random random = new Random();
//		Random random2 = new Random(0);
		for (int i = 0; i < 20; i++)
		{
			System.out.println(random.nextInt(3));
//			System.out.println(random2.nextInt(3));

		}
		
	}
}
