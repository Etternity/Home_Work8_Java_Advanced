package Task5.com.example;
public class ClassA {
    public synchronized void methodA(ClassB classB) {
        System.out.println("ClassA: methodA() started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ClassA: Trying to call ClassB.methodB()");
        classB.methodB();
        System.out.println("ClassA: methodA() completed");
    }

    public synchronized void methodB() {
        System.out.println("ClassA: methodB() started");

        System.out.println("ClassA: methodB() completed");
    }
}