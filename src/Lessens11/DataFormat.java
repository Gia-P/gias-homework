package Lessens11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataFormat {
    public static String convertDate(String originalDate){
        Date date = new Date(originalDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM d yyyy");
        String dateDay = dateFormat.format(date);
        SimpleDateFormat dateFormatTime = new SimpleDateFormat("EEE, MMM d yyyy hh:mm:ss a");
        String dateTime = dateFormatTime.format(date);

        return dateDay + " / " + dateTime;
    }
    public static String calendarDate(int inYear, int inMont, int inDay, int inHour, int inMinute, int inSecond){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d yyyy hh:mm:ss a");
        Calendar calendar = new GregorianCalendar(inYear, inMont, inDay,inHour,inMinute,inSecond);
        String cal = sdf.format(calendar.getTime());
        return cal;
    }

    public static void main(String[] args) {
        String inDate = "Jun 7 2013 12:10:56";
        System.out.println(calendarDate(2013,5,7,12,10,56));
        System.out.println(convertDate(inDate));

    }
}
