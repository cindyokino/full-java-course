// Aula extra, fora do curso, pacote java.time
package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
	
	public static void main(String[] args) {
		
		//LocalDate - representa uma data: 06/08/1990
		System.out.println("LocalDate: ");
		LocalDate ldNow = LocalDate.now();
		System.out.println("ldNow: " + ldNow);		
		LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
		System.out.println("of: " + ld);		
		LocalDate ld2 = ld.plusWeeks(2).plusDays(1).plusMonths(1);
		System.out.println("plus: " + ld2);
		
		System.out.println("-----------------------------------");
		//LocalTime - representa uma hora: 11:40:00
		System.out.println("LocalTime: ");
	    LocalTime ltNow = LocalTime.now();	    
	    System.out.println("ltNow: " + ltNow);
	    LocalTime lt = LocalTime.of(11, 10, 01, 100000);
	    System.out.println("of: " + lt);
	    
	    System.out.println("-----------------------------------");
		//LocalDateTime - representa uma data+hora: 106/08/1990 11:40:00
		System.out.println("LocalDateTime: ");
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println("ldtNow: " + ldtNow);		
		LocalDateTime ldt = LocalDateTime.of(ld, lt); // ld e lt criados acima
		System.out.println("of: " + ldt);
		
		System.out.println("-----------------------------------");
		//Instant - representa um instante/momento na linha do tempo 
		//(milissegundos a partir de 01/01/1970 00:00:00)
		//06/08/1990 11:40:00 GMT/UTC
		System.out.println("Instant: ");
		Instant iNow = Instant.now();
		System.out.println("iNow: "+ iNow);
		Instant i = Instant.ofEpochMilli(500000000000L);
		System.out.println("of: " + i);
		Instant plus = i.plus(1, ChronoUnit.DAYS);
//		Instant plus = i.plus(1, ChronoUnit.MONTHS); // mes e ano NAO funcionam pois nao tem um numero certo de horas!
		System.out.println("plus: " + plus);
		
		System.out.println("-----------------------------------");
		 // ZonedDateTime - LocalDateTime + TimeZone (fuso horário)
	    // 06/08/1990 11:40:00 GMT-3 (America/Sao_Paulo)
		System.out.println("ZonedDateTime: ");
		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println("zdtNow " + zdtNow);
		ZoneId zoneId = ZoneId.of("America/New_York");
		ZonedDateTime zdt = ZonedDateTime.of(ld, lt, zoneId);
		System.out.println("zdt: " + zdt);		
	}
}
