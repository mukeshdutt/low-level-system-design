package notification;

public class SMSNotification implements INotification{

    @Override
    public void Send(String message) {
        System.out.println("Notification sending by sms: "+ message);
    }

    @Override
    public boolean IsSent() {
        return false;
    }
}
