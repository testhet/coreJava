package polymorphism;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Test Text ");
//        Students student = new Students();
//        student.read("Jule Vern");

        Person person = new Person();

        Ram ram = new Ram();
        ram.doWork(person);
    }
}
