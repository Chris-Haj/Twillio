import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import javax.swing.*;

public class MainClass {
    // Find your Account Sid and Token at twilio.com/user/account


    public static void main(String[] args) {


        Setup app =  new Setup();
        app.frame.setVisible(true);
        app.frame.setSize(450,700);
        app.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}