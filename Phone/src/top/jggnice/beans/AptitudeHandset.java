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
		System.out.println("����...���ճɹ�!");
	}

	@Override
	public void networkConn()
	{
		// TODO Auto-generated method stub
		System.out.println("�Ѿ������ƶ�����.....");
		System.out.println("��ʼ������Ƶ<<Сʱ��>>...");

	}

	@Override
	public void call()
	{
		// TODO Auto-generated method stub
		System.out.println("��ʼ��Ƶͨ��....");
	}

	@Override
	public void info()
	{
		// TODO Auto-generated method stub
		System.out.println("���ʹ���ͼƬ�����ֵ���Ϣ");
	}

}
