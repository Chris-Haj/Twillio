import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import javax.swing.*;

public class MainClass {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC3ff0e2cdd33b1814ecf4ab395ce8f489";
    public static final String AUTH_TOKEN = "b82b9270ad46c599260fa03fd93c1726";

    public static void Send(String msg,String number){
        Message message = Message.creator(new PhoneNumber(number),
                new PhoneNumber("+12183040178"),
                msg).create();
    }

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Setup app =  new Setup();
        app.frame.setVisible(true);
        app.frame.setSize(450,700);
        app.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}