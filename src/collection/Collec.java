package collection;

//1.数组转集合
//使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合
/*
import java.util.*;
import java.io.*;

public class Collec {
	public static void main(String[] args) throws IOException{
		int n =  5;
		String[] name = new String[n];
		for(int i=0;i<n;i++) {
			name[i] = String.valueOf(i);
		}
		//将数组转为集合
		List<String> list = Arrays.asList(name);
		//将转化后的集合输出
		System.out.println(list);
		//将集以字符串形式输出
//		for(String li : list) {
//			String str = li;
//			System.out.println(str+" ");
//		}
	}
}
*/

//2.集合比较
//将字符串转换为集合并使用 Collection 类的 Collection.min() 和 Collection.max() 来比较集合中的元素

/*
import java.util.*; //(.Collections,Set,TreeSet)

class Collec{
	public static void main(String[] args) {
		String[] coins = {"Penny", "nickel", "dime", "Quarter", "dollar"};
		Set<String> set = new TreeSet<String>();
		for(int i=0;i<coins.length;i++) {
			set.add(coins[i]);
		}
		System.out.println(Collections.min(set));
		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
		for(int i=0;i<=10;i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println(Collections.max(set));
		System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
	}
}*/






















