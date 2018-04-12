package dataStructure;


//数字求和运算
/*public class DataStru {
	public static int calculate(int limit) {
		int sum=0;
		int i=1;
		do {
			sum = sum+i;
			i++;
		}
		while(i<=limit);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("sum="+calculate(100));
	}
}
*/

//利用堆栈将中缀表达式转换成后缀表达式

/*import java.io.IOException;

public class DataStru {
   private Stack theStack;
   private String input;
   private String output = "";
   public DataStru(String in) {
      input = in;
      int stackSize = input.length();
      theStack = new Stack(stackSize);
   }
   public String doTrans() {
      for (int j = 0; j < input.length(); j++) {
         char ch = input.charAt(j);
         switch (ch) {
            case '+': 
            case '-':
            gotOper(ch, 1); 
            break; 
            case '*': 
            case '/':
            gotOper(ch, 2); 
            break; 
            case '(': 
            theStack.push(ch);
            break;
            case ')': 
            gotParen(ch); 
            break;
            default: 
            output = output + ch; 
            break;
         }
      }
      while (!theStack.isEmpty()) {
         output = output + theStack.pop();
      }
      System.out.println(output);
      return output; 
   }
   public void gotOper(char opThis, int prec1) {
      while (!theStack.isEmpty()) {
         char opTop = theStack.pop();
         if (opTop == '(') {
            theStack.push(opTop);
            break;
         }
         else {
            int prec2;
            if (opTop == '+' || opTop == '-')
            prec2 = 1;
            else
            prec2 = 2;
            if (prec2 < prec1) { 
               theStack.push(opTop);
               break;
            }
            else
            output = output + opTop;
         }
      }
      theStack.push(opThis);
   }
   public void gotParen(char ch){ 
      while (!theStack.isEmpty()) {
         char chx = theStack.pop();
         if (chx == '(') 
         break; 
         else
         output = output + chx; 
      }
   }
   public static void main(String[] args) 
   throws IOException {
      String input = "1+2*4/5-7+3/6";
      String output;
      DataStru theTrans = new DataStru(input);
      output = theTrans.doTrans(); 
      System.out.println("Postfix is " + output + '\n');
   }
   class Stack {
      private int maxSize;
      private char[] stackArray;
      private int top;
      public Stack(int max) {
         maxSize = max;
         stackArray = new char[maxSize];
         top = -1;
      }
      public void push(char j) {
         stackArray[++top] = j;
      }
      public char pop() {
         return stackArray[top--];
      }
      public char peek() {
         return stackArray[top];
      }
      public boolean isEmpty() {
         return (top == -1);
     }
   }
}*/


//在链表的开头和结尾添加元素
//使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		System.out.println(list1);
		list1.addFirst("0");
		list1.addLast("6");
		System.out.println(list1);
	}
}*/

//获取链表的第一个和最后一个元素
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("100");
		list1.add("200");
		list1.add("300");
		list1.add("400");
		list1.add("500");
		System.out.println("链表的第一个元素是："+list1.getFirst());
		System.out.println("链表的最后一个元素是："+list1.getLast());		
	}
}
*/

//删除链表中的元素
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		list1.add("6");
	    System.out.println(list1);
	    list1.subList(2, 4).clear(); //删除下标为2、3的元素，不包括4
	    System.out.println(list1);
	}
}
*/

//获取链表的元素
/*
import java.util.*;

public class DataStru{
	private LinkedList list = new LinkedList();
	public void push(Object v) {
		list.addFirst(v);
	}
	public Object top() {
		return list.getFirst();
	}
	public Object pop() {
		return list.removeFirst();
	}
	public static void main(String[] args) {
		DataStru stack = new DataStru();
		for(int i=30;i<40;i++) 
			stack.push(new Integer(i));
		System.out.println("顶部元素是："+stack.top());
		System.out.println("pop出一个元素："+stack.pop());
		System.out.println("再pop一个："+stack.pop());
	}
}
*/
//获取向量元素的索引值
//使用 Collections 类的 sort() 方法对向量进行排序并使用 binarySearch() 方法来获取向量元素的索引值
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("g");
		v.add("e");
		v.add("x");
		v.add("i");
		v.add("j");
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "i");
		System.out.println("元素索引值为："+index);
	}
}
*/

