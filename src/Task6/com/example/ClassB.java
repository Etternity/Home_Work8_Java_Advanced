package Task6.com.example;
public class ClassB {
    private SharedResource sharedResource;

    public ClassB(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void methodA(ClassA classA) {
        System.out.println("ClassB: methodA() started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ClassB: Trying to call ClassA.methodB()");
        while (sharedResource.getFlag()) {

        }

        classA.methodB();
        System.out.println("ClassB: methodA() completed");
    }

    public void methodB() {
        System.out.println("ClassB: methodB() started");

        System.out.println("ClassB: methodB() completed");
    }
}