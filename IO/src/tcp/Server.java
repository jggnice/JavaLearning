package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

	public static void main(String[] args) throws IOException
	{
		// 1����������
		ServerSocket server = new ServerSocket(11111);
		System.out.println("����������");
		// 2�ȴ��ͻ�������
		while (true)
		{
			Socket socket = server.accept();// ����
			String ip = socket.getInetAddress().getHostAddress();// ��ȡip
			System.out.println(ip + "����");
			// �����̴߳���ѭ������
			MyThread mt = new MyThread(socket);
			mt.start();
		}
	}
}

// ���տͻ��˷��͵���Ϣ
class MyThread extends Thread
{
	private Socket socket;

	public MyThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		String ip = socket.getInetAddress().getHostAddress();// ��ȡip
		// ��ȡ��Ϣ
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			String str = null;
			while ((str = br.readLine()) != null)
			{
				System.out.println(ip + ":" + str);// I��ʾ��ȡ����Ϣ
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try
			{
				socket.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// ѭ��������Ϣ
	}
}
