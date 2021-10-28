package FactoryPattern;

public class FantasticFactory implements BookTypeFactory{
    @Override
    public BookType createBookType() {
        return new FantasticBook();
    }
}
