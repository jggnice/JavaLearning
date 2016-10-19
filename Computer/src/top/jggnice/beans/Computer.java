package top.jggnice.beans;

import top.jggnice.dao.ICPU;
import top.jggnice.dao.IEMS;
import top.jggnice.dao.IHardDisk;
import top.jggnice.dao.Impl.CPUImpl;
import top.jggnice.dao.Impl.EMSImpl;
import top.jggnice.dao.Impl.HDImpl;


public class Computer
{
	ICPU cpu;
	IEMS ems;
	IHardDisk disk;
	
	public Computer(ICPU cpu, IEMS ems, IHardDisk disk)
	{
		super();
		this.cpu = cpu;
		this.ems = ems;
		this.disk = disk;
	}
	String getInfo()
	{
		return "�ü������Ϣ����:\n"
				+ "CPU��Ʒ����:" + cpu.getCPUType()
				+ ",��Ƶ��:" + cpu.getFrequency()
				+ "\nӲ��������:" + disk.getDiskCapacity()
				+ "\n�ڴ���ͺ���:" + ems.getEMSType()
				+ ",������:" + ems.getEMSCapacity();
	}
	public static void main(String[] args)
	{
		Computer p1 = new Computer(new CPUImpl(), new EMSImpl(), new HDImpl());
		System.out.println(p1.getInfo());
	}
}
