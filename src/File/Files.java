//package File;


//�ļ�д��

/*import java.io.*;

public class Files {
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("gxj.txt"));
			out.write("���ںڰ����Ļ����������벻��Ŭ��ǰ�У�");
			out.close();
			System.out.println("�ļ�д��ɹ���");
		}catch(IOException e) {
		}
	}
}
*/

//�ļ���ȡ
//ʹ�� readLine() ��������ȡ�ļ�
/*
import java.io.*;
public class Files{
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("gxj.txt"));
			String str;
			while((str = in.readLine())!=null) {
				System.out.println(str);
			}
		}catch(IOException e) {}
	}
}
*/

//ɾ���ļ�
//����ʵ����ʾ��ʹ�� delete() �������ļ�ɾ����
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
		try {
			File file = new File("D:\\eclipse-workspace\\Runoob\\g.txt");
			if(file.delete()) {
				System.out.println(file.getName()+"�ļ��ѱ�ɾ����");
			}else {
				System.out.println("�ļ�ɾ��ʧ�ܣ�");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}*/

//���ļ����ݸ��Ƶ���һ���ļ�
//ʹ�� BufferedWriter ��� read �� write �������ļ����ݸ��Ƶ���һ���ļ�
/*
import java.io.*;

public class Files{
	public static void main(String[] args) throws Exception{
		//���ɲ�д���ļ�
		BufferedWriter out1 = new BufferedWriter(new FileWriter("srcFile.txt"));
		out1.write("���Զ�����ǿ��ķ�������������");
		out1.close();
		
		InputStream in = new FileInputStream(new File("srcFile.txt"));
		OutputStream out = new FileOutputStream(new File("destFile.txt"));
		
		byte[] buf = new byte[1024];
		int len;
		while((len = in.read(buf))>0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		
		BufferedReader in1 = new BufferedReader(new FileReader("destFile.txt"));
		String str;
		while((str=in1.readLine())!=null) {
			System.out.println(str);
		}
		in1.close();
	}
}*/

//���ļ���׷������
//ʹ�� filewriter �������ļ���׷������
/*
import java.io.*;

public class Files{
	public static void main(String[] args) throws Exception{
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("gxj.txt"));
			out.write("ѧ������ƣ��\n");
			out.close();
			//׷������
			out = new BufferedWriter(new FileWriter("gxj.txt",true));
			out.write("�Ҳ���һ���ˣ�һ�������������£�����������");
			out.close();
			//���ļ�
			BufferedReader in = new BufferedReader(new FileReader("gxj.txt"));
			String str;
			while((str = in.readLine())!=null) {
				System.out.println(str);
			}
			in.close();
		}catch(IOException e){
			System.out.println("exception occured:"+e);
		}
	} 
}*/

//������ʱ�ļ�
//ʹ�� File ��� createTempFile(String prefix, String suffix); 
//������Ĭ����ʱĿ¼��������ʱ�ļ������� prefix Ϊǰ׺��suffix Ϊ��׺��
/*
import java.io.*;

public class Files{
	public static void main(String[] args) throws Exception{
		File temp = File.createTempFile("tempFile", ".txt");
		System.out.println("�ļ�·����"+temp.getAbsolutePath());
		//�ڳ���������ֹʱ����ɾ���˳���·������ʾ���ļ���Ŀ¼
		temp.deleteOnExit();
		
		BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		out.write("This is the only thing I had to be interested in.");
		out.close();
		System.out.println("��ʱ�ļ��Ѵ���");
	}
}*/


//�޸��ļ�����޸ĵ�����
//ʹ��File ��� fileToChange.lastModified() �� fileToChange setLastModified() �������޸��ļ������޸����ڣ�
/*
import java.io.*;
import java.util.*;

public class Files{
	public static void main(String[] args) throws Exception {
		File file1 = new File("D:\\eclipse-workspace\\Runoob\\1.txt");
		file1.createNewFile();
		Date filetime = new Date(file1.lastModified());
		System.out.println(filetime.toString());
		
		System.out.println(file1.setLastModified(System.currentTimeMillis())); // ���boolean����
		
		filetime = new Date(file1.lastModified());
		System.out.println(filetime.toString());
	}
}
*/
/*
//��ȡ�ļ���С
//ʹ�� File ��� file.exists() �� file.length() ��������ȡ�ļ���С�����ֽڼ��㣨1KB=1024�ֽ� ��

import java.io.*;

public class Files{
	public static long getFileSize(String filename) {
		File file1 = new File(filename);
		if(!file1.exists()||!file1.isFile()) {
			System.out.println("�ļ�������");
			return -1;
		}
		return file1.length();
	}
	public static void main(String[] args) {
		//ע���ļ�·���ķ�б��
		long size = getFileSize("D:/eclipse-workspace/Runoob/gxj.txt");
		System.out.println("�ļ���СΪ��"+size);
	}
}
*/

//�ļ�������
//ʹ�� File ��� oldName.renameTo(newName) �������������ļ�
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
		File oldName = new File("D:/eclipse-workspace/Runoob/gxj.txt");
		File newName = new File("D:/eclipse-workspace/Runoob/liyang.txt");
		if(oldName.renameTo(newName)) {
			System.out.println("��������");
		}else {
			System.out.println("������ʧ�ܣ�");
		}
	}
}
*/

