import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class MainClass {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC3ff0e2cdd33b1814ecf4ab395ce8f489";
    public static final String AUTH_TOKEN = "b82b9270ad46c599260fa03fd93c1726";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+972527553195"),
                new PhoneNumber("+12183040178"),
                "Test").create();

        System.out.println(message.getSid());
    }
}