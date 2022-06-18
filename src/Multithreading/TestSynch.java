package Multithreading;

public class TestSynch {
    private int counter;

    public static void main(String[] args) throws InterruptedException{
        TestSynch testSynch = new TestSynch();
        testSynch.doWork();
    }

    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException{
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();


        System.out.println(counter);
    }
}
