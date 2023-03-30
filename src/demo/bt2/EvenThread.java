package demo.bt2;

public class EvenThread extends Thread{
    private Thread t;

    public EvenThread() {
    }
    public void run(){
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }
}
