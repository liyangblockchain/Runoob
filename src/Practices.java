// ��α��� Java �ļ�
/*public class Practices {
	public static void main(String[] args) {
		System.out.println("gexijain");
	}
}
*/

/*
public class Practices {
	// 1.java�ַ����Ƚ�
	public static void main(String args[]) {
		String str = "hello airlddddd!";
		String anotherString = "Hello beauty!";
		Object objStr = str;

		//�Ƚ�ASCII���ֵ
		System.out.println(str.compareTo(anotherString)); 
		System.out.println(str.compareToIgnoreCase(anotherString)); //���Դ�Сд
		System.out.println(str.compareTo(objStr.toString())); // ���ַ���������ת��Ϊ�ַ���
		System.out.println(objStr.toString()); // ���ַ���������ת��Ϊ�ַ���
		System.out.println(objStr); // ���ַ���������ת��Ϊ�ַ���
	}
	*/
/*
	// 2.�����ַ������һ�γ��ֵ�λ��
	public static void main(String[] args) {
		String origStr = "Hello, girl! Hello beauty";
		int lastIndex = origStr.lastIndexOf("He");

		// ����ַ��������ڣ��ͷ���-1
		System.out.println(lastIndex);
		if (lastIndex == -1) {
			System.out.println("�ַ��������ڣ�");
		} else {
			System.out.println("�ַ����������ֵ�λ���ǣ�" + lastIndex);
		}
	}
}*/

 
 /*
public class Practices {
	// �ַ����滻
	public static void main(String[] args) {
		String str = "Hello beauty";
		// �滻�����ַ�
		System.out.println(str.replace('H', 'W'));
		// �滻�ַ�����ע���á���
		System.out.println(str.replaceFirst("o", "Wae"));
		// �滻�����ַ���
		System.out.println(str.replaceAll("l", "o"));
	}*/

/*		// �ַ�����ת
	public static void main(String[] args) {
		String str = "runoob";
		
		// �����ַ��������޸ĵ�ʱ����Ҫʹ�� StringBuffer �� StringBuilder ��
		// (http://www.runoob.com/java/java-stringbuffer.html)
		String reverse = new StringBuffer(str).reverse().toString();

		System.out.println("�ַ�����תǰ��" + str);
		System.out.println("�ַ�����ת��" + reverse);
	}
}*/
	
	
// �ַ�������
/*
public class Practices {
	public static void main(String[] args) {
		String strOrig = "girl lady beauty";
//		int indexOf = strOrig.indexOf("lady");
		int indexOf = strOrig.indexOf("beau");

		if (indexOf == -1) {
			System.out.println("�����ҵ��ַ�����");
		} else {
			System.out.println("lady�ַ�����λ���ǣ�" + indexOf);
		}
	}
}
*/


// �ַ����ָ�
/*
public class Practices {
	public static void main(String[] args) {
		
		String str = "www-liyang-com";
		String[] temp;
		String delimeter = "-";  // ָ���ָ���
		temp = str.split(delimeter); //�ָ��ַ���
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

		System.out.println("------java for eachѭ������ķ���-----");
		String str1 = "www.liyang.com";
		String[] temp1;
		String delimeter1 = "\\."; // ָ���ָ����� .��ת��
		temp1 = str1.split(delimeter1);
		for(String x : temp1) {
			System.out.println(x);
		} 
	}
} */



// �ַ����ָ�(StringTokenizer)
/*
import java.util.StringTokenizer;

public class Practices {
	public static void main(String[] args) {
		String str = "This is String , split by StringTokenizer, created by runoob";
		StringTokenizer st = new StringTokenizer(str); //Ĭ��ͨ���ո�ָ�

		System.out.println("----- ͨ���ո�ָ� ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		System.out.println("----- ͨ�����ŷָ� ------");
		StringTokenizer str2 = new StringTokenizer(str, ","); //����ͨ��","�ָ�
		while (str2.hasMoreElements()) {
			System.out.println(str2.nextElement());
		}
	}
}*/



// �ַ���Сдת��д
/*
public class Practices {
	public static void main(String[] args) {
		String str = "Liyang";
		String strUpper = str.toUpperCase();
		String strLower = str.toLowerCase();

		System.out.println("ԭʼ�ַ����ǣ�" + str);
		System.out.println("ת��Ϊ��д��" + strUpper);
		System.out.println("ת��ΪСд��" + strLower);
	}
}*/



//10.���������ַ��������Ƿ����
/*
public class Practices {
	public static void main(String[] args) {
		String str1 = "Welcome to Microsoft";
		String str2 = "I work with microsoft";

		//��str1 �ӵ�11���ַ�"M"��ʼ�� str2�ַ����ĵ�12���ַ�"m"��ʼ����Ƚϣ����Ƚ� 9 ���ַ��������ַ������ִ�Сд�����Խ��Ϊfalse
		boolean match1 = str1.regionMatches(11, str2, 12, 9);
		boolean match2 = str1.regionMatches(true, 11, str2, 12, 9); //��һ������true����ʾ���Դ�Сд

		System.out.println("���ִ�Сд����ֵ��" + match1);
		System.out.println("�����ִ�Сд����ֵ��" + match2);
	}
}*/


//11.�ַ������ܱȽϲ��ԣ�ͨ�����󴴽��ַ���
/*
public class Practices {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// ���ص�ǰ�ļ����ʱ��,��1970��1��1��0ʱ0��0������ĺ�������
		// System.out.println(startTime);
		for (int i = 0; i < 50000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ͨ��String�ؼ��ִ����ַ���" + ":" + (endTime - startTime) + "����");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("ͨ��String���󴴽��ַ���" + ":" + (endTime1 - startTime1) + "����");
	}
}
*/


// �ַ����Ż�
/*
public class Practices {
	public static void main(String[] args) {
		String[] variables = new String[50000]; //ͨ�����󴴽�����
		
		for (int i = 0; i < variables.length; i++) {
			variables[i] = "s" + i;
			// System.out.println(variables[i]); //s0 s1 s2......
		}

		// ֱ��ʹ���ַ���
		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = "hello";
			// System.out.println(variables[i]); //��������������¸�ֵΪ hello
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("ֱ��ʹ���ַ�����" + (endTime0 - startTime0) + "ms");

		// ͨ��String���󴴽��ַ���
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = new String("hello");
		//	System.out.println(variables[i]); //��������������¸�ֵΪ hello
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("ͨ��String���󴴽��ַ�����" + (endTime1 - startTime1) + "ms");

		// ʹ���ַ��������intern()����
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			variables[i] = new String("hello");
			variables[i] = variables[i].intern(); // intern() ���������ַ�������Ĺ淶����ʾ��ʽ
			System.out.println(variables[i]);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("ʹ���ַ��������intern()������" + (endTime2 - startTime2) + "ms");
	}
}
*/


// �ַ�����ʽ��

/*import java.util.*;

public class Practices {
	public static void main(String[] args) {
		double e = Math.E;
		System.out.format("%1.15f%n", e); // %n:����;1.15(��������ռλ.С������λ��)
		System.out.format(Locale.CHINA, "%-10.4f%n%n", e); // Locale.CHINA������ϵͳĬ��Ϊ����
	}
}*/



// �����ַ���
/*
public class Practices {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("�ַ�������" + "����ʹ��+��������" + (endTime - startTime) + "ms");

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
		System.out.println("�ַ�������" + "����ʹ��StringBuffer:" + (endTime1 - startTime) + "ms");
	}
}
*/
