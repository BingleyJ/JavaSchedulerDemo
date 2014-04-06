/*
 * Demonstrate the inequality of java scheduling of threads.
 * 
 * [--In Runner.Java--]
 * [--In SpawnRunners.java--]
 * 
 * would be expected to just repeat, but with threading 
 * and scheduling there are different results. 
 */

public class SpawnRunners {
	
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Runnable newthread = new Runner();
			Thread newThread = new Thread(newthread);
			newThread.start();

			System.out.println("[--In SpawnRunners.java--]");
		}
	}

}
