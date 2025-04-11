package polymorphism;

public class Person {
    public void showDetails() {
        System.out.print("Basic details of person : ");
    }
}

class Emp extends Person {
    public void showDetails(){
        System.out.print("Showing details of emp run time polymorph");
    }
}

