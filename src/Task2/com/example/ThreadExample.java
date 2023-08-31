package Task2.com.example;

public class ThreadExample {

    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            System.out.println("First thread started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First thread completed");
        });

        Thread secondThread = new Thread(() -> {
            System.out.println("Second thread started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second thread completed");
        });

        System.out.println("Main thread started");
        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread completed");
    }
}
