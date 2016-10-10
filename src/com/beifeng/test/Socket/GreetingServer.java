package com.beifeng.test.Socket;

import java.net.*;
import java.io.*;

public class GreetingServer extends Thread
{
	private ServerSocket serverSocket;

	public GreetingServer(int port) throws IOException
	{
		serverSocket = new ServerSocket(port);
//		serverSocket.setSoTimeout(100000);
	}

	public void run()
	{
		while (true)
		{
			try
			{
				System.out.println("Waiting for client on port "
						+ serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				// blocked
				System.out.println("Just connected to "
						+ server.getRemoteSocketAddress());
				//////  Read   ////////
				DataInputStream in = new DataInputStream(
						server.getInputStream());
				System.out.println(in.readUTF());
				System.out.println(in.readUTF());
				//////  Write  ///////
				DataOutputStream out = new DataOutputStream(
						server.getOutputStream());
				out.writeUTF("---Server: I'm Sever");
				out.writeUTF("---Server: Thank you for connecting to "
						+ server.getLocalSocketAddress());
				server.close();
			} catch (SocketTimeoutException s)
			{
				System.out.println("Socket timed out!");
				break;
			} catch (IOException e)
			{
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		// int port = Integer.parseInt(args[0]);
		int port = 80;
		try
		{
			Thread t = new GreetingServer(port);
			t.start();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}