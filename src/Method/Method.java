package Method;

//��������
//����ʵ����ʾ��������� MyClass ��� info ����
/*class MyClass{
	int height;
	MyClass(){
		System.out.println("�޲������캯��");
		height = 4;
	}
	MyClass(int i){
		System.out.println("���Ӹ߶�Ϊ��"+i+"��");
		height = i;
	}
	void info() {
		System.out.println("���Ӹ߶�Ϊ��"+height+"��");
	}
	void info(String s) {
		System.out.println(s+":���Ӹ߶�Ϊ"+height+"��");
	}
}

public class Method {
	public static void main(String[] args) {
		MyClass t = new MyClass(3);
		t.info();
		t.info("���ط���");
		new MyClass();
	}
}*/

//�������Ԫ��
//����ʵ����ʾ�����ͨ������ MainClass ��� printArray ���������ͬ����(����, ˫���ȼ��ַ���)������
/*
public class Method{
	public static void printArray(Integer[] inputArray) {
		for(Integer element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
	}
	public static void printArray(Double[] inputArray) {
		for(Double element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
	}
	public static void printArray(Character[] inputArray) {
		for(Character element : inputArray) {
			System.out.printf("%s", element);
			System.out.println();
		}
	}
	
//	������
	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		Character[] characterArray = {'G', 'X', 'J'};
		
		System.out.println("���Integer���飺");
		printArray(integerArray);
		System.out.println("\n���Double���飺");
		printArray(doubleArray);
		System.out.println("\n����ַ������飺");
		printArray(characterArray);
	}
}*/

//��ŵ��

//�Ʋ���������
/*public class Method{
	public static long fibo(long number) {
		if((number == 0)||(number == 1))
			return number;
		else
			return fibo(number-1)+fibo(number-2);
	}
	public static void main(String[] args) {
		System.out.println("쳲��������У�");
		for(int counter = 1; counter < 10; counter++) {
			System.out.printf("%d ", fibo(counter));
		}
	}
}*/

//�׳ˣ�factorial��

/*public class Method{
	public static void main(String[] args) {
		for(int counter=0; counter<=10;counter++) {
			System.out.printf("%d! = %d\n",counter,factorial(counter));
		}
		int counter = -10;
		System.out.printf("%d! = %d",counter,factorial(counter));
	}
	public static long factorial(long number) {
		if(number<=0)
			return 0;
//		    System.out.println("1231");
		else if((number>0)&&(number<=1))
			return 1;
		else
			return number * factorial(number - 1);
	}
}
*/

//��������
/*
public class Method{
	public static void main(String[] args) {
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(9,5);
		
		System.out.println("Area is:"+f.area());
		System.out.println("Area is:"+r.area());
	}
}
//����
class Figure{
	double dim1;
	double dim2;
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	Double area() {
		System.out.println("Inside area of figure");
		return(dim1*dim2);
	}
}
//����
class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a,b);
	}
	Double area() {
		System.out.println("Inside area of figure");
		return(dim1*dim2);
	}
}
*/

//instanceof�ؼ����÷�
//�����ǲ�������ߵĶ����Ƿ������ұߵ����ʵ�������� boolean ���������͡�
/*import java.util.*;

public class Method{
	public static void main(String[] args) {
		Object testObj = new ArrayList();
		displayObjectClass(testObj);
	}
	public static void displayObjectClass(Object o) {
		if(o instanceof Vector)
			System.out.println("������ java.util.Vector ���ʵ��");
		else if(o instanceof ArrayList)
    		System.out.println("������ java.util.ArrayList ���ʵ��");
		else
			System.out.println("������"+ o.getClass() + "���ʵ��");
	}
}
*/


//break�ؼ��ֵ��÷�
/*public class Method{
	public static void main(String[] args) {
		int[] arr = {99,12,22,32,67,5678,899};
		int no = 5678;
		int i=0; //i������forѭ���ж��壬������벻ͨ��
		boolean found = false;
		for(;i<arr.length;i++) {
			if(arr[i] == no) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(no+"Ԫ��������λ���ڣ�"+i);
		else 
			System.out.println("Ԫ�ز���������");
	}
}*/

