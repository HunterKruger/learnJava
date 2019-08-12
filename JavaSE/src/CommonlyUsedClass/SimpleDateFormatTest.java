package CommonlyUsedClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static String formatDate(Date date,String format){
		//将实时转为相应格式
		String result="";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date!=null){
			result=sdf.format(date);
		}
		return result;	
	}
	
	//重载
	public static Date formatDate(String dataStr,String format) throws ParseException{
		//将日期字符串转换成日期格式
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(dataStr);
		 
	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        Date date=new Date();
        System.out.println(date);//输出当前时间
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));//将date输出为年月日格式

        SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf2.format(date));//将date输出为小时分钟秒格式
        
        System.out.println(formatDate(date,"yyyy-MM-dd HH:mm:ss"));
        
        String dataStr="1996-06-23 20:26:49";
        Date date2=formatDate(dataStr,"yyyy-MM-dd HH:mm:ss");
        System.out.println(formatDate(date2, "yyyy-MM-dd HH:mm:ss"));
              
	} 

}
