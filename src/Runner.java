
public class Runner implements Runnable {
	public void run(){
		doStuff();
	}
	public void doStuff(){
		doMoreStuff();
	}
	public void doMoreStuff(){
		System.out.println("[--In Runner.Java--]");
	}
}
