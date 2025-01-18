class MyRun implements Runnable { // Use Runnable instead of Run
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread using Runnable interface: " + i);
            try {
                Thread.sleep(500); // Pause the thread for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadInteger {
    public static void main(String[] args) {
        MyRun r = new MyRun(); // Create an instance of MyRun
        Thread t = new Thread(r); // Pass the Runnable instance to the Thread constructor
        t.start(); // Start the thread
    }
}
