package KolejkiQueue;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {
		TaskManager tm = new TaskManager();
		try ( Scanner sc = new Scanner(System.in)) {
			tm.mainLoop(sc);
		}
	}
	
	private void printOptions() {
		for ( Option o : Option.values()) {
			System.out.println(o);
		}
	}

	private void mainLoop(Scanner sc) {
		Queue<Task> taskQueue = new PriorityQueue<>();
		
		Option next = null;
		while (next == null || next != Option.EXIT) {
			printOptions();
			next = Option.createFromInt(sc.nextInt());
			sc.nextLine();
			switch (next) {
			case ADD:
				taskQueue.offer(readAndCreateTask(sc));
				break;
			case TAKE:
				takeTask(taskQueue.poll());
				break;
			case EXIT:
				System.out.println("Papa Oaoa!");
			}
		}
	}

	
	private void takeTask(Task task) {
		System.out.println("Zadanie do wykonania: ");
		System.out.println(task);
	}

	private Task readAndCreateTask(Scanner sc) {
		System.out.println("Podaj nazwe zadania: ");
		String name = sc.nextLine();
		System.out.println("Podaj opis zadania: ");
		String desc = sc.nextLine();
		System.out.println("Podaj prioritet (LOW, MODERATE, HIGH");
		Priority priority = Priority.valueOf(sc.nextLine().toUpperCase());
		return new Task(name, desc, priority);
	}


	private enum Option {
		ADD(0, "Dodaj zadanie"), TAKE(1, "Zr�b kolejne zadanie"), EXIT(2, "Wyjd�");
		
		int option;
		String desc;
		
		Option(int opt, String desc) {
			this.option = opt;
			this.desc = desc;
		}
		
		static Option createFromInt(int option) {
			return Option.values()[option];
		}
		
		public String toString() {
			return option + " - " + desc;
		}
	}
}
