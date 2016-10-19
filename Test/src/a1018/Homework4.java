package a1018;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework4
{
	public static void main(String[] args)
	{
		Set<NewsTitle> l2 = new HashSet<NewsTitle>();
		NewsTitle[] news =
		{ new NewsTitle(0, "���콫����̨�罵��", "xiaoming"),
				new NewsTitle(1, "����ǿ���Գ�ϯ��鰸", "wang"),
				new NewsTitle(2, "ϰ��ƽ̸�й���", "wang") };
		for (int i = 0; i < news.length; i++)
		{
			l2.add(news[i]);
		}
		System.out.println("���ű�������Ϊ: " + l2.size());
		Iterator<NewsTitle> iterator = l2.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next().getTitle());
		}
		System.out.println("***********************");
		for (NewsTitle newsTitle : l2)
		{
			System.out.println(newsTitle.getTitle());
		}
	}

	static class NewsTitle
	{
		int id;
		String title;
		String author;

		public NewsTitle(int id, String title, String author)
		{
			super();
			this.id = id;
			this.title = title;
			this.author = author;
		}

		public int getId()
		{
			return id;
		}

		public void setId(int id)
		{
			this.id = id;
		}

		public String getTitle()
		{
			return title;
		}

		public void setTitle(String title)
		{
			this.title = title;
		}

		public String getAuthor()
		{
			return author;
		}

		public void setAuthor(String author)
		{
			this.author = author;
		}
	}
}
