package notification;

public class WhatsAppNotification implements INotification{

    @Override
    public void Send(String message) {
        System.out.println("Notification sending by whatsapp: "+ message);
    }

    @Override
    public boolean IsSent() {
        return false;
    }
}
