package ChainOfResponsibilityPattern;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        //если низкий приоритет, то отправляем только отчет
        //если средний, то отчет и сообщение на почту
        //если высокий, то ещё и смс
        reportNotifier.setNextNotifiet(emailNotifier);
        emailNotifier.setNextNotifiet(smsNotifier);

        reportNotifier.notifyManager("Всё впорядке.", Priority.ROUTINE);
        reportNotifier.notifyManager("Не сказать что всё впорядке..",Priority.IMPORTANT);
        reportNotifier.notifyManager("У меня плохие новости..",Priority.ASAP);
    }
}
