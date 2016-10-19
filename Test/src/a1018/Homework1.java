package a1018;

import java.util.ArrayList;
import java.util.List;

public class Homework1
{

	public static void main(String[] args)
	{
		List<NewsTitle> l2 = new ArrayList<NewsTitle>();
		NewsTitle[] news =
		{ new NewsTitle(0, "���콫����̨�罵��", "xiaoming"),
				new NewsTitle(1, "����ǿ���Գ�ϯ��鰸", "wang"),
				new NewsTitle(2, "ϰ��ƽ̸�й���", "wang") };
		for (int i = 0; i < news.length; i++)
		{
			l2.add(news[i]);
		}
		System.out.println("���ű�������Ϊ: "+ l2.size());
		for (int i = 0; i < l2.size(); i++)
		{
			NewsTitle newsTitle = l2.get(i);
			System.out.println(newsTitle.id+":"+newsTitle.title);
		}
	}
}

class NewsTitle
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
