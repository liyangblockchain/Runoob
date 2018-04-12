package dataStructure;


//�����������
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

//���ö�ջ����׺���ʽת���ɺ�׺���ʽ

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


//������Ŀ�ͷ�ͽ�β���Ԫ��
//ʹ�� LinkedList ��� addFirst() �� addLast() ����������Ŀ�ͷ�ͽ�β���Ԫ��
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

//��ȡ����ĵ�һ�������һ��Ԫ��
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
		System.out.println("����ĵ�һ��Ԫ���ǣ�"+list1.getFirst());
		System.out.println("��������һ��Ԫ���ǣ�"+list1.getLast());		
	}
}
*/

//ɾ�������е�Ԫ��
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
	    list1.subList(2, 4).clear(); //ɾ���±�Ϊ2��3��Ԫ�أ�������4
	    System.out.println(list1);
	}
}
*/

//��ȡ�����Ԫ��
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
		System.out.println("����Ԫ���ǣ�"+stack.top());
		System.out.println("pop��һ��Ԫ�أ�"+stack.pop());
		System.out.println("��popһ����"+stack.pop());
	}
}
*/
//��ȡ����Ԫ�ص�����ֵ
//ʹ�� Collections ��� sort() ������������������ʹ�� binarySearch() ��������ȡ����Ԫ�ص�����ֵ
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
		System.out.println("Ԫ������ֵΪ��"+index);
	}
}
*/

//ջ��ʵ��
//���ͨ���������ڲ���Ԫ�ص��Զ��庯�� push() ���������ڵ���Ԫ�ص� pop() ������ʵ��ջ

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
		//ֻҪ��!=-1���ͼ���ѭ��
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
*/

//����Ԫ�ز���
/*import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("2");
		System.out.println("Ԫ��2��һ�γ��ֵ�λ�ã�"+list.indexOf("2"));
		System.out.println("Ԫ��2���һ�γ��ֵ�λ�ã�"+list.lastIndexOf("2"));
	}
}*/

//ѹջ��ջ�ķ���ʵ���ַ�����ת
//ʹ���û��Զ���ķ��� StringReverserThroughStack() ��ʵ���ַ�����ת
/*
import java.util.*;

public class DataStru{
	private String input;
	private String output;
	public DataStru(String in) {
		
		input = in;
	}
	//ѹջ
	public String doRev() {
		int stackSize = input.length();
		Stack theStack = new Stack(stackSize);
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		//��ջ
		output = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			output = output + ch;
		}
		//���ؽ��
		return output;
	}
	public static void main(String[] args) {
		String input = "Capitalizing experiences";
		String output;
		DataStru theReverser = new DataStru(input);
		output = theReverser.doRev();
		System.out.println("��תǰ��"+input);
		System.out.println("��ת��"+output);
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


//���У�Queue���÷�
//������һ����������Ա���ֻ�����ڱ��ǰ�˽���ɾ�����������ڱ�ĺ�˽��в������
//LinkedList��ʵ����Queue�ӿڣ�������ǿ��԰�LinkedList����Queue����
/*
import java.util.*;

public class DataStru{
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//���Ԫ��
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		for(String q : queue) {
			System.out.println(q);
		}
		System.out.println("#########");
		//���ص�һ��Ԫ�أ����ڶ�����ɾ��
		System.out.println("poll="+queue.poll());
		for(String q : queue) {
			System.out.println(q);
		}
		System.out.println("=========");
		//���ص�һ��Ԫ��
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

//��ȡ���������Ԫ��
//ʹ�� Vector ��� v.add() ������ Collection ��� Collections.max() ����ȡ���������Ԫ��

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
		System.out.println("���Ԫ���ǣ�"+obj);
	}
}
*/

//�����޸�
//ʹ�� listname.add() �� listname.set() �������޸������е�Ԫ��
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

//��ת����
//ʹ�� swap() ��������ת����
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
		System.out.println("��תǰ��"+v);
		Collections.swap(v, 0, 4);
		System.out.println("��ת��"+v);
	}
}*/





