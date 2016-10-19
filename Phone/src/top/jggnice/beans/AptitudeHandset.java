package top.jggnice.beans;

import top.jggnice.dao.Inetwork;
import top.jggnice.dao.Itakepic;

public class AptitudeHandset extends Handset implements Inetwork, Itakepic
{

	public AptitudeHandset()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public AptitudeHandset(String brand, String type)
	{
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takePicture()
	{
		// TODO Auto-generated method stub
		System.out.println("咔嚓...拍照成功!");
	}

	@Override
	public void networkConn()
	{
		// TODO Auto-generated method stub
		System.out.println("已经启动移动网络.....");
		System.out.println("开始播放视频<<小时代>>...");

	}

	@Override
	public void call()
	{
		// TODO Auto-generated method stub
		System.out.println("开始视频通话....");
	}

	@Override
	public void info()
	{
		// TODO Auto-generated method stub
		System.out.println("发送带有图片和文字的信息");
	}

}
