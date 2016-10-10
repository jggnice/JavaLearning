package com.beifeng.test.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class GreetingClient
{
	public static void main(String[] args)
	{
		// 目标主机URL
		String serverName = "192.168.32.79";
		int port = 80;
		try
		{
			System.out.println("Connecting to Server at " + serverName + " on port "
					+ port);
			// //// new Socket //////
			Socket client = new Socket(serverName, port);
			//  请求连接
			System.out.println("Just connected to "
					+ client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();

			DataOutputStream out = new DataOutputStream(outToServer);
			// //// Write //////
			out.writeUTF("---Client: This is Hello from " + client.getLocalSocketAddress());
			out.writeUTF("---Client: I'm a Client");
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			// /// Read ///////
			System.out.println(in.readUTF());
			System.out.println(in.readUTF());
			client.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
