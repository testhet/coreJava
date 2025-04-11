package abstraction;

abstract public class MyMainClass {
    public void cal(){
        System.out.print("Calculating result");
    }

abstract public void launchRocket();

}


class Start {
    public static void main(String[] args) {

        MyMainClass ob = new MychildClass();

        ob.cal();
        ob.launchRocket();

    }
}