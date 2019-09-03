package CommonlyUsedClass;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar rightNow=Calendar.getInstance();
        System.out.println(rightNow.get(Calendar.YEAR)); 
        System.out.println(rightNow.get(Calendar.MONTH)+1);   //第一个月从0算起
        System.out.println(rightNow.get(Calendar.DATE)); 
        System.out.println(rightNow.get(Calendar.DAY_OF_MONTH)); 
        System.out.println(rightNow.get(Calendar.HOUR));         //12小时制
        System.out.println(rightNow.get(Calendar.HOUR_OF_DAY)); //24小时制
        System.out.println(rightNow.get(Calendar.MINUTE)); 
        System.out.println(rightNow.get(Calendar.SECOND)); 
        System.out.println(rightNow.get(Calendar.DAY_OF_WEEK)); 
        
	}
}
