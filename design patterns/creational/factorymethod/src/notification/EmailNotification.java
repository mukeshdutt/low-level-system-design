package notification;

public class EmailNotification implements INotification {

    @Override
    public void Send(String message) {
        System.out.println("Notification sending by email: "+ message);
    }

    @Override
    public boolean IsSent() {
        return true;
    }
}
