package Time;

//格式化时间
//如何使用 SimpleDateFormat 类的 format(date) 方法来格式化时间
/*import java.text.*;
import java.util.*;

public class Time {
	public static void main(String[] args) {
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
	}
}
*/

//获取当前的时间
//如何使用 Date 类及 SimpleDateFormat 类的 format(date) 方法来输出当前时间：

/*import java.text.*;
import java.util.*;

public class Time{
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
		Date date = new Date();
		System.out.println("现在时间："+sdf.format(date));
	}
}*/

//获取年份、月份
//以下实例演示了如何使用 Calendar 类来输出年份、月份等：
/*import java.util.*;

public class Time{
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		
//		System.out.println("当前日期："+cal.getTime());
		System.out.println("当前日期："+cal.getTime());
		System.out.println("日份："+day);
		System.out.println("月份："+month);
		System.out.println("年份："+year);
		System.out.println("一周中的第几天："+dow);
		System.out.println("一月中的第几天："+dom);
		System.out.println("一年中的第几天："+doy);
	}
}*/

//时间戳转换成时间
//以下实例演示了如何使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间：
/*Long.parseLong()是将一个字符串转换成数字的。
比如字符串String str="12345";
现在你想把得到str表示的数字12345
那么就可以用parseLong(String str)方法转换，返回值就是long类型的数字12345*/

/*import java.text.*;
import java.util.*;

public class Time{
	public static void main(String[] args) {
		Long timeStamp = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
		System.out.println(sd);
	}
}*/















