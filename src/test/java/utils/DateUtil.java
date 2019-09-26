package utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateUtil {

    public String tomorrow() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 1);
        return new SimpleDateFormat("ddd/dd/MMM").format(c.getTime());
    }

    public String dayAfterTomorrow() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 2);
        return new SimpleDateFormat("dd/MM/yyyy").format(c.getTime());
    }
}
