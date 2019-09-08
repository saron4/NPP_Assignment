package L3Assignment.problem2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Util {
	public static String dateAsString(LocalDate hireDate) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(hireDate);
	}
	
}


