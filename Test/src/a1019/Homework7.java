package a1019;

public class Homework7
{
	static String lyrics = "《十面埋伏》  北方有佳人  绝世而独立  一顾倾人城  再顾倾人国  宁不知倾城与倾国  佳人难再得";
	public static void main(String[] args)
	{
		System.out.println("-----原歌词样式-----");
		System.out.println(lyrics);
		System.out.println("------拆分后样式-------");
		String[] lyric = lyrics.split(" ");
		for (int i = 0; i < lyric.length; i++)
		{
			System.out.println(lyric[i]);
		}		
	}
}