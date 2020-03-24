package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//ADICIONAR UMA UNIDADE DE TEMPO
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		//OBTER UMA UNIDADE DE TEMPO
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); //Acrescenta 1, pois o calendario comeca com Zero (Janeiro = 0)
		
		System.out.println(d + " (added 4h)");	
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
