//package errors;

//1.�쳣������
//ʹ�� System ��� System.err.println() ��չʾ�쳣�Ĵ�����
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

//2.����쳣�������catch��
/*
class Demo{
//	1�������쳣ʱ������������Ϊ������쳣���������Դ���ĸ�����
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int[] arr = new int[a];
		System.out.println("�±�Ϊ4��Ԫ���ǣ�"+arr[4]);//����ĵ�һ���쳣�������±�Խ��
		return a/b; //����ĵڶ����쳣
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

//3.Finally���÷�
//ʹ�� finally ͨ�� e.getMessage() �������쳣���Ƿ������쳣��
/*
public class Error{
	public static void main(String[] args) {
		new Error().doTheWork();
	}
	public Object makeObj(int type) throws IllegalArgumentException{
		if(type == 1)
			throw new IllegalArgumentException("����ָ�������ͣ�"+type);
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
				System.err.println("ִ����ϣ�");
				if(o==null)
					System.exit(0);
			}
		}
		System.out.println(o);
	}
}
*/

//4.ʹ��catch�����쳣
/*
public class Error{
	public static void main(String[] args) {
		int[] array = {20,20,40};
		int num1 = 15,num2 = 10;
		int result = 10;
		try {
			result = num1/num2;
			System.out.println("���Ϊ��"+result);
			for(int i=5;i>=0;i++) {
				System.out.println("����Ԫ��ֵΪ��"+array[i]);
			}
		}catch(Exception e) {
			System.out.println("�����쳣��"+e);
		}
	}
}
*/

//5.���߳��쳣����
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

//6.��ȡ�쳣�Ķ�ջ��Ϣ
//ʹ���쳣��� printStack() ��������ȡ��ջ��Ϣ
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
//���ط����쳣����
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
			System.out.println("�쳣��ϢΪ��"+e);
		}
	}
}
*/

//�����쳣
//ʹ�ö�� catch �����������쳣
/*
public class Error{
	public static void main(String[] args) throws Exception {
		int n = 20, result = 0;
		try {
			result = n/0;
			System.out.println("���Ϊ��"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("���������쳣��"+e);
			try {
				throw new NumberFormatException();
			}
			catch(NumberFormatException e1) {
				System.out.println("�ֶ��׳������쳣��"+e1);
			}
		}
	}
}
*/



//�Զ����쳣
//ͨ���̳� Exception ��ʵ���Զ����쳣
//this��super����thisָ����ǵ�ǰ����ĵ��ã�superָ����ǵ�ǰ���ö���ĸ���
/*
class ErrorInputExpection extends Exception{ //�Զ������
	ErrorInputExpection(String s){
		super(s);
	}
}
class Input{
	void method() throws ErrorInputExpection{
		throw new ErrorInputExpection("Wrong input"); //�׳��Զ������
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


















