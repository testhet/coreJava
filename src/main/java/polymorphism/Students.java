package polymorphism;

public class Students {
    public void read(){
        System.out.print("reading XYZ Book.");
    }

    public void read(String bookName){
        System.out.print("Reading" + bookName + "Book");
    }
}
