public class Test {
    public static void main(String[] args) {
    	BlockingHashMap bhm = new BlockingHashMap(10);

        Thread thread1 = new Thread() {
        	public void run() {
        		try {
        			bhm.remove(1);
        			for (int i = 1; i <= 11; i++) {
        				bhm.add(i, "number_" + i);
        			}
        		} catch (InterruptedException ie) { System.out.println("Thread interrupted!"); }
        	}
        };

        Thread thread2 = new Thread() {
        	public void run() {
        		try {
        			bhm.add(1, "number_1");
        			this.sleep(1000);
        			bhm.remove(10);
        		} catch (InterruptedException ie) { System.out.println("Thread interrupted!"); }
        	}
        };
        thread1.start();
        thread2.start();
    }
}