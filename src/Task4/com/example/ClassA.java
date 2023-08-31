package Task4.com.example;
public class ClassA {
    public synchronized void printA() {
        for (int i = 0; i < 5; i++) {
            System.out.println("1 клас");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