//栈的实现
//如何通过创建用于插入元素的自定义函数 push() 方法和用于弹出元素的 pop() 方法来实现栈

/*public class DataStru{
	private int maxSize;
	private long[] stackArray;
	private int top;
	public DataStru(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	public void push(long j) {
		stackArray[++top] = j;
	}
	public long pop() {
		return stackArray[top--];
	}
	public long peek() {
		return stackArray[top];
	} 
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	public static void main(String[] args) {
		DataStru theStack = new DataStru(10);
		theStack.push(1);
		theStack.push(2);
		theStack.push(3);
		theStack.push(4);
		theStack.push(5);
		//只要是!=-1，就继续循环
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
*/

//链表元素查找
/*import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("2");
		System.out.println("元素2第一次出现的位置："+list.indexOf("2"));
		System.out.println("元素2最后一次出现的位置："+list.lastIndexOf("2"));
	}
}*/

//压栈出栈的方法实现字符串反转
//使用用户自定义的方法 StringReverserThroughStack() 来实现字符串反转
/*
import java.util.*;

public class DataStru{
	private String input;
	private String output;
	public DataStru(String in) {
		
		input = in;
	}
	//压栈
	public String doRev() {
		int stackSize = input.length();
		Stack theStack = new Stack(stackSize);
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		//出栈
		output = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			output = output + ch;
		}
		//返回结果
		return output;
	}
	public static void main(String[] args) {
		String input = "Capitalizing experiences";
		String output;
		DataStru theReverser = new DataStru(input);
		output = theReverser.doRev();
		System.out.println("反转前："+input);
		System.out.println("反转后："+output);
	}
	class Stack{
		private int maxSize;
	    private char[] stackArray;
	    private int top;
	    public Stack(int max) {
	        maxSize = max;
	        stackArray = new char[maxSize];
	        top = -1;
	     }
	    public void push(char j) {
	        stackArray[++top] = j;
	     }
	    public char pop() {
	        return stackArray[top--];
	     }
	    public char peek() {
	        return stackArray[top];
	      }
	    public boolean isEmpty() {
	        return (top == -1);
	    }
	}
}
*/


//队列（Queue）用法
//队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作
//LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//添加元素
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		for(String q : queue) {
			System.out.println(q);
		}
		System.out.println("#########");
		//返回第一个元素，并在队列里删除
		System.out.println("poll="+queue.poll());
		for(String q : queue) {
			System.out.println(q);
		}
		System.out.println("=========");
		//返回第一个元素
		System.out.println("element="+queue.element());
		for(String q : queue) {
			System.out.println(q);
		}
		System.out.println("********");
		System.out.println("peek="+queue.peek());
		for(String q : queue) {
			System.out.println(q);
		}
	}
}
*/

//获取向量的最大元素
//使用 Vector 类的 v.add() 方法及 Collection 类的 Collections.max() 来获取向量的最大元素

/*import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Double("3.4324"));
		v.add(new Double("3.3532"));
		v.add(new Double("3.342"));
		v.add(new Double("3.349"));
		v.add(new Double("2.3"));
		Object obj = Collections.max(v);
		System.out.println("最大元素是："+obj);
	}
}
*/

//链表修改
//使用 listname.add() 和 listname.set() 方法来修改链接中的元素
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("java");
		list.add("a");
		list.add("v");
		list.add("a");
		list.add("1");
		list.add("2");
		System.out.println(list);
		list.set(0, "python");
		System.out.println(list);
	}
}
*/

//旋转向量
//使用 swap() 函数来旋转向量
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		Vector<String> v = new Vector();
		v.add("python");
		v.add("2");
		v.add("java");
		v.add("4");
		v.add("5");
		System.out.println("旋转前："+v);
		Collections.swap(v, 0, 4);
		System.out.println("旋转后："+v);
	}
}*/