//�����ļ�ֻ��
/*import java.io.*;

public class Files{
	public static void main(String[] args) {
		File file = new File("D:/eclipse-workspace/Runoob/1.txt");
		//����ֻ��
//		System.out.println(file.setReadOnly());
		//�����Ƿ�ɹ�����
		System.out.println(file.canWrite());
		System.out.println(file.setWritable(true));
		System.out.println(file.canWrite());
	}
}
*/

//����ļ��Ƿ����
//ʹ�� File ��� file.exists() ����������ļ��Ƿ����
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
//		File file = new File("D:/eclipse-workspace/Runoob/1.txt");
		File file = new File("D:/eclipse-workspace/Runoob/2.txt");
		System.out.println(file.exists());
	}
}*/

//��ָ����Ŀ¼�д����ļ�
//ʹ�� File ��� file.createTempFile() ������ָ��Ŀ¼�д����ļ�

/*import java.io.*;

public class Files{
	public static void main(String[] args) throws Exception{
		File file = null;
		File dir = new File("D:/");
		file = File.createTempFile("20180409", ".txt", dir);
		System.out.println(file.getPath());
	}
}
*/

//��ȡ�ļ��޸�ʱ��
//ʹ�� File ��� file.lastModified() ��������ȡ�ļ������޸�ʱ��
/*
import java.io.*;
import java.util.*;

public class Files{
	public static void main(String[] args) {
		File file = new File("D:/insert.sql");
//		File file = new File("D:\\insert.sql");
		Long modifyTime = file.lastModified();
		Date date = new Date(modifyTime);
		System.out.println(date);
	}
}
*/

//�����ļ�
//ʹ�� File ��� File() ���캯���� file.createNewFile() ����������һ���µ��ļ�
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
		try {
			File file = new File("D:/myfile.txt");
			if(file.createNewFile())
				System.out.println("�ļ������ɹ���");
			else
				System.out.println("����ʧ�ܣ��ļ��Ѵ��ڣ�");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}*/

//�ļ�·���Ƚ�
//ʹ�� File ��� filename.compareTo (another filename) �������Ƚ������ļ�·���Ƿ���ͬһ��Ŀ¼�£�
/*
import java.io.File; 

public class Files{
	public static void main(String[] args) {
		File file1 = new File("D:/eclipse-workspace/Runoob/1.txt");
		File file2 = new File("D:/eclipse-workspace/Runoob/liyang.txt");
		if(file1.compareTo(file2) != 0) {
			System.out.println("�ļ�·��һ�£�");
		}else {
			System.out.println("�ļ�·����һ�£�");
		}
	}
}*/














