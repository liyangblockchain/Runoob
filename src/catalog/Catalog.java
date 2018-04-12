package catalog;


//�ݹ鴴��Ŀ¼
//ʹ�� File ��� mkdirs() ʵ�ֵݹ鴴��Ŀ¼
/*import java.io.File;

public class Catalog {
	public static void main(String[] args) {
		//���ַ�ʽ
//		String dirs = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
		String dirs = "D:/a1/b/c/d/e/f/g/h/i";
		File file = new File(dirs);
		boolean result = file.mkdirs();
		System.out.println("Status:"+result);
	}
}
*/

//ɾ��Ŀ¼
//ʹ�� File ��� ofdir.isDirectory(), dir.list() �� deleteDir() ������һ����ɾ���ļ���ɾ��Ŀ¼


//��������****************************
/*import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		//ɾ����ǰĿ¼�µ�testĿ¼
		deleteDir(new File("./test"));
	} 
	public static boolean deleteDir(File dir) {
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i=0;i<children.length;i++) {
				//�ݹ����deleteDir����
				boolean success = deleteDir(new File(dir,children[i]));
				if(!success) {
					return false;
				}
			}
		}
		//ɾ��Ŀ¼
		if(dir.delete()) {
			System.out.println("Ŀ¼�ѱ�ɾ����");
			return true;
		}else {
			System.out.println("Ŀ¼ɾ��ʧ�ܣ�");
			return false;
		}
	}
}
*/


//�ж�Ŀ¼�Ƿ�Ϊ��
//ʹ�� File ��� file.isDirectory() �� file.list() �������ж�Ŀ¼�Ƿ�Ϊ��
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("./test");
		if(file.isDirectory()) {
			if(file.list().length>0) {
				System.out.println("Ŀ¼��Ϊ�գ�");
			}else {
				System.out.println("Ŀ¼Ϊ�գ�");
			}
		}else {
			System.out.println("�ⲻ��һ��Ŀ¼��");
		}
	}
}
*/

//�ж��ļ��Ƿ�����
//ʹ�� File ��� file.isHidden() �������ж��ļ��Ƿ�����
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("D:/insert.sql");
		System.out.println(file.isHidden());
	}
}
*/

//6.��ָ��Ŀ¼�в����ļ�
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File dir = new File("./test");
		String[] children = dir.list();
		if(children == null) {
			System.out.println("Ŀ¼�����ڣ�");
		}else {
			System.out.println("�ļ�������:\n"+dir.getName());
			System.out.println("·���µ��ļ����ļ����У�");
			for(int i=0;i<children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}*/

//7.��ȡ�ļ����ϼ�Ŀ¼
//ʹ�� File ��� file.getParent() ��������ȡ�ļ����ϼ�Ŀ¼
//��ƭ�ˣ������أ�
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("./test");
		String parentDir = file.getParent();
		System.out.println("�ϼ�Ŀ¼Ϊ��"+parentDir);
	}
}
*/


//8.��ȡĿ¼����޸�ʱ��
//ʹ�� File ��� file.lastModified() ��������ȡĿ¼������޸�ʱ��
/*import java.io.*;
import java.util.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("./test");
		Date lastModifyTime = new Date(file.lastModified());
		System.out.println("����޸�ʱ��Ϊ��"+lastModifyTime);
	}
}
*/


//9.��ӡĿ¼�ṹ
//file.getName() �� file.listFiles() ��������ӡĿ¼�ṹ
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		showDirs(1,new File("D:\\360"));
	}
	public static void showDirs(int indent, File file){
		for(int i=0;i<indent;i++) 
			System.out.print("-");
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(int i=0;i<files.length;i++)
			//�ݹ�
				showDirs(indent+2,files[i]);
		}
	}
}
*/

//10.����ָ��Ŀ¼�µ�����Ŀ¼
//ʹ�� File ��� list ����������ָ��Ŀ¼�µ�����Ŀ¼
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File dir = new File("D:/360");
		File[] files = dir.listFiles();
		
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};  //���˷ֺţ�
		
		files = dir.listFiles(fileFilter);
		System.out.println("ָ��Ŀ¼�µ�Ŀ¼����Ϊ��"+files.length);
		if(files.length==0) {
			System.out.println("Ŀ¼�����ڻ�������һ��Ŀ¼��");
		}else {
			for(int i=0;i<files.length;i++) {
				File filename = files[i];
				System.out.println(filename.toString());
			}
		}
	}
}
*/

//11.���ָ��Ŀ¼�µ������ļ�
//ʹ�� File ��� list ���������ָ��Ŀ¼�µ�����Ŀ¼���ļ�
/*
public class Catalog{
	public static void main(String[] args) {
		File dir = new File("D:/360");
		String[] children = dir.list();
		if(children == null) {
			System.out.println("Ŀ¼�����ڻ�������һ��Ŀ¼��");
		}else {
			for(int i=0;i<children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
*/


//12.��ָ��Ŀ¼�в���ָ���ļ�
//�� d ���в�������ĸ 'c' ��ͷ�������ļ�
//����������
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File dir = new File("D:");
		
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith("m");
			}
		};
		
		String[] children = dir.list(filter);
		if(children == null) {
			System.out.println("Ŀ¼�����ڻ�������һ��Ŀ¼��");
		}else {
			for(int i=0;i<children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
} 
*/

//13.�鿴ϵͳ��Ŀ¼
//ʹ�� File ��� listRoots() ���������ϵͳ���и�Ŀ¼
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		System.out.println("ϵͳ���и�Ŀ¼��");
		for(int i=0;i<roots.length;i++) {
			System.out.println(roots[i].toString());
		}
	}
}
*/

//14.�鿴��ǰ����Ŀ¼
//ʹ�� System �� getProperty() ��������ȡ��ǰ�Ĺ���Ŀ¼
/*
public class Catalog{
	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		System.out.println("��ǰ�Ĺ���Ŀ¼Ϊ��"+currDir);
	}
}*/

//15.����Ŀ¼
//ʹ�� File ��� dir.isDirectory() �� dir.list() ����������Ŀ¼
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		System.out.println("����Ŀ¼��");
		File dir = new File("/360");
		visitAllDirsAndFiles(dir);
	}
	public static void visitAllDirsAndFiles(File dir) {
		System.out.println(dir);
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i=0;i<children.length;i++) {
				//�ݹ�
				visitAllDirsAndFiles(new File(dir,children[i]));
			}
		}
	}
}*/


















