//package errors;

//1.异常处理方法
//使用 System 类的 System.err.println() 来展示异常的处理方法
/*
public class Error {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		}catch(Exception e) {
			System.out.println("Catch Exception");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e);
			System.out.println("e.printStackTrace()");
			e.printStackTrace();
		}
	}
}
*/

//2.多个异常处理（多个catch）
/*
class Demo{
//	1，声明异常时，建议声明更为具体的异常，这样可以处理的更具体
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int[] arr = new int[a];
		System.out.println("下标为4的元素是："+arr[4]);//制造的第一处异常：数组下标越界
		return a/b; //制造的第二处异常
	}
}
class Error{
	public static void main(String[] args) {
		Demo d = new Demo();
		try {
			int x = d.div(4, 0);
//			int x = d.div(5, 1);
			System.out.println("x="+x);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("over!");
	}
}
*/

//3.Finally的用法
//使用 finally 通过 e.getMessage() 来捕获异常（非法参数异常）
/*
public class Error{
	public static void main(String[] args) {
		new Error().doTheWork();
	}
	public Object makeObj(int type) throws IllegalArgumentException{
		if(type == 1)
			throw new IllegalArgumentException("不是指定的类型："+type);
		return new Object();
	}
	public void doTheWork() {
		Object o = null;
		for(int i=0;i<5;i++) {
			try {
				o = makeObj(i);
			}catch(IllegalArgumentException e) {
				System.err.println("Error:"+e.getMessage());
			} finally{
				System.err.println("执行完毕！");
				if(o==null)
					System.exit(0);
			}
		}
		System.out.println(o);
	}
}
*/

//4.使用catch处理异常
/*
public class Error{
	public static void main(String[] args) {
		int[] array = {20,20,40};
		int num1 = 15,num2 = 10;
		int result = 10;
		try {
			result = num1/num2;
			System.out.println("结果为："+result);
			for(int i=5;i>=0;i++) {
				System.out.println("数组元素值为："+array[i]);
			}
		}catch(Exception e) {
			System.out.println("触发异常："+e);
		}
	}
}
*/

//5.多线程异常处理
/*
class MyThread extends Thread{
	public void run() {
		System.out.println("Throwing in "+"MyThread");
		throw new RuntimeException();
	}
}
class Error{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		try {
			Thread.sleep(1000);
		}catch(Exception x) {
			System.out.println("Caught it"+x);
		}
		System.out.println("exited");
	}
}
*/

//6.获取异常的堆栈信息
//使用异常类的 printStack() 方法来获取堆栈信息
/*
public class Error{
	public static void main(String[] args) {
		int[] array = {20,20,40};
		int num1=15, num2=10;
		int result = 10;
		try {
			result = num1/num2;
			System.out.println("The result is"+result);
			for(int i=5;i>=0;i--) {
				System.out.println("The values of array is"+array[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}*/

/*
//重载方法异常处理
public class Error{
	double method(int i){
		return i/0;
	}
	boolean method(boolean b) {
		return !b;
	}
	static double method(int x, double y) throws Exception {
		return x + y;
	}
	static double method(double x, double y) {
		return x + y -3;
	}
	public static void main(String[] args) {
		Error err = new Error();
		try {
			System.out.println(method(10,20.0));
			System.out.println(method(10.0,20));
			System.out.println(method(10.0,20.0));
//			System.out.println(err.method(10));
			System.out.println(err.method(true));
		}catch(Exception e) {
			System.out.println("异常信息为："+e);
		}
	}
}
*/

//链试异常
//使用多个 catch 来处理链试异常
/*
public class Error{
	public static void main(String[] args) throws Exception {
		int n = 20, result = 0;
		try {
			result = n/0;
			System.out.println("结果为："+result);
		}
		catch(ArithmeticException e) {
			System.out.println("发生算数异常："+e);
			try {
				throw new NumberFormatException();
			}
			catch(NumberFormatException e1) {
				System.out.println("手动抛出链试异常："+e1);
			}
		}
	}
}
*/



//自定义异常
//通过继承 Exception 来实现自定义异常
//this和super很像，this指向的是当前对象的调用，super指向的是当前调用对象的父类
/*
class ErrorInputExpection extends Exception{ //自定义的类
	ErrorInputExpection(String s){
		super(s);
	}
}
class Input{
	void method() throws ErrorInputExpection{
		throw new ErrorInputExpection("Wrong input"); //抛出自定义的类
	}
}
class Error{
	public static void main(String[] args) {
		try {
			new Input().method();
		}
		catch(ErrorInputExpection e) {
			System.out.println(e.getMessage());
		}
	}
}
*/


















