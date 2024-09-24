interface NotificationSender {
    void sendNotification(String message, String recipient);
}

class EmailNotification implements NotificationSender {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class SMSNotification implements NotificationSender {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

class PushNotification implements NotificationSender {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}

class AlertSystem {
    private NotificationSender notificationSender;

    public AlertSystem(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendAlert(String message, String recipient) {
        notificationSender.sendNotification(message, recipient);
    }
}

public class ProtectedVariation {
    public static void main(String[] args) {
        // Use EmailNotification to send alerts
        AlertSystem emailAlertSystem = new AlertSystem(new EmailNotification());
        emailAlertSystem.sendAlert("How, Taifoor How are you doing ?", "taifoorfarid@example.com");

        // Use SMSNotification to send alerts
        AlertSystem smsAlertSystem = new AlertSystem(new SMSNotification());
        smsAlertSystem.sendAlert("Hey! is that you Taifoor ?", "0349-3312758");

        // Use PushNotification to send alerts
        AlertSystem pushAlertSystem = new AlertSystem(new PushNotification());
        pushAlertSystem.sendAlert("hi Taifoor, long time no see.", "Taifoor");
    }
}
