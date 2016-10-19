import java.util.Scanner;

/**
 * ��ȭ��Ϸ
 * <p>
 * 1.�������н������ҵ��
 * <p>
 * 2.ͨ������̨�������˵�
 * <p>
 * 3.��ѡ���ս��ɫ
 * <p>
 * 4.ʹ�����������˻���ȭЧ��
 * <p>
 * 5.ͳ��ÿ�β�ȭ�ķ���,��Ϸ����,��ʾ���ս��
 */

public class CaiQuan
{
	final static int WIN = 1;
	final static int FAIL = 2;
	final static int TIE = 0;
	/**
	 * player ��¼�û���������
	 * <p>
	 * computer ��¼�����
	 * */
	int player, computer;
	/**
	 * ͳ�ƶ�ս����
	 * */
	int count = 0;
	/**
	 * playerscore ��¼�û�����
	 * <p>
	 * computerscore ��¼���Է���
	 * */
	int playerscore = 0;
	int computerscore = 0;
	/**
	 * username ��¼�û���
	 * <p>
	 * cname ��¼������
	 * */
	String cname, username;
	/**
	 * ����������
	 * */
	String[] computers =
	{ "����", "��Ȩ", "�ܲ�" };
	/**
	 * ��Ϸ�������
	 * */
	String[] words =
	{ "����", "ʯͷ", "��" };
	/**
	 * �������
	 * */
	String[] info =
	{ "�;�,��˥!�����ư�!", "��ϲ,��Ӯ��!", "����!,������!" };

	/**
	 * 
	 * ������ӡ���ս��
	 * */
	void printResult()
	{
		System.out.println("-----------------------");
		System.out.println("��ս����:" + count);
		System.out.println("����\t�÷�");
		System.out.println(username + "\t" + playerscore);
		System.out.println(cname + "\t" + computerscore);
		if (playerscore > computerscore)
			System.out.println("���: ��ϲ��ϲ,��ķ�������!");
		else if (playerscore < computerscore)
			System.out.println("���: ��ķ�������");
		else
			System.out.println("���:�ѷ��ѽ�,ƽ��!");
	}

	/**
	 * �����ж�ʤ��
	 * 
	 * */
	int getResult()
	{
		if ((player + 1) % 3 == computer)
		{
			computerscore++;
			return FAIL;
		} else if (player == computer)
		{
			return TIE;
		} else
		{
			playerscore++;
			return WIN;
		}
	}

	/**
	 * 
	 * ������ʼ���˵�
	 * 
	 * */
	public void initGame()
	{
		System.out.println();
		System.out.println("******************��ӭ������Ϸ����*********************");
		System.out.println("\t\t***********");
		System.out.println("\t\t**��ȭ��ʼ**");
		System.out.println("\t\t***********");
		System.out.println("��ȭ����:1.����2.ʯͷ3.��");

	}

	/**
	 * 
	 * ��ʼһ����Ϸ
	 * */
	public void startGame()
	{
		initGame();
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��Է���ɫ:(1:����2.��Ȩ3.�ܲ�)");
		cname = computers[scanner.nextInt() - 1];
		System.out.println("�������������:");
		username = scanner.next();
		System.out.println(username + " VS " + cname + " ��ս");
		System.out.println("Ҫ��ʼ��?(y/n)");
		if ("n".equals(scanner.next()))
		{
			printResult();
			System.exit(0);
		}

		while (true)
		{
			count++;
			System.out.println("���ȭ:1.����2.ʯͷ3.��");
			player = scanner.nextInt() - 1;
			computer = (int) (Math.random() * 3);
			System.out.println("���ȭ:" + words[player]);
			System.out.println(cname + "��ȭ:" + words[computer]);
			System.out.println("���:" + info[getResult()]);
			System.out.println("\n�Ƿ������һ��:(y/n)");
			if ("n".equals(scanner.next()))
			{
				printResult();
				System.exit(0);
			}
		}
	}

	public static void main(String[] args)
	{

		CaiQuan game = new CaiQuan();
		game.startGame();

	}

}
