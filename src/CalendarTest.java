import java.nio.file.attribute.AclEntry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        System.out.println("显示完整日期时间：");
        DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fdate.format(new Date());
        System.out.println(str);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        System.out.println("year:" + calendar.get(Calendar.YEAR));
        System.out.println("month" + calendar.get(Calendar.MONTH));
        System.out.println("day" + calendar.get(Calendar.DAY_OF_MONTH));


    }
}
