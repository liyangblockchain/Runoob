package Time;

//��ʽ��ʱ��
//���ʹ�� SimpleDateFormat ��� format(date) ��������ʽ��ʱ��
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

//��ȡ��ǰ��ʱ��
//���ʹ�� Date �༰ SimpleDateFormat ��� format(date) �����������ǰʱ�䣺

/*import java.text.*;
import java.util.*;

public class Time{
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
		Date date = new Date();
		System.out.println("����ʱ�䣺"+sdf.format(date));
	}
}*/

//��ȡ��ݡ��·�
//����ʵ����ʾ�����ʹ�� Calendar ���������ݡ��·ݵȣ�
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
		
//		System.out.println("��ǰ���ڣ�"+cal.getTime());
		System.out.println("��ǰ���ڣ�"+cal.getTime());
		System.out.println("�շݣ�"+day);
		System.out.println("�·ݣ�"+month);
		System.out.println("��ݣ�"+year);
		System.out.println("һ���еĵڼ��죺"+dow);
		System.out.println("һ���еĵڼ��죺"+dom);
		System.out.println("һ���еĵڼ��죺"+doy);
	}
}*/

//ʱ���ת����ʱ��
//����ʵ����ʾ�����ʹ�� SimpleDateFormat ��� format() ������ʱ���ת����ʱ�䣺
/*Long.parseLong()�ǽ�һ���ַ���ת�������ֵġ�
�����ַ���String str="12345";
��������ѵõ�str��ʾ������12345
��ô�Ϳ�����parseLong(String str)����ת��������ֵ����long���͵�����12345*/

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















