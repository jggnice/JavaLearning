package a1019;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Homework10
{
	public static void main(String[] args)
	{
		System.out.println(new SimpleDateFormat("��ǰ����:YYYY-MM-dd")
				.format(new Date()));
		SimpleDateFormat formater = new SimpleDateFormat(
				"��ǰ����:YYYY��MM��dd����һ���еĵ�ww������");
		String now = formater.format(new Date());
		System.out.println(now);
		GregorianCalendar calendar = new GregorianCalendar(2016, 5, 4);
		String sss = "%s��%s��%s����һ���еĵ�%s������";
		sss = String.format(sss, 
				calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH),
				calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println(sss);
		// System.out.println(new Date());
		// SimpleDateFormat formater = new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}

}
