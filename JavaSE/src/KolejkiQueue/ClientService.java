package KolejkiQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ClientService {

	public static void main(String[] args) {
		Queue<Client> clientQueue = new LinkedList<>();
		
		clientQueue.offer(new Client("gra¿ynka"));
		clientQueue.offer(new Client("monika"));
		clientQueue.offer(new Client("dominika"));
		clientQueue.offer(new Client("alicja"));
		clientQueue.offer(new Client("sabinka"));
		
		System.out.println("Metoda peek() (1): " + clientQueue.peek());
		System.out.println("Metoda peek() (2): " + clientQueue.peek());
		
		System.out.println("Metoda poll() (1): " + clientQueue.poll());
		System.out.println("Metoda poll() (2): " + clientQueue.poll());
		
		System.out.println("Stan kolejki: " + clientQueue);
		System.out.println("Peek : " + clientQueue.peek());
		System.out.println("Stan kolejki: " + clientQueue.poll());
		System.out.println("Stan kolejki: " + clientQueue);
	}
	
}
