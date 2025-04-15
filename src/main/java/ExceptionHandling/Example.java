package ExceptionHandling;

import java.util.Scanner;

class Example {

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two Numbers : ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            sc.close();
            System.out.print("We got 2 numbers");
            float result = (float) n1 / n2;
            System.out.print("\n Div of 2 numbers: " + result + "\n");
        } catch (Exception e) {
            System.out.print("pas para \n");
            System.out.print(e.getMessage());
        }
    }

}

