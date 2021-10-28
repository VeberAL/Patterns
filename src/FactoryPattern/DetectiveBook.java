package FactoryPattern;

public class DetectiveBook implements BookType {
    @Override
    public void readBook() {
        System.out.println("Человек читает детектив...");
    }
}
