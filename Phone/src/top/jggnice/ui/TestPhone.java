package top.jggnice.ui;

import top.jggnice.beans.AptitudeHandset;
import top.jggnice.beans.CommonHandset;
import top.jggnice.beans.Handset;

public class TestPhone
{
	public static void main(String[] args)
	{
		CommonHandset handset_1 = new CommonHandset("Ë÷Äá°®Á¢ÐÅ","G502c");
		System.out.println(handset_1);
		handset_1.play("ÈÈÑ©");
		handset_1.info();
		handset_1.call();
		System.out.println();
		AptitudeHandset handset_2 = new AptitudeHandset("HTC", "I9100");
		System.out.println(handset_2);
		handset_2.networkConn();
		handset_2.takePicture();
		handset_2.info();
		handset_2.call();
	}
}
