// Java����
// ��������Ԫ�ز���
/*package Array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) throws Exception {
		int[] array = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		//��������������ַ�����1��ֱ�������2�����巽��
		//for(int i=0;i<10;i++) {
		//System.out.println(array[i]);
		//}

		printArray("����������Ϊ��", array); //ע�⣺������+�� ����printArray����

		int index = Arrays.binarySearch(array, 2);
		System.out.println("Ԫ��2�ڵ�" + index + "��λ��");
	}

	private static void printArray(String message, int[] array) {
		System.out.println(message + "[length: " + array.length + "]");
		
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}*/


 
//�������Ԫ��
/*package Array;

import java.util.Arrays;
public class Array{
	public static void main(String[] args) throws Exception {   //�׳��쳣
		int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		Arrays.sort(array);
		printArray("��������",array);
		
		int index = Arrays.binarySearch(array, 1);
		System.out.println("Ԫ��1���ڵ�λ�ã�����Ϊ�����ڣ���"+index);
		
		int newIndex = -index-1;
		array = insertElement(array, 1, newIndex); //insertElement�Ǹ�����; ���������Ԫ��1
		printArray("���������Ԫ��1",array);
	}
		
	private static void printArray(String meaasge,int[] array) {
		System.out.println(meaasge+"[length:"+array.length+"]");
		for(int i=0;i<array.length;i++) {
			if(i!=0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	private static int[] insertElement(int[] original,int element,int index) {
		int length = original.length;
		int destination[] = new int [length+1];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index+1, length-index);
		return destination;
	}
}*/



//package Array;
//
//import java.util.Arrays;
//import java.util.Collections;

//��ȡ���鳤��
/*public class Array{
	public static void main(String[] args) {
		String[][] data = new String[2][6];
		System.out.println("��һά���鳤�ȣ�"+data.length);
		System.out.println("�ڶ�ά���鳤�ȣ�"+data[0].length);
	}
}*/

//���鷴ת
/*import java.util.ArrayList;
import java.util.Collections;

public class Array{
	public static void main(String[] args) {
//		List<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ge");
		arrayList.add("xi");
		arrayList.add("jian");
		System.out.println("��תǰ��"+arrayList);
		Collections.reverse(arrayList);
		System.out.println("��ת��"+arrayList);
	}
}*/

//�������
/*public class Array{
	public static void main(String[] args) {
		String[] greeting = new String[4];
		greeting[0] = "�ṹ��˼ά";
		greeting[1] = "Structured Thinking";
		greeting[2] = "ע����>ʱ��>��Ǯ";
		greeting[3] = "Reminiscence of a Stock Operator";
		for(int i=0;i<greeting.length;i++) {
			System.out.println(greeting[i]);
		}
	}
}*/


package Array;

//�����ȡ���ֵ����Сֵ
//����ʵ����ʾ�����ͨ�� Collection ��� Collection.max() �� Collection.min() ���������������е�������Сֵ��

/*import java.util.Arrays;
import java.util.Collections;

public class Array{
	public static void main(String[] args) {
		Integer[] numbers = {8,2,7,1,4,9,5};
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("��Сֵ��"+min);
		System.out.println("���ֵ��"+max);
	}
}*/


//����ϲ�
//����ʵ����ʾ�����ͨ�� List ��� Arrays.toString () ����
//�� List ��� list.Addall(array1.asList(array2) ��������������ϲ�Ϊһ�����飺
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.*;

public class Array{
	public static void main(String[] args) {
		String[] a = {"G","X","J"};
		String[] b = {"M","W"};
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}
}*/

//�������
//ͨ�� Java Util ��� Arrays.fill(arrayname,value) ������
//Arrays.fill(arrayname ,starting index ,ending index ,value) ���������������Ԫ�أ�
/*import java.util.*;

public class Array{
	public static void main(String[] args) {
		int[] array = new int[6];
		Arrays.fill(array, 100);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		Arrays.fill(array, 3, 6, 50);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}*/

//��������
/*public class Array {
	public static void main(String[] args) {
		String[] names = new String[] {"A","B","C"};
		String[] extended = new String[5];
		extended[3] = "D";
		extended[4] = "E";
		System.arraycopy(names, 0, extended, 0, names.length);
		for(String str:extended) {
			System.out.println(str);
		}
	}
}*/

//���������е��ظ�Ԫ��
/*import java.util.*;

public class Array{
	public static void main(String[] args) {
		int[] arr = {1,2,5,5,6,6,7,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j])&&(i!=j)) {
					System.out.println("�ظ�Ԫ�أ�"+arr[j]);
				}
			}
		}
	}
}*/


