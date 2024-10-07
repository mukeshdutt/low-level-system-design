package notification;

public class Main {

    public static void main(String[] args) {

        NotificationFactory notificationSystem = new NotificationFactory();
        INotification notification  = notificationSystem.createNotification(NotificationType.Email);
        notification.Send("Processed");
        System.out.println(notification.IsSent());
    }
}
