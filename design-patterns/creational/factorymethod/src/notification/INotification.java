package notification;

public interface INotification {
    void Send(String message);
    boolean IsSent();
}
