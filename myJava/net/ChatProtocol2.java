package net;

public class ChatProtocol2 {
	
	//(C->S) ID:aaa
	//(S->C) CHATLIST:aaa;bbb;ccc;ȫ�浿;
	public static final String ID = "ID";
	
	//(C->S) CHAT:�޴¾��̵�;�޽��� ex) CHAT:bbb;�����
	//(S->C) CHAT:�������̵�;�޽��� ex) CHAT:bbb;�����
	public static final String CHAT = "CHAT";
	
	//(C->S) CHATALL:�޽��� 
	//(S->C) CHATALL:[�����¾��̵�] �޼���
	public static final String CHATALL = "CHATALL";
	
	//(S->C) CHATLIST:aaa;bbb;ccc;ȫ�浿;
	public static final String CHATLIST = "CHATLIST";
	
	//(C->S) CHAT:�޴¾��̵�;�޽��� ex) MESSAGE:bbb;�����
	//(S->C) CHAT:�������̵�;�޽��� ex) MESSAGE:aaa;�����
	public static final String MESSAGE = "MESSAGE";
	
	public static final String MODE1 = ":";
	public static final String MODE2 = ";";
	
	public static void main(String[] args) {

	}

}
