package FactoryPattern;

public class FantasticBook implements BookType{
    @Override
    public void readBook() {
     System.out.println("Человек читает фантастику...");
    }
}
