import javax.swing.*;
import java.awt.*;

public class UI {

    JLabel phone =  new JLabel("");
    JTextField SMS =  new JTextField("Enter your message here");

    JButton[] numbers =  new JButton[12];
    JButton send =  new JButton("Send SMS");
    JButton delete = new JButton("Delete");

    Font font = new Font(Font.MONOSPACED,Font.BOLD,30);

    UI(){

        for(int i=0;i<9;i++){
            numbers[i] =  new JButton(Integer.toString(i+1));
            numbers[i].setFont(new Font(Font.SANS_SERIF,Font.BOLD,50));
        }
        numbers[9] = new JButton("0");
        numbers[10] = new JButton("*");
        numbers[11] = new JButton("+");

        for(int i=9;i<12;i++){
            numbers[i].setFont(new Font(Font.SANS_SERIF,Font.BOLD,50));
        }


        phone.setFont(font);
        phone.setForeground(Color.WHITE);
        SMS.setForeground(Color.WHITE);

        phone.setBackground(Color.BLACK);
        SMS.setBackground(Color.BLACK);


        SMS.setFont(font);
        send.setFont(font);
        delete.setFont(font);

        send.setBackground(new Color(16,195,39));
        send.setForeground(Color.WHITE);

        delete.setBackground(new Color(195,16,16));
        delete.setForeground(Color.BLACK);



    }



}