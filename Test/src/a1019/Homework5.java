package a1019;

public class Homework5
{
	public static void main(String[] args)
	{
		String[] course = {"Java","HTML","SQL"};
		double[] scores = {100,100,100};
		String copy = "\n\n\t\t\t\t��Ȩ���б�����";
		System.out.println("***�ɼ���***");
		String pp = "";
		for (int i = 0; i < scores.length; i++)
		{
			pp += (course[i] +":" + scores[i] +"\t");
		}
		pp = pp.concat(copy);
		System.out.println(pp);
	}
}
