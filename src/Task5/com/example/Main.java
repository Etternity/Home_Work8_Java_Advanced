package Task5.com.example;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        Thread thread1 = new Thread(() -> {
            classA.methodA(classB);
        });

        Thread thread2 = new Thread(() -> {
            classB.methodA(classA);
        });

        thread1.start();
        thread2.start();
    }
}