package Task6.com.example;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ClassA classA = new ClassA(sharedResource);
        ClassB classB = new ClassB(sharedResource);

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