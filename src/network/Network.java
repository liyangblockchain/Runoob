package network;


//import java.io.IOException;
//import java.net.MalformedURLException;

//1.获取指定主机的IP地址
//使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址
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
			System.out.println("未知主机！");
			System.exit(2);
		}
		System.out.println(address.getHostName()+":"+address.getHostAddress());
		System.exit(0);
	}
}
*/

//查看端口是否已使用
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
				System.out.println("查看 "+i);
				skt = new Socket(host,i);
				System.out.println("端口"+i+"已被占用");
			}catch(UnknownHostException e) {
				System.out.println("Exception occured:"+e);
				break;
			}catch(IOException e) {}
		}
	}
}*/

//3.获取本机IP地址及主机名
//使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名
/*
import java.net.InetAddress;

public class Network{
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		//获取IP
		String hostAddr = addr.getHostAddress();
		System.out.println("localhost's address:"+hostAddr);
		//获取主机名
		String hostname = addr.getHostName();
		System.out.println("localhost's name:"+hostname);
	}
}*/


//4.获取远程文件的大小
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
			System.out.println("无法获取文件大小");
		else
			System.out.println("文件大小为："+size+" bytes");
		conn.getInputStream().close();
	}
}*/


//5.Socket实现多线程服务器程序
//使用 Socket 类的 accept() 方法和 ServerSocket 类的 MultiThreadServer(socketname) 方法来实现多线程服务器程序
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
			System.out.println("捕获异常："+e);
		}
	}
}*/














