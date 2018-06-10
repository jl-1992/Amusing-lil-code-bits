import java.util.HashMap;

public class BlockingHashMap {

	private HashMap<Integer, String> map = new HashMap<Integer, String>();
	private int sizeLimit = 10;

	public BlockingHashMap(int sizeLimit) {
		this.sizeLimit = sizeLimit;
	}
	public synchronized void add(int key, String value) throws InterruptedException {
		while (this.map.size() ==  this.sizeLimit) {
			System.out.println("waiting to be able to add: " + key +", " + value);
			wait();
		}
		if (this.map.size() == 0) {
			System.out.println("wake up threads to add!");
			notifyAll();
		}
		System.out.println("Adding: " + key +", " + value);
		this.map.put(key, value);
	}

	public synchronized String remove(int key) throws InterruptedException {
		while (this.map.size() ==  0) {
			System.out.println("waiting to be able to remove: " + key);
			wait();
		}
		if (this.map.size() == this.sizeLimit) {
			System.out.println("wake up threads to remove!");
			notifyAll();
		}
		System.out.println("Removing: " + key);
		return this.map.remove(key);
	}
}