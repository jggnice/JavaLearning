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
		// 1 �����ͻ���
		Socket socket = null;
		//// �Ӽ��̶�ȡ����
		BufferedReader br = null;
		//// ѭ��д
		BufferedWriter bw = null;
		try
		{
			socket = new Socket("127.0.0.1", 11111);
			// 2ѭ��д����Ϣ
			// �Ӽ��̶�ȡ����
			br = new BufferedReader(new InputStreamReader(System.in));
			// ��������д����
			bw = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			// ѭ����д
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
