package a1019;

public class Homework2
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		String s = "123.456";
		double d = Double.valueOf(s);
		System.out.println(d);
		s = String.valueOf(456.789);
		System.out.println(s);
		Double double1 = new Double(123.456);
		d = double1;
		Double double11 = 12.3;
		d = Double.parseDouble("123.456");
		s = 12345.678 + "";
		System.out.println(s);
	}
}
