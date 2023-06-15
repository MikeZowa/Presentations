package interfacedependency;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sms sent to " + recipient + " with message: " + message);
    }
}
