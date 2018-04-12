package Method;

//方法重载
//以下实例演示了如何重载 MyClass 类的 info 方法
/*class MyClass{
	int height;
	MyClass(){
		System.out.println("无参数构造函数");
		height = 4;
	}
	MyClass(int i){
		System.out.println("房子高度为："+i+"米");
		height = i;
	}
	void info() {
		System.out.println("房子高度为："+height+"米");
	}
	void info(String s) {
		System.out.println(s+":房子高度为"+height+"米");
	}
}

public class Method {
	public static void main(String[] args) {
		MyClass t = new MyClass(3);
		t.info();
		t.info("重载方法");
		new MyClass();
	}
}*/

//输出数组元素
//以下实例演示了如何通过重载 MainClass 类的 printArray 方法输出不同类型(整型, 双精度及字符型)的数组
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
	
//	主方法
	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		Character[] characterArray = {'G', 'X', 'J'};
		
		System.out.println("输出Integer数组：");
		printArray(integerArray);
		System.out.println("\n输出Double数组：");
		printArray(doubleArray);
		System.out.println("\n输出字符型数组：");
		printArray(characterArray);
	}
}*/

//汉诺塔

//菲波那切数列
/*public class Method{
	public static long fibo(long number) {
		if((number == 0)||(number == 1))
			return number;
		else
			return fibo(number-1)+fibo(number-2);
	}
	public static void main(String[] args) {
		System.out.println("斐波那契数列：");
		for(int counter = 1; counter < 10; counter++) {
			System.out.printf("%d ", fibo(counter));
		}
	}
}*/

//阶乘（factorial）

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

//方法覆盖
/*
public class Method{
	public static void main(String[] args) {
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(9,5);
		
		System.out.println("Area is:"+f.area());
		System.out.println("Area is:"+r.area());
	}
}
//父类
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
//子类
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

//instanceof关键字用法
//作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
/*import java.util.*;

public class Method{
	public static void main(String[] args) {
		Object testObj = new ArrayList();
		displayObjectClass(testObj);
	}
	public static void displayObjectClass(Object o) {
		if(o instanceof Vector)
			System.out.println("对象是 java.util.Vector 类的实例");
		else if(o instanceof ArrayList)
    		System.out.println("对象是 java.util.ArrayList 类的实例");
		else
			System.out.println("对象是"+ o.getClass() + "类的实例");
	}
}
*/


//break关键字的用法
/*public class Method{
	public static void main(String[] args) {
		int[] arr = {99,12,22,32,67,5678,899};
		int no = 5678;
		int i=0; //i不能在for循环中定义，否则编译不通过
		boolean found = false;
		for(;i<arr.length;i++) {
			if(arr[i] == no) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(no+"元素索引的位置在："+i);
		else 
			System.out.println("元素不在数组中");
	}
}*/

//continue关键字
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
		System.out.println("发现"+count+"个t字符");
		System.out.println(searchStr);
	}
}*/

//标签Label
/*Java 中的标签是为循环设计的，是为了在多重循环中方便的使用break 和coutinue 。
以下实例当在循环中使用 break 或 continue 循环时跳到指定的标签处：*/

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
			System.out.println("发现" + subStr + "字符串");
		}
		else {
			System.out.println("没有发现" + subStr + "字符串");
		}
	}
}*/

//enum和switch语句的使用
//Java 创建枚举类型要使用 enum 关键字，隐含了所创建的类型都是 java.lang.Enum 类的子类
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
			System.out.println("你选择了lambroghini");
			break;
		case tata:
			System.out.println("你选择了tata!");
			break;
		case audi:
			System.out.println("你选择了audi!");
			break;
		case handa:
			System.out.println("你选择了handa!");
			break;
		default:
			System.out.println("不知道你的车型！");
			break;
		}
	}
}*/

//enum构造函数及方法的使用
//以下实例演示了Enum（枚举）构造函数及方法的使用
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
		System.out.println("所有汽车的价格：");
		for(Car a : Car.values())
			System.out.println(a+"需要"+a.getPrice()+"千美元。");
	}
}
*/

//for和foreach循环使用
//foreach是Java5的新特性之一
/*public class Method{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		forDisplay(arr);
		foreachDisplay(arr);
	}
	public static void forDisplay(int[] a) {
		System.out.println("使用for循环数组");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void foreachDisplay(int[] b) {
		System.out.println("使用foreach循环数组");
		for(int a:b) {
			System.out.print(a+" ");
		}
	}
}*/

//Varargs(不是关键字)可变参数,用法：形参中使用"..."
//Java1.5提供了一个叫varargs的新功能，就是可变长度的参数
//以下实例创建了 sumvarargs() 方法来统计所有数字的值
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
		System.out.println("数字相加之和是："+sum);
	}
}*/

//重载(overloading)方法中使用可变参数
/*
public class Method{
	static void vaTest(int...no) {
		System.out.print("(int...)参数个数："+no.length+" 内容 ");
		for(int n:no)
			System.out.print(n+" ");
		System.out.println();
	}
	static void vaTest(boolean...b1) {
		System.out.print("(boolean...)"+"参数个数："+b1.length+" 内容： ");
		for(boolean b:b1)
			System.out.print(b+" ");
		System.out.println();
	}
	static void vaTest(String msg,int...no) {
		System.out.print("(String,int...):"+msg+"参数个数："+no.length+" 内容：");
		for(int n:no)
			System.out.print(n+" ");
		System.out.println();
	}
	public static void main(String[] args) {
//		vaTest(1,2,3);
		vaTest("测试",10,20);
		vaTest(true,true,true);
	}
}
*/


















