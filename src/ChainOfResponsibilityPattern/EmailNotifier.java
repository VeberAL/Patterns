package ChainOfResponsibilityPattern;
//отправка менеджеру сообщения на почту (если проблема средняя по приоритету)
public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: "+ message);

    }
}
