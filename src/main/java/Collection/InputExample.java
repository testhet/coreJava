package Collection;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your salary is $" + salary);

        sc.close(); // close scanner to avoid memory leak
    }
}
