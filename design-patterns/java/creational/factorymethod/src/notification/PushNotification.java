package notification;

public class PushNotification implements INotification{

    @Override
    public void Send(String message) {
        System.out.println("Notification sending by push: "+ message);
    }

    @Override
    public boolean IsSent() {
        return false;
    }
}
