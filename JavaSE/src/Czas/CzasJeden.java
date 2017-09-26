package Czas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CzasJeden {

	public static void main(String[] aergs) {
		Instant t1 = Instant.now();
		Scanner ent = new Scanner(System.in);
		System.out.println("Wpisz swoje imiê");
		//ent.nextLine();
		ent.close();
		Instant t2 = Instant.now();
		
		Duration timeGap = Duration.between(t1, t2);
		
		System.out.println("Tyle czasu potrzebowa³eœ na wpisanie swojego imienia : " + timeGap.getSeconds());
	
		LocalTime lt = LocalTime.now();
		LocalTime l2 = LocalTime.of(13, 33);
		System.out.println(lt);
		boolean www = lt.isBefore(l2);
		System.out.println(www);
			if(lt.isAfter(l2)) {
				Duration sd = Duration.between(lt, l2);
				System.out.println("jest po godzinie 13:33 " + sd + "minut");
			} else {
				Duration sd = Duration.between(lt, l2);
				System.out.println(sd + " minut" + "jest przed godzina 13:33 ");
			}
			
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2019, 8, 23);
		
		Duration ldx = Duration.between(ld, ld2);
		System.out.println(ldx);
	}
}
