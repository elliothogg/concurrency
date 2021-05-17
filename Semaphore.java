

/**
 * CSC8016 coursework: semaphore class
 */
public class Semaphore {
    protected int value;

    public Semaphore() {
        value = 0;
    }

    public Semaphore(int initial) {
        value = (initial >=0) ? initial : 0;
    }

    public synchronized void P() throws InterruptedException {
        while (value==0) {
            wait();
        }
        value--;
    }

    public synchronized void V() {
        value++;
        notify();
    }
}
