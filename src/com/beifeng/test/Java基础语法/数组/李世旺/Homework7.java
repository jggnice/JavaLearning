package com.beifeng.test.Java�����﷨.����.������;

public class Homework7
{
	public static void main(String[] args)
	{
		int[] scores =
		{ 16, 25, 9, 90, 23 };
		/**
		 * �Ƚ� ������
		 */
		for (int i = 0; i < scores.length - 1; i++)
		{
			/**
			 * �Ƚ� ������
			 */
			for (int j = 0; j < scores.length - 1 - i; j++)
			{
				if (scores[j] > scores[j + 1])
				{
					int tep = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = tep;
				}
			}
		}
		for (int z : scores)
		{
			System.out.println(z);
		}
	//	Arrays.sort(scores);
	}
}
