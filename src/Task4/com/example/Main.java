package Task4.com.example;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        Thread thread1 = new Thread(() -> {
            classA.printA();
        });

        Thread thread2 = new Thread(() -> {
            classB.printB();
        });

        thread1.start();
        thread2.start();
    }
}
