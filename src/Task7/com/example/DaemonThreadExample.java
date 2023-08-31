package Task7.com.example;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true);

        System.out.println("Main thread is done.");
    }

    private static class DaemonTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Daemon thread is running.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
