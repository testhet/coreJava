package methods;

public class Parents {
    public void m1() {
        System.out.print("old");
    }
}

class Child extends Parents {
    public void m1() {
        System.out.print("new child");
    }
}
