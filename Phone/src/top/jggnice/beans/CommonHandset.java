package top.jggnice.beans;

import top.jggnice.dao.Iplaywiring;

public class CommonHandset extends Handset implements Iplaywiring
{

	public CommonHandset()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public CommonHandset(String brand, String type)
	{
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(String content)
	{
		// TODO Auto-generated method stub
		System.out.println("��ʼ��������<<" + content + ">>...");

	}

	@Override
	public void call()
	{
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ��...");
	}

	@Override
	public void info()
	{
		// TODO Auto-generated method stub
		System.out.println("����������Ϣ...");
	}

}
