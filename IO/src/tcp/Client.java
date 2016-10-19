package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
	public static void main(String[] args)
	{
		// 1 创建客户端
		Socket socket = null;
		//// 从键盘读取数据
		BufferedReader br = null;
		//// 循环写
		BufferedWriter bw = null;
		try
		{
			socket = new Socket("127.0.0.1", 11111);
			// 2循环写入消息
			// 从键盘读取数据
			br = new BufferedReader(new InputStreamReader(System.in));
			// 给服务器写数据
			bw = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			// 循环读写
			String str = null;
			while ((str = br.readLine()) != null)
			{
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
			
		} catch (UnknownHostException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			if (socket != null)
			{
				try
				{
					socket.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
