package a1019;

public class Homework1
{
	enum Week
	{
		MON, TUE, WED, THU, FRI, SAT, SUN
	}

	public static void main(String[] args)
	{
		Week week = Week.SUN;
		switch (week)
		{
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("工作日,努力写代码!");
			break;
		case SAT:
		case SUN:
			System.out.println("周末,尽情地玩耍吧!");
			break;
		default:
			break;
		}
	}
}
