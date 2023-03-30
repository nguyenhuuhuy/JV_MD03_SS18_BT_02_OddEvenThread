package demo.bt2;

public class OddThread extends Thread {
private Thread t;

    public OddThread() {
    }
    public void run() {
        for (int i = 1; i < 11; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
