package network;


//import java.io.IOException;
//import java.net.MalformedURLException;

//1.��ȡָ��������IP��ַ
//ʹ�� InetAddress ��� InetAddress.getByName() ��������ȡָ����������ַ����IP��ַ
/*
import java.net.*;
import java.net.InetAddress;

public class Network {
	public static void main(String[] args) {
		InetAddress address = null;
		try {
			address = InetAddress.getByName("www.google.com");
		}
		catch(UnknownHostException e) {
			System.out.println("δ֪������");
			System.exit(2);
		}
		System.out.println(address.getHostName()+":"+address.getHostAddress());
		System.exit(0);
	}
}
*/

//�鿴�˿��Ƿ���ʹ��
/*import java.net.*;
import java.io.*;

public class Network{
	public static void main(String[] args) throws IOException {
		Socket skt;
		String host = "localhost";
		if(args.length>0) {
			host = args[0];
		}
		for(int i=3300;i<3310;i++) {
			try {
				System.out.println("�鿴 "+i);
				skt = new Socket(host,i);
				System.out.println("�˿�"+i+"�ѱ�ռ��");
			}catch(UnknownHostException e) {
				System.out.println("Exception occured:"+e);
				break;
			}catch(IOException e) {}
		}
	}
}*/

//3.��ȡ����IP��ַ��������
//ʹ�� InetAddress ��� getLocalAddress() ������ȡ����ip��ַ��������
/*
import java.net.InetAddress;

public class Network{
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		//��ȡIP
		String hostAddr = addr.getHostAddress();
		System.out.println("localhost's address:"+hostAddr);
		//��ȡ������
		String hostname = addr.getHostName();
		System.out.println("localhost's name:"+hostname);
	}
}*/


//4.��ȡԶ���ļ��Ĵ�С
/*
import java.net.URL;
import java.net.URLConnection;

public class Network{
	public static void main(String[] args) throws IOException {
		int size;
		URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
		//
		URLConnection conn = url.openConnection();
		size = conn.getContentLength();
		if(size<0)
			System.out.println("�޷���ȡ�ļ���С");
		else
			System.out.println("�ļ���СΪ��"+size+" bytes");
		conn.getInputStream().close();
	}
}*/


//5.Socketʵ�ֶ��̷߳���������
//ʹ�� Socket ��� accept() ������ ServerSocket ��� MultiThreadServer(socketname) ������ʵ�ֶ��̷߳���������
/*
import java.io.*;
import java.net.*;

public class Network implements Runnable {
	Socket csocket;
	Network(Socket csocket){
		this.csocket = csocket;
	}
	public static void main(String[] args) throws IOException {
		ServerSocket ssock = new ServerSocket(1234);
		System.out.println("Listening");
		while(true) {
			Socket sock = ssock.accept();
			System.out.println("Connected");
			new Thread(new Network(sock)).start();
		}
	}
	public void run() {
		try {
			PrintStream pstream = new PrintStream(csocket.getOutputStream());
			for(int i=100;i>=0;i--) {
				pstream.println(i+" bottles of beer");
			}
			pstream.close();
			csocket.close();
		}catch(IOException e){
			System.out.println("�����쳣��"+e);
		}
	}
}*/














