package thread;

//1.�鿴�߳��Ƿ���
//���ͨ���̳� Thread �ಢʹ�� isAlive() ���������һ���߳��Ƿ���
/*public class ThreadRunoob extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			printMsg();
		}
	}
	public void printMsg() {
		Thread t = Thread.currentThread();
		Thread name = t.currentThread();
		System.out.println("�̵߳�name="+name);
	}
	public static void main(String[] args) {
		ThreadRunoob tt = new ThreadRunoob();
		tt.setName("Thread");
		System.out.println("Before start(),tt.isAlive()="+tt.isAlive());
		tt.start();
		System.out.println("just after start(), tt.isAlive()="+tt.isAlive());
		for(int i=0;i<10;i++) {
			tt.printMsg();
		}
		System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
	}
}*/

//2.��ȡ��ǰ�߳�����
//���ͨ���̳� Thread �ಢʹ�� getName() ��������ȡ��ǰ�߳�����
//���߳���ָ��main()������run()����ͬʱ����printMsg()?
/*
public class ThreadRunoob extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			printMsg();
		}
	}
	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name="+name);
	}
	public static void main(String[] args) {
		ThreadRunoob tt = new ThreadRunoob();
		tt.start();
		for(int i=0;i<10;i++) {
			tt.printMsg();
		}
	}
}*/

//3.״̬���
//ͨ���̳� Thread �ಢʹ�� currentThread.getName() ����������̵߳�״̬
/*
class MyThread extends Thread{
	boolean waiting = true;
	boolean ready = false;
//	MyThread{}
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+" starting...");
		while(waiting)
			System.out.println("waiting:"+waiting);
		System.out.println("waiting...");
		startWait();
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(threadName+" interrupted!");
		}
		System.out.println(threadName+"terminating!");
	}
	synchronized  void startWait() {
		try {
			while(!ready)
				wait();
		}catch(InterruptedException e) {
			System.out.println("wait() interrupted");
		}
	}
	synchronized void notice() {
		ready = true;
		notify();
	}
}

public class ThreadRunoob{
	static void showThreadStatus(Thread thrd) {
		System.out.println(thrd.getName()+"Alive:="+thrd.isAlive()+"Status:="+thrd.getState());
	}
	public static void main(String[] args) throws Exception{
		MyThread thrd = new MyThread();
		thrd.setName("MyThread #1");
		showThreadStatus(thrd);
		
		thrd.start();
		Thread.sleep(50);
		showThreadStatus(thrd);
		
		thrd.waiting = false;
		Thread.sleep(50);
		showThreadStatus(thrd);
		
		thrd.notice();
		Thread.sleep(50);
		showThreadStatus(thrd);
		
		while(thrd.isAlive())
			System.out.println("alive");
		showThreadStatus(thrd);
	}
}*/



//4.�߳����ȼ�����
//���ͨ��setPriority() �����������̵߳����ȼ�
/*
public class ThreadRunoob extends Thread{
	private int countDown = 5;
	private volatile double d = 0;
	public ThreadRunoob(int priority) {
	}
}*/






























