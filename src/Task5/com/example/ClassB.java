package Task5.com.example;
public class ClassB {
    public synchronized void methodA(ClassA classA) {
        System.out.println("ClassB: methodA() started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ClassB: Trying to call ClassA.methodB()");
        classA.methodB();
        System.out.println("ClassB: methodA() completed");
    }

    public synchronized void methodB() {
        System.out.println("ClassB: methodB() started");

        System.out.println("ClassB: methodB() completed");
    }
}