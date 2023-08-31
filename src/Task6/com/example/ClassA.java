package Task6.com.example;

public class ClassA {
    private SharedResource sharedResource;

    public ClassA(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void methodA(ClassB classB) {
        System.out.println("ClassA: methodA() started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ClassA: Trying to call ClassB.methodB()");
        while (sharedResource.getFlag()) {

        }

        classB.methodB();
        System.out.println("ClassA: methodA() completed");
    }

    public void methodB() {
        System.out.println("ClassA: methodB() started");

        System.out.println("ClassA: methodB() completed");
    }
}