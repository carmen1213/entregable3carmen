package entregable3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class fecha {
	public static void main (String [] args) {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(hourdateFormat.format(date));
	}

}