//ɾ������Ԫ��
//����ʵ����ʾ�����ʹ�� remove() ������ɾ������Ԫ�أ�
//ArrayList��List��һ��ʵ���࣬����ʵ�������С�Ŀɱ䣬���Ժܷ���Ľ������Ӻ�ɾ��������Ԫ�صĲ���
/*import java.util.ArrayList;;

public class Array {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0,"��0��Ԫ��");
		objArray.add(1,"��1��Ԫ��");
		objArray.add(2,"��2��Ԫ��");
		System.out.println("����ɾ��Ԫ��ǰ��"+objArray);
		
		objArray.remove(1);
		objArray.remove("��0��Ԫ��");
		System.out.println("����ɾ��Ԫ�غ�"+objArray);
		
	} 
}*/

//����
//����ʵ����ʾ�����ʹ�� removeAll () ������������������Ĳ

/*import java.util.ArrayList;

public class Array{
	public static void main(String[] args) {
		ArrayList objArray1 = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		
		objArray1.add(0,"ge");
		objArray1.add(1,"xi");
		objArray1.add(2,"jian");
		objArray2.add(0,"ge");
		objArray2.add(1,"li");
		objArray2.add(2,"yang");
		
		System.out.println("array1��Ԫ�أ�"+objArray1);
		System.out.println("array2��Ԫ�أ�"+objArray2);
		
		objArray1.removeAll(objArray2);
		System.out.println("array1��array2�������ǣ�"+objArray1);
	}
}*/

//���齻��
//����ʵ����ʾ�����ʹ�� retainAll () ������������������Ľ���

/*import java.util.ArrayList;

public class Array{
	public static void main(String[] args) {
		ArrayList objArray1 = new ArrayList();
		ArrayList objArray2 = new ArrayList();
		
		objArray1.add(0,"ge");
		objArray1.add(1,"xi");
		objArray1.add(2,"jian");
		objArray2.add(0,"ge");
		objArray2.add(1,"li");
		objArray2.add(2,"yang");
		
		System.out.println("array1����Ԫ�أ�"+objArray1);
		System.out.println("array2����Ԫ�أ�"+objArray2);
		
		objArray1.retainAll(objArray2);
		System.out.println("array1&&array2:"+objArray1);
	}
}*/

//���鲢��
//����ʵ����ʾ�����ʹ�� union ()������������������Ĳ�����

/*import java.util.*;
 
public class Array {
    public static void main(String[] args) throws Exception {
        String[] arr1 = { "1", "1", "4" };
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("�����Ľ�����£�");
 
        for (String str : result_union) {
            System.out.println(str);
        }
    }
    //�������ַ�������Ĳ���������set��Ԫ��Ψһ��
    public static String[] union(String[] arr1, String[] arr2) {
    	Set<String> set = new HashSet<String>();
    	for(String str : arr1) {
    		set.add(str);
    	}
    	for(String str : arr2) {
    		set.add(str);
    	}
    	
    	String[] result = {};
    	return set.toArray(result);
    }   
}*/


//�������в���ָ��Ԫ��
//����ʵ����ʾ�����ʹ�� contains () ���������������е�ָ��Ԫ��
/*import java.util.ArrayList;

public class Array{
	public static void main(String[] args) {
		ArrayList<String> objArray1 = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		
		objArray1.add(0,"ge");
		objArray1.add(1,"xi");
		objArray1.add(2,"jian");
		objArray2.add(0,"ge");
		objArray2.add(1,"li");
		objArray2.add(2,"yang");
		
		System.out.println("array1����Ԫ�أ�"+objArray1);
		System.out.println("array2����Ԫ�أ�"+objArray2);
		
		System.out.println("objArray1�Ƿ�����ַ�����ge��?�𰸣�"+objArray1.contains("ge"));
		System.out.println("objArray2�Ƿ�������顮objArray1��?�𰸣�"+objArray2.contains(objArray1));
		
	}
}*/

//�ж������Ƿ����
//����ʵ����ʾ�����ʹ�� equals ()�������ж������Ƿ���ȣ�

/*import java.util.Arrays;

public class Array{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3};
		
		System.out.println("����arr��arr1�Ƿ���ȣ��𰸣�"+Arrays.equals(arr, arr1));
		System.out.println("����arr��arr2�Ƿ���ȣ��𰸣�"+Arrays.equals(arr, arr2));
	}
}*/


