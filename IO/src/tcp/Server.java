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
		// 1创建服务器
		ServerSocket server = new ServerSocket(11111);
		System.out.println("服务器就绪");
		// 2等待客户端连接
		while (true)
		{
			Socket socket = server.accept();// 阻塞
			String ip = socket.getInetAddress().getHostAddress();// 获取ip
			System.out.println(ip + "连接");
			// 创建线程处理循环输入
			MyThread mt = new MyThread(socket);
			mt.start();
		}
	}
}

// 接收客户端发送的消息
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
		String ip = socket.getInetAddress().getHostAddress();// 获取ip
		// 读取消息
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			String str = null;
			while ((str = br.readLine()) != null)
			{
				System.out.println(ip + ":" + str);// I显示读取的消息
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
		// 循环接收消息
	}
}
