package com.ideal.filter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
* @author JJB
* @version 创建时间：2019年2月20日 下午5:19:03
* 
*/
public class DifferentDays {
	//求天数
	 public static int differentDays(Date date1,Date date2)
	    {
	        Calendar cal1 = Calendar.getInstance();
	        cal1.setTime(date1);
	        
	        Calendar cal2 = Calendar.getInstance();
	        cal2.setTime(date2);
	       int day1= cal1.get(Calendar.DAY_OF_YEAR);
	        int day2 = cal2.get(Calendar.DAY_OF_YEAR);
	        
	        int year1 = cal1.get(Calendar.YEAR);
	        int year2 = cal2.get(Calendar.YEAR);
	        if(year1 != year2)   //同一年
	        {
	            int timeDistance = 0 ;
	            for(int i = year1 ; i < year2 ; i ++)
	            {
	                if(i%4==0 && i%100!=0 || i%400==0)    //闰年            
	                {
	                    timeDistance += 366;
	                }
	                else    //不是闰年
	                {
	                    timeDistance += 365;
	                }
	            }
	            
	            return timeDistance + (day2-day1) ;
	        }
	        else    //不同年
	        {
	            return day2-day1;
	        }
	    }
	 
	 
	 public static String plusDay(int num,String newDate){
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 Date currdate = new Date();
		 Date date = new Date();
		try {
			currdate = format.parse(newDate);
			date = addDate(currdate,num);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String enddate = format.format(date);
		 return enddate;
		 }
	 public static Date addDate(Date date, long day) throws ParseException {
			long time = date.getTime(); // 得到指定日期的毫秒数
			day = day * 24 * 60 * 60 * 1000; // 要加上的天数转换成毫秒数
			time += day; // 相加得到新的毫秒数
			return new Date(time); // 将毫秒数转换成日期
		}
	 
	 
	 
}
