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
		return "该计算机信息如下:\n"
				+ "CPU的品牌是:" + cpu.getCPUType()
				+ ",主频是:" + cpu.getFrequency()
				+ "\n硬盘容量是:" + disk.getDiskCapacity()
				+ "\n内存的型号是:" + ems.getEMSType()
				+ ",容量是:" + ems.getEMSCapacity();
	}
	public static void main(String[] args)
	{
		Computer p1 = new Computer(new CPUImpl(), new EMSImpl(), new HDImpl());
		System.out.println(p1.getInfo());
	}
}
