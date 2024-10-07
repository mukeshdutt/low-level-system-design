package notification;

public class NotificationFactory {

    public INotification createNotification(NotificationType notificationType) {
        return switch (notificationType) {
            case NotificationType.Email -> new EmailNotification();
            case NotificationType.Push -> new PushNotification();
            case NotificationType.SMS -> new SMSNotification();
            case NotificationType.WhatsApp -> new WhatsAppNotification();
        };
    }
}