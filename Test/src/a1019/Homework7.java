package a1019;

public class Homework7
{
	static String lyrics = "��ʮ�������  �����м���  ����������  һ�����˳�  �ٹ����˹�  ����֪��������  �������ٵ�";
	public static void main(String[] args)
	{
		System.out.println("-----ԭ�����ʽ-----");
		System.out.println(lyrics);
		System.out.println("------��ֺ���ʽ-------");
		String[] lyric = lyrics.split(" ");
		for (int i = 0; i < lyric.length; i++)
		{
			System.out.println(lyric[i]);
		}		
	}
}