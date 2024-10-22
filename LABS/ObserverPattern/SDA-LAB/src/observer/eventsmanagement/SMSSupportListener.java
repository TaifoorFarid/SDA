/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventsmanagement;

import java.io.File;
/**
 *
 * @author fa22-bse-051
 */
public class SMSSupportListener implements EventListener {
    private String phoneNo;
    private String message;

    public SMSSupportListener(String phoneNo, String message) {
        this.phoneNo = phoneNo;
        this.setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message.length() > 160) {
            System.out.print("Message is to long, Message not set");
            return;
        }
        this.message = message;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("SMS to " + phoneNo + "Message: " + this.message);
    }
}
