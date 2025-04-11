package Interfaces;

public interface Shape {
    //interface will automatically attach public static final

    int i = 5;

    //every function(not static ,, only normal method) wil be public abstract automatically
    void calArea(int r);


}
 class Circle implements Shape {


     public void calArea(int r){
         System.out.print("AREA OF CIRCLE IS: " + (Math.PI *r*r));
    }

     public static void main(String[] args) {
         Shape s1 = new Circle();
         s1.calArea(2);
     }

 }