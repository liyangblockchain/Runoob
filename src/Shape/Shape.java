package Shape;

//��ӡ����
/*
public class Shape {
	public static void main(String[] args) {
		printDiamond(8);
	}
	public static void printDiamond(int size) {
		if(size%2 == 0) {
			size++;
		}
		for(int i=0;i<size/2+1;i++) {
			for(int j=size/2+1;j>i+1;j--) {
				System.out.print(" ");//������ϽǵĿհ�
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");//������ε��ϰ벿
			}
			System.out.println();
		}
		
		for(int i=size/2+1;i<size;i++) {
			for(int j=0;j<i-size/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*size-1-2*i;j++) {   //2*(8+1)-1-2*5
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}
*/

//99�˷���
/*public class Shape{
	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<i+1;j++) {
//				System.out.print("%d*%d=%2d",(j,i,j*i));
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}
*/

//��ӡ������
/*public class Shape{
	public static void main(String[] args) {
		printTriangle(15);
	}
	public static void printTriangle(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=size;j>=i;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
//			System.out.println();
			//3��ͼ��û���ڵ�һ�����������Ҫ�ڵ�һ�δ�ѭ����������:1<2;2<3;3<4;4<5
			for(int j=1;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}*/


//��ӡ������������
/*public class Shape{
	public static void main(String[] args) {
		printTriangle(5);
	}
	public static void printTriangle(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=size;j>=i;j--)
				System.out.print("*");
//			System.out.println();
			for(int j=size;j>i;j--)
				System.out.print("*");
			System.out.println();
		}
	}
}*/

//��ӡƽ���ı���
/*public class Shape{
	public static void main(String[] args) {
		printParallelogram(15);
	}
	public static void printParallelogram(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size-i;j++)
				System.out.print(" ");
			for(int j=1;j<=size;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
*/
//��ӡָ�����г��ȵ�
/*public class Shape{
	public static void main(String[] args) {
		printRectangle(15,5);
	}
	public static void printRectangle(int row,int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++)
				System.out.print("*");	
			System.out.println();
		}
	}
}
*/






