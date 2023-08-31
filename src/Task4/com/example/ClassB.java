package Task4.com.example;
public class ClassB {
    public synchronized void printB() {
        for (int i = 0; i < 5; i++) {
            System.out.println("2 клас");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
