package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static final int PORT = 8000;
	
	public EchoServer() {
		try {
			int cnt = 0;
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("EchoServer Start");
			while(true) {
				Socket sock = server.accept();
				EchoThread et = new EchoThread(sock);
				et.start();
				cnt++;
				System.out.println("Client"+cnt+"Socket" );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 클라이언트를 각자 대응하기 위한 스레드 상속 클래스
	class EchoThread extends Thread{
		
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				out.println();
				
				while(true) {
					String line = in.readLine();
					if(line == null) break;
					else {
						out.println(line);
						if(line.equalsIgnoreCase("BYB"));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
}