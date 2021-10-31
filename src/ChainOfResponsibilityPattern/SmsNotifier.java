package ChainOfResponsibilityPattern;
//отправка менеджеру смс (если проблема серьезная)
public class SmsNotifier extends Notifier{
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: "+ message);

    }
}
