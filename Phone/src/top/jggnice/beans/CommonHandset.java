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
		System.out.println("开始播放音乐<<" + content + ">>...");

	}

	@Override
	public void call()
	{
		// TODO Auto-generated method stub
		System.out.println("开始语音通话...");
	}

	@Override
	public void info()
	{
		// TODO Auto-generated method stub
		System.out.println("发送文字信息...");
	}

}
