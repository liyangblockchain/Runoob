package thread;

//1.查看线程是否存活
//如何通过继承 Thread 类并使用 isAlive() 方法来检测一个线程是否存活
/*public class ThreadRunoob extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			printMsg();
		}
	}
	public void printMsg() {
		Thread t = Thread.currentThread();
		Thread name = t.currentThread();
		System.out.println("线程的name="+name);
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

//2.获取当前线程名称
//如何通过继承 Thread 类并使用 getName() 方法来获取当前线程名称
//多线程是指：main()函数和run()函数同时调用printMsg()?
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

//3.状态监控
//通过继承 Thread 类并使用 currentThread.getName() 方法来监测线程的状态
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



//4.线程优先级设置
//如何通过setPriority() 方法来设置线程的优先级
/*
public class ThreadRunoob extends Thread{
	private int countDown = 5;
	private volatile double d = 0;
	public ThreadRunoob(int priority) {
	}
}*/






























