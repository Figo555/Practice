package Czas;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Stoper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("W celu rozpoczêcia pomiaru wciœnij ENTER");
		sc.nextLine();
		LocalTime t1 = LocalTime.now();
		System.out.println("W celu zatrzymania pomiaru naciœnij ENTER");
		sc.nextLine();
		LocalTime t2 = LocalTime.now();
		
		sc.close();
		Duration pomiedzy = Duration.between(t1, t2);
		System.out.print(pomiedzy);
		
	}

}
