package org;

public class Students {

    //data

    int studentID;
    String studentName;
    String studentCity;

    // behaviour : methods

    public void study(){
        System.out.print(studentName + "is studying");
    }

    public void showFullDetails(){
        System.out.print("My name is" + studentName);
        System.out.print("My ID is" + studentID);
        System.out.print("My city is" + studentCity);
    }
}