//continue�ؼ���
/*public class Method{
	public static void main(String[] args) {
		StringBuffer searchStr = new StringBuffer("hello pretty girl"); 
		int length = searchStr.length();
		int count = 0;
		for(int i=0; i<length;i++) {
			if(searchStr.charAt(i)!='t')
				continue;
			count++;
		}
		System.out.println("����"+count+"��t�ַ�");
		System.out.println(searchStr);
	}
}*/

//��ǩLabel
/*Java �еı�ǩ��Ϊѭ����Ƶģ���Ϊ���ڶ���ѭ���з����ʹ��break ��coutinue ��
����ʵ������ѭ����ʹ�� break �� continue ѭ��ʱ����ָ���ı�ǩ����*/

/*public class Method{
	public static void main(String[] args) {
		String str = "This is the string in which you have to search for a substring.";
		String subStr = "substring";
		boolean found = false;
		int max = str.length() - subStr.length();
		testLable:
			for(int i=0;i<=max;i++) {
				int length = subStr.length();
				int j = i;
				int k = 0;
				while(length-- !=0) {
					if(str.charAt(j++)!=str.charAt(k++)) {
						continue testLable;
					}
				}
				found = true;
				break testLable;
			}
		if(found) {
			System.out.println("����" + subStr + "�ַ���");
		}
		else {
			System.out.println("û�з���" + subStr + "�ַ���");
		}
	}
}*/

//enum��switch����ʹ��
//Java ����ö������Ҫʹ�� enum �ؼ��֣������������������Ͷ��� java.lang.Enum �������
/*
enum Car{
	lambroghini, tata, audi, fiat, handa
}
public class Method{
	public static void main(String[] args) {
		Car c = Car.tata;
//		c = Car.tata;
		switch(c) {
		case lambroghini:
			System.out.println("��ѡ����lambroghini");
			break;
		case tata:
			System.out.println("��ѡ����tata!");
			break;
		case audi:
			System.out.println("��ѡ����audi!");
			break;
		case handa:
			System.out.println("��ѡ����handa!");
			break;
		default:
			System.out.println("��֪����ĳ��ͣ�");
			break;
		}
	}
}*/

//enum���캯����������ʹ��
//����ʵ����ʾ��Enum��ö�٣����캯����������ʹ��
/*
enum Car{
	lamborghini(900),tata(2),audi(50),fiat(15),handa(12);
	private int price;
	Car(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
}
public class Method{
	public static void main(String[] args) {
		System.out.println("���������ļ۸�");
		for(Car a : Car.values())
			System.out.println(a+"��Ҫ"+a.getPrice()+"ǧ��Ԫ��");
	}
}
*/

//for��foreachѭ��ʹ��
//foreach��Java5��������֮һ
/*public class Method{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		forDisplay(arr);
		foreachDisplay(arr);
	}
	public static void forDisplay(int[] a) {
		System.out.println("ʹ��forѭ������");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void foreachDisplay(int[] b) {
		System.out.println("ʹ��foreachѭ������");
		for(int a:b) {
			System.out.print(a+" ");
		}
	}
}*/

//Varargs(���ǹؼ���)�ɱ����,�÷����β���ʹ��"..."
//Java1.5�ṩ��һ����varargs���¹��ܣ����ǿɱ䳤�ȵĲ���
//����ʵ�������� sumvarargs() ������ͳ���������ֵ�ֵ
/*
public class Method{
	static int sumvarargs(int...intArrays) {
		int sum = 0,i;
		for(i=0;i<intArrays.length;i++) {
			sum += intArrays[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int sum=0;
		sum = sumvarargs(new int[] {10,12,33});
		System.out.println("�������֮���ǣ�"+sum);
	}
}*/

//����(overloading)������ʹ�ÿɱ����
/*
public class Method{
	static void vaTest(int...no) {
		System.out.print("(int...)����������"+no.length+" ���� ");
		for(int n:no)
			System.out.print(n+" ");
		System.out.println();
	}
	static void vaTest(boolean...b1) {
		System.out.print("(boolean...)"+"����������"+b1.length+" ���ݣ� ");
		for(boolean b:b1)
			System.out.print(b+" ");
		System.out.println();
	}
	static void vaTest(String msg,int...no) {
		System.out.print("(String,int...):"+msg+"����������"+no.length+" ���ݣ�");
		for(int n:no)
			System.out.print(n+" ");
		System.out.println();
	}
	public static void main(String[] args) {
//		vaTest(1,2,3);
		vaTest("����",10,20);
		vaTest(true,true,true);
	}
}
*/


















