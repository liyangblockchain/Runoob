package collection;

//1.����ת����
//ʹ�� Java Util ��� Arrays.asList(name) ����������ת��Ϊ����
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
		//������תΪ����
		List<String> list = Arrays.asList(name);
		//��ת����ļ������
		System.out.println(list);
		//�������ַ�����ʽ���
//		for(String li : list) {
//			String str = li;
//			System.out.println(str+" ");
//		}
	}
}
*/

//2.���ϱȽ�
//���ַ���ת��Ϊ���ϲ�ʹ�� Collection ��� Collection.min() �� Collection.max() ���Ƚϼ����е�Ԫ��

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






















