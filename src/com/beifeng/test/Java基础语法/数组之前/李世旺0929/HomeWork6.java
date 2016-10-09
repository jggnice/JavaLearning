

public class HomeWork6
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