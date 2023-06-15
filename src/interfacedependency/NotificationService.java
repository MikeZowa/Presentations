package interfacedependency;

public class NotificationService {
    private final MessageService messageService;
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String notice, String recipient){
        messageService.sendMessage(notice,recipient);
    }

    public static void main(String[] args) {
        var ems = new NotificationService(new EmailService());
        ems.sendNotification("Hello World!", "test@example.com");

       var sms = new NotificationService(new SmsService());
        sms.sendNotification("Hello World!", "+1234567890");

    }
}
