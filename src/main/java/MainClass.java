import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class MainClass {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC3ff0e2cdd33b1814ecf4ab395ce8f489";
    public static final String AUTH_TOKEN = "f6dc0a151474c33bc1016b81d7f3dead";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+972527553195"),
                new PhoneNumber("+12183040178"),
                "This message was sent by chris' new phone app!").create();

        System.out.println(message.getSid());
    }
}