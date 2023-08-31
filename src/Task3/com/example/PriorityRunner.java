package Task3.com.example;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread minPriorityThread = new PriorityThread("Min Priority Thread");
        PriorityThread maxPriorityThread = new PriorityThread("Max Priority Thread");
        PriorityThread normPriorityThread = new PriorityThread("Normal Priority Thread");

        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);

        minPriorityThread.start();
        maxPriorityThread.start();
        normPriorityThread.start();
    }
}
