package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer1 {
	
	public static final int PORT = 8001;
	ServerSocket server;
	//접속한 Client 객체를 저장하는 벡터
	Vector<Client1> vc;
	
	public ChatServer1() {
		try {
			server = new ServerSocket(PORT);
			vc = new Vector<Client1>();
		} catch (Exception e) {
			System.out.println("Error in Server");
			System.exit(1); // 비정상 종료
		}
		System.out.println("*********************");
		System.out.println("ChatServer v1.0 start****");
		System.out.println("*********************");
		try {
			while(true) {
				Socket sock = server.accept();
				Client1 ct = new Client1(sock);
				ct.start();
				//접속한 Client를 Vector에 저장
				vc.addElement(ct);
			}
		} catch (Exception e) {
			System.out.println("Error in Socket");
		}
	}
	
	// 전체 접속자에게 메세지 보내는 기능
		public void sendAllMessage(String msg) {
			for (Client1 ct : vc) {
				ct.sendMessage(msg);
			}
		}
	
	//접속이  끊어지면 vector에서 Client 제거
	public void removeClient(Client1 ct) {
		vc.remove(ct);
	}
	
	class Client1 extends Thread{
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id;
		
		public Client1(Socket sock) {
			try {
				this.sock = sock;
				
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true);
				System.out.println(sock+"접속됨...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//자신의 Client에 메세지 보내는 기능
		public void sendMessage(String msg) {
			out.println(msg);
		}

		@Override
		public void run() {
			try {
				//Client 최초로 받는 메세지
				sendMessage("사용할 아이디를 입력하세요");
				//Client가 보내는 id 저장
				id = in.readLine();
				//접속한 모든 Client에게 welcome 메세지 전달
				sendAllMessage("["+id+"]님이 입장하였습니다");
				String line = "";
				while(true) {
					line = in.readLine();
					if(line==null) break;
					sendAllMessage("["+id+"]"+line);
				}
				in.close();
				out.close();
				sock.close();
			} catch (Exception e) {
				//Client 접속이 끊어지면 Vector에서 내자신 제거
				removeClient(this);
				System.out.println(sock + " 끊어짐...");
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatServer1();
	}

}
