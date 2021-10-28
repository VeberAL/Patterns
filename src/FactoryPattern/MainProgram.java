package FactoryPattern;

public class MainProgram {
    public static void main(String[] args) {
        //Изменяя detective на вновь добавленный или имеющийся класс можно его вызывать меняя одно значение
        BookTypeFactory bookTypeFactory = new DetectiveFactory();
        BookType bookType = bookTypeFactory.createBookType();

        bookType.readBook();
    }
}
