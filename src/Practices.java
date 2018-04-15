// 如何编译 Java 文件
/*public class Practices {
	public static void main(String[] args) {
		System.out.println("gexijain");
	}
}
*/

/*
public class Practices {
	// 1.java字符串比较
	public static void main(String args[]) {
		String str = "hello airlddddd!";
		String anotherString = "Hello beauty!";
		Object objStr = str;

		//比较ASCII码差值
		System.out.println(str.compareTo(anotherString)); 
		System.out.println(str.compareToIgnoreCase(anotherString)); //忽略大小写
		System.out.println(str.compareTo(objStr.toString())); // 把字符串对象再转化为字符串
		System.out.println(objStr.toString()); // 把字符串对象再转化为字符串
		System.out.println(objStr); // 把字符串对象再转化为字符串
	}
	*/
/*
	// 2.查找字符串最后一次出现的位置
	public static void main(String[] args) {
		String origStr = "Hello, girl! Hello beauty";
		int lastIndex = origStr.lastIndexOf("He");

		// 如果字符串不存在，就返回-1
		System.out.println(lastIndex);
		if (lastIndex == -1) {
			System.out.println("字符串不存在！");
		} else {
			System.out.println("字符串的最后出现的位置是：" + lastIndex);
		}
	}
}*/

 
 /*
public class Practices {
	// 字符串替换
	public static void main(String[] args) {
		String str = "Hello beauty";
		// 替换单个字符
		System.out.println(str.replace('H', 'W'));
		// 替换字符串，注意用“”
		System.out.println(str.replaceFirst("o", "Wae"));
		// 替换所有字符串
		System.out.println(str.replaceAll("l", "o"));
	}*/

/*		// 字符串反转
	public static void main(String[] args) {
		String str = "runoob";
		
		// 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类
		// (http://www.runoob.com/java/java-stringbuffer.html)
		String reverse = new StringBuffer(str).reverse().toString();

		System.out.println("字符串反转前：" + str);
		System.out.println("字符串反转后：" + reverse);
	}
}*/
	
	
// 字符串查找
/*
public class Practices {
	public static void main(String[] args) {
		String strOrig = "girl lady beauty";
//		int indexOf = strOrig.indexOf("lady");
		int indexOf = strOrig.indexOf("beau");

		if (indexOf == -1) {
			System.out.println("买有找到字符串！");
		} else {
			System.out.println("lady字符串的位置是：" + indexOf);
		}
	}
}
*/


// 字符串分割
/*
public class Practices {
	public static void main(String[] args) {
		
		String str = "www-liyang-com";
		String[] temp;
		String delimeter = "-";  // 指定分隔符
		temp = str.split(delimeter); //分隔字符串
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

		System.out.println("------java for each循环输出的方法-----");
		String str1 = "www.liyang.com";
		String[] temp1;
		String delimeter1 = "\\."; // 指定分隔符， .需转义
		temp1 = str1.split(delimeter1);
		for(String x : temp1) {
			System.out.println(x);
		} 
	}
} */



// 字符串分隔(StringTokenizer)
/*
import java.util.StringTokenizer;

public class Practices {
	public static void main(String[] args) {
		String str = "This is String , split by StringTokenizer, created by runoob";
		StringTokenizer st = new StringTokenizer(str); //默认通过空格分隔

		System.out.println("----- 通过空格分隔 ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		System.out.println("----- 通过逗号分隔 ------");
		StringTokenizer str2 = new StringTokenizer(str, ","); //设置通过","分隔
		while (str2.hasMoreElements()) {
			System.out.println(str2.nextElement());
		}
	}
}*/



// 字符串小写转大写
/*
public class Practices {
	public static void main(String[] args) {
		String str = "Liyang";
		String strUpper = str.toUpperCase();
		String strLower = str.toLowerCase();

		System.out.println("原始字符串是：" + str);
		System.out.println("转换为大写：" + strUpper);
		System.out.println("转换为小写：" + strLower);
	}
}*/



//10.测试两个字符串区域是否相等
/*
public class Practices {
	public static void main(String[] args) {
		String str1 = "Welcome to Microsoft";
		String str2 = "I work with microsoft";

		//将str1 从第11个字符"M"开始和 str2字符串的第12个字符"m"开始逐个比较，共比较 9 对字符，由于字符串区分大小写，所以结果为false
		boolean match1 = str1.regionMatches(11, str2, 12, 9);
		boolean match2 = str1.regionMatches(true, 11, str2, 12, 9); //第一个参数true，表示忽略大小写

		System.out.println("区分大小写返回值：" + match1);
		System.out.println("不区分大小写返回值：" + match2);
	}
}*/


//11.字符串性能比较测试，通过对象创建字符串
/*
public class Practices {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 返回当前的计算机时间,与1970年1月1号0时0分0秒所差的毫秒数。
		// System.out.println(startTime);
		for (int i = 0; i < 50000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("通过String关键字创建字符串" + ":" + (endTime - startTime) + "毫秒");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("通过String对象创建字符串" + ":" + (endTime1 - startTime1) + "毫秒");
	}
}
*/


// 字符串优化
/*
public class Practices {
	public static void main(String[] args) {
		String[] variables = new String[50000]; //通过对象创建数组
		
		for (int i = 0; i < variables.length; i++) {
			variables[i] = "s" + i;
			// System.out.println(variables[i]); //s0 s1 s2......
		}

		// 直接使用字符串
		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = "hello";
			// System.out.println(variables[i]); //测试输出，被重新赋值为 hello
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("直接使用字符串：" + (endTime0 - startTime0) + "ms");

		// 通过String对象创建字符串
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = new String("hello");
		//	System.out.println(variables[i]); //测试输出，被重新赋值为 hello
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("通过String对象创建字符串：" + (endTime1 - startTime1) + "ms");

		// 使用字符串对象的intern()方法
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			variables[i] = new String("hello");
			variables[i] = variables[i].intern(); // intern() 方法返回字符串对象的规范化表示形式
			System.out.println(variables[i]);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("使用字符串对象的intern()方法：" + (endTime2 - startTime2) + "ms");
	}
}
*/


// 字符串格式化

/*import java.util.*;

public class Practices {
	public static void main(String[] args) {
		double e = Math.E;
		System.out.format("%1.15f%n", e); // %n:换行;1.15(整数部分占位.小数部分位数)
		System.out.format(Locale.CHINA, "%-10.4f%n%n", e); // Locale.CHINA：设置系统默认为中文
	}
}*/



// 连接字符串
/*
public class Practices {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("字符串连接" + "——使用+操作符：" + (endTime - startTime) + "ms");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			StringBuffer result = new StringBuffer();
			result.append("This is");
			result.append("testing the");
			result.append("difference");
			result.append("between");
			result.append("String");
			result.append("and");
			result.append("StringBuffer");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("字符串连接" + "——使用StringBuffer:" + (endTime1 - startTime) + "ms");
	}
}
*/
