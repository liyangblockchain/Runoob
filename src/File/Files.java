//package File;


//文件写入

/*import java.io.*;

public class Files {
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("gxj.txt"));
			out.write("身在黑暗，心怀光明，梦想不灭，努力前行！");
			out.close();
			System.out.println("文件写入成功！");
		}catch(IOException e) {
		}
	}
}
*/

//文件读取
//使用 readLine() 方法来读取文件
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

//删除文件
//以下实例演示了使用 delete() 方法将文件删除：
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
		try {
			File file = new File("D:\\eclipse-workspace\\Runoob\\g.txt");
			if(file.delete()) {
				System.out.println(file.getName()+"文件已被删除！");
			}else {
				System.out.println("文件删除失败！");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}*/

//将文件内容复制到另一个文件
//使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件
/*
import java.io.*;

public class Files{
	public static void main(String[] args) throws Exception{
		//生成并写入文件
		BufferedWriter out1 = new BufferedWriter(new FileWriter("srcFile.txt"));
		out1.write("语言对人有强大的反向塑造能力！");
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

//向文件中追加数据
//使用 filewriter 方法向文件中追加数据
/*
import java.io.*;

public class Files{
	public static void main(String[] args) throws Exception{
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("gxj.txt"));
			out.write("学会忘记疲劳\n");
			out.close();
			//追加数据
			out = new BufferedWriter(new FileWriter("gxj.txt",true));
			out.write("我不是一般人！一般人做不到的事，我能做到！");
			out.close();
			//读文件
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

//创建临时文件
//使用 File 类的 createTempFile(String prefix, String suffix); 
//方法在默认临时目录来创建临时文件，参数 prefix 为前缀，suffix 为后缀：
/*
import java.io.*;

public class Files{
	public static void main(String[] args) throws Exception{
		File temp = File.createTempFile("tempFile", ".txt");
		System.out.println("文件路径："+temp.getAbsolutePath());
		//在程序运行终止时，就删除此抽象路径名表示的文件或目录
		temp.deleteOnExit();
		
		BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		out.write("This is the only thing I had to be interested in.");
		out.close();
		System.out.println("临时文件已创建");
	}
}*/


//修改文件最后修改的日期
//使用File 类的 fileToChange.lastModified() 和 fileToChange setLastModified() 方法来修改文件最后的修改日期：
/*
import java.io.*;
import java.util.*;

public class Files{
	public static void main(String[] args) throws Exception {
		File file1 = new File("D:\\eclipse-workspace\\Runoob\\1.txt");
		file1.createNewFile();
		Date filetime = new Date(file1.lastModified());
		System.out.println(filetime.toString());
		
		System.out.println(file1.setLastModified(System.currentTimeMillis())); // 输出boolean类型
		
		filetime = new Date(file1.lastModified());
		System.out.println(filetime.toString());
	}
}
*/
/*
//获取文件大小
//使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）

import java.io.*;

public class Files{
	public static long getFileSize(String filename) {
		File file1 = new File(filename);
		if(!file1.exists()||!file1.isFile()) {
			System.out.println("文件不存在");
			return -1;
		}
		return file1.length();
	}
	public static void main(String[] args) {
		//注意文件路径的反斜杠
		long size = getFileSize("D:/eclipse-workspace/Runoob/gxj.txt");
		System.out.println("文件大小为："+size);
	}
}
*/

//文件重命名
//使用 File 类的 oldName.renameTo(newName) 方法来重命名文件
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
		File oldName = new File("D:/eclipse-workspace/Runoob/gxj.txt");
		File newName = new File("D:/eclipse-workspace/Runoob/liyang.txt");
		if(oldName.renameTo(newName)) {
			System.out.println("已重命名");
		}else {
			System.out.println("重命名失败！");
		}
	}
}
*/

//设置文件只读
/*import java.io.*;

public class Files{
	public static void main(String[] args) {
		File file = new File("D:/eclipse-workspace/Runoob/1.txt");
		//设置只读
//		System.out.println(file.setReadOnly());
		//测试是否成功设置
		System.out.println(file.canWrite());
		System.out.println(file.setWritable(true));
		System.out.println(file.canWrite());
	}
}
*/

//检测文件是否存在
//使用 File 类的 file.exists() 方法来检测文件是否存在
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
//		File file = new File("D:/eclipse-workspace/Runoob/1.txt");
		File file = new File("D:/eclipse-workspace/Runoob/2.txt");
		System.out.println(file.exists());
	}
}*/

//在指定的目录中创建文件
//使用 File 类的 file.createTempFile() 方法在指定目录中创建文件

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

//获取文件修改时间
//使用 File 类的 file.lastModified() 方法来获取文件最后的修改时间
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

//创建文件
//使用 File 类的 File() 构造函数和 file.createNewFile() 方法来创建一个新的文件
/*
import java.io.*;

public class Files{
	public static void main(String[] args) {
		try {
			File file = new File("D:/myfile.txt");
			if(file.createNewFile())
				System.out.println("文件创建成功！");
			else
				System.out.println("创建失败！文件已存在！");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}*/

//文件路径比较
//使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下：
/*
import java.io.File; 

public class Files{
	public static void main(String[] args) {
		File file1 = new File("D:/eclipse-workspace/Runoob/1.txt");
		File file2 = new File("D:/eclipse-workspace/Runoob/liyang.txt");
		if(file1.compareTo(file2) != 0) {
			System.out.println("文件路径一致！");
		}else {
			System.out.println("文件路径不一致！");
		}
	}
}*/














