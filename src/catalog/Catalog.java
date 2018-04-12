package catalog;


//递归创建目录
//使用 File 类的 mkdirs() 实现递归创建目录
/*import java.io.File;

public class Catalog {
	public static void main(String[] args) {
		//两种方式
//		String dirs = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
		String dirs = "D:/a1/b/c/d/e/f/g/h/i";
		File file = new File(dirs);
		boolean result = file.mkdirs();
		System.out.println("Status:"+result);
	}
}
*/

//删除目录
//使用 File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录


//谨慎操作****************************
/*import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		//删除当前目录下的test目录
		deleteDir(new File("./test"));
	} 
	public static boolean deleteDir(File dir) {
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i=0;i<children.length;i++) {
				//递归调用deleteDir方法
				boolean success = deleteDir(new File(dir,children[i]));
				if(!success) {
					return false;
				}
			}
		}
		//删除目录
		if(dir.delete()) {
			System.out.println("目录已被删除！");
			return true;
		}else {
			System.out.println("目录删除失败！");
			return false;
		}
	}
}
*/


//判断目录是否为空
//使用 File 类的 file.isDirectory() 和 file.list() 方法来判断目录是否为空
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("./test");
		if(file.isDirectory()) {
			if(file.list().length>0) {
				System.out.println("目录不为空！");
			}else {
				System.out.println("目录为空！");
			}
		}else {
			System.out.println("这不是一个目录！");
		}
	}
}
*/

//判断文件是否隐藏
//使用 File 类的 file.isHidden() 方法来判断文件是否隐藏
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("D:/insert.sql");
		System.out.println(file.isHidden());
	}
}
*/

//6.在指定目录中查找文件
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File dir = new File("./test");
		String[] children = dir.list();
		if(children == null) {
			System.out.println("目录不存在！");
		}else {
			System.out.println("文件夹名称:\n"+dir.getName());
			System.out.println("路径下的文件或文件夹有：");
			for(int i=0;i<children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}*/

//7.获取文件的上级目录
//使用 File 类的 file.getParent() 方法来获取文件的上级目录
//被骗了，逗我呢！
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("./test");
		String parentDir = file.getParent();
		System.out.println("上级目录为："+parentDir);
	}
}
*/


//8.获取目录最后修改时间
//使用 File 类的 file.lastModified() 方法来获取目录的最后修改时间
/*import java.io.*;
import java.util.*;

public class Catalog{
	public static void main(String[] args) {
		File file = new File("./test");
		Date lastModifyTime = new Date(file.lastModified());
		System.out.println("最后修改时间为："+lastModifyTime);
	}
}
*/


//9.打印目录结构
//file.getName() 和 file.listFiles() 方法来打印目录结构
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
			//递归
				showDirs(indent+2,files[i]);
		}
	}
}
*/

//10.遍历指定目录下的所有目录
//使用 File 类的 list 方法来遍历指定目录下的所有目录
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
		};  //加了分号，
		
		files = dir.listFiles(fileFilter);
		System.out.println("指定目录下的目录个数为："+files.length);
		if(files.length==0) {
			System.out.println("目录不存在或它不是一个目录！");
		}else {
			for(int i=0;i<files.length;i++) {
				File filename = files[i];
				System.out.println(filename.toString());
			}
		}
	}
}
*/

//11.输出指定目录下的所有文件
//使用 File 类的 list 方法来输出指定目录下的所有目录或文件
/*
public class Catalog{
	public static void main(String[] args) {
		File dir = new File("D:/360");
		String[] children = dir.list();
		if(children == null) {
			System.out.println("目录不存在或它不是一个目录！");
		}else {
			for(int i=0;i<children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
*/


//12.在指定目录中查找指定文件
//在 d 盘中查找以字母 'c' 开头的所有文件
//代码有问题
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
			System.out.println("目录不存在或它不是一个目录！");
		}else {
			for(int i=0;i<children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
} 
*/

//13.查看系统根目录
//使用 File 类的 listRoots() 方法来输出系统所有根目录
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		System.out.println("系统所有根目录：");
		for(int i=0;i<roots.length;i++) {
			System.out.println(roots[i].toString());
		}
	}
}
*/

//14.查看当前工作目录
//使用 System 的 getProperty() 方法来获取当前的工作目录
/*
public class Catalog{
	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		System.out.println("当前的工作目录为："+currDir);
	}
}*/

//15.遍历目录
//使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录
/*
import java.io.*;

public class Catalog{
	public static void main(String[] args) {
		System.out.println("遍历目录：");
		File dir = new File("/360");
		visitAllDirsAndFiles(dir);
	}
	public static void visitAllDirsAndFiles(File dir) {
		System.out.println(dir);
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i=0;i<children.length;i++) {
				//递归
				visitAllDirsAndFiles(new File(dir,children[i]));
			}
		}
	}
}*/


















