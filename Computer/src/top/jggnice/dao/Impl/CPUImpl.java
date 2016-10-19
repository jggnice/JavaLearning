package top.jggnice.dao.Impl;

import top.jggnice.dao.ICPU;

public class CPUImpl implements ICPU
{

	@Override
	public String getCPUType()
	{
		// TODO Auto-generated method stub
		return "Intel Core i7";
	}

	@Override
	public String getFrequency()
	{
		// TODO Auto-generated method stub
		return "3.8MHz";
	}
}
