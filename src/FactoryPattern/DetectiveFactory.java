package FactoryPattern;

public class DetectiveFactory implements BookTypeFactory{
    @Override
    public BookType createBookType() {
        return new DetectiveBook();
    }
}
