// Java数组
// 数组排序及元素查找
/*package Array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) throws Exception {
		int[] array = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		//输出排序结果，两种方法：1、直接输出；2、定义方法
		//for(int i=0;i<10;i++) {
		//System.out.println(array[i]);
		//}

		printArray("数组排序结果为：", array); //注意：不是用+； 定义printArray方法

		int index = Arrays.binarySearch(array, 2);
		System.out.println("元素2在第" + index + "个位置");
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


 
//数组添加元素
/*package Array;

import java.util.Arrays;
public class Array{
	public static void main(String[] args) throws Exception {   //抛出异常
		int[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		Arrays.sort(array);
		printArray("数组排序",array);
		
		int index = Arrays.binarySearch(array, 1);
		System.out.println("元素1所在的位置（负数为不存在）："+index);
		
		int newIndex = -index-1;
		array = insertElement(array, 1, newIndex); //insertElement是个方法; 向数组添加元素1
		printArray("向数组添加元素1",array);
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

//获取数组长度
/*public class Array{
	public static void main(String[] args) {
		String[][] data = new String[2][6];
		System.out.println("第一维数组长度："+data.length);
		System.out.println("第二维数组长度："+data[0].length);
	}
}*/

//数组反转
/*import java.util.ArrayList;
import java.util.Collections;

public class Array{
	public static void main(String[] args) {
//		List<String> arrayList = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ge");
		arrayList.add("xi");
		arrayList.add("jian");
		System.out.println("反转前："+arrayList);
		Collections.reverse(arrayList);
		System.out.println("反转后："+arrayList);
	}
}*/

//数组输出
/*public class Array{
	public static void main(String[] args) {
		String[] greeting = new String[4];
		greeting[0] = "结构化思维";
		greeting[1] = "Structured Thinking";
		greeting[2] = "注意力>时间>金钱";
		greeting[3] = "Reminiscence of a Stock Operator";
		for(int i=0;i<greeting.length;i++) {
			System.out.println(greeting[i]);
		}
	}
}*/


package Array;

//数组获取最大值和最小值
//以下实例演示了如何通过 Collection 类的 Collection.max() 和 Collection.min() 方法来查找数组中的最大和最小值：

/*import java.util.Arrays;
import java.util.Collections;

public class Array{
	public static void main(String[] args) {
		Integer[] numbers = {8,2,7,1,4,9,5};
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("最小值："+min);
		System.out.println("最大值："+max);
	}
}*/


//数组合并
//以下实例演示了如何通过 List 类的 Arrays.toString () 方法
//和 List 类的 list.Addall(array1.asList(array2) 方法将两个数组合并为一个数组：
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

//数组填充
//通过 Java Util 类的 Arrays.fill(arrayname,value) 方法和
//Arrays.fill(arrayname ,starting index ,ending index ,value) 方法向数组中填充元素：
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

//数组扩容
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

//查找数组中的重复元素
/*import java.util.*;

public class Array{
	public static void main(String[] args) {
		int[] arr = {1,2,5,5,6,6,7,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j])&&(i!=j)) {
					System.out.println("重复元素："+arr[j]);
				}
			}
		}
	}
}*/


//删除数组元素
//以下实例演示了如何使用 remove() 方法来删除数组元素：
//ArrayList是List的一个实现类，可以实现数组大小的可变，可以很方便的进行增加和删减数组内元素的操作
/*import java.util.ArrayList;;

public class Array {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0,"第0个元素");
		objArray.add(1,"第1个元素");
		objArray.add(2,"第2个元素");
		System.out.println("数组删除元素前："+objArray);
		
		objArray.remove(1);
		objArray.remove("第0个元素");
		System.out.println("数组删除元素后："+objArray);
		
	} 
}*/

//数组差集
//以下实例演示了如何使用 removeAll () 方法来计算两个数组的差集

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
		
		System.out.println("array1的元素："+objArray1);
		System.out.println("array2的元素："+objArray2);
		
		objArray1.removeAll(objArray2);
		System.out.println("array1与array2的数组差集是："+objArray1);
	}
}*/

//数组交集
//以下实例演示了如何使用 retainAll () 方法来计算两个数组的交集

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
		
		System.out.println("array1数组元素："+objArray1);
		System.out.println("array2数组元素："+objArray2);
		
		objArray1.retainAll(objArray2);
		System.out.println("array1&&array2:"+objArray1);
	}
}*/

//数组并集
//以下实例演示了如何使用 union ()方法来计算两个数组的并集：

/*import java.util.*;
 
public class Array {
    public static void main(String[] args) throws Exception {
        String[] arr1 = { "1", "1", "4" };
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下：");
 
        for (String str : result_union) {
            System.out.println(str);
        }
    }
    //求两个字符串数组的并集，利用set的元素唯一性
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


//在数组中查找指定元素
//以下实例演示了如何使用 contains () 方法来查找数组中的指定元素
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
		
		System.out.println("array1数组元素："+objArray1);
		System.out.println("array2数组元素："+objArray2);
		
		System.out.println("objArray1是否包含字符串‘ge’?答案："+objArray1.contains("ge"));
		System.out.println("objArray2是否包含数组‘objArray1’?答案："+objArray2.contains(objArray1));
		
	}
}*/

//判断数组是否相等
//以下实例演示了如何使用 equals ()方法来判断数组是否相等：

/*import java.util.Arrays;

public class Array{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3};
		
		System.out.println("数组arr与arr1是否相等？答案："+Arrays.equals(arr, arr1));
		System.out.println("数组arr与arr2是否相等？答案："+Arrays.equals(arr, arr2));
	}
}*/


