import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Setup implements ActionListener {

    JFrame frame =  new JFrame("Messenger");
    JPanel phoneHolder =  new JPanel();
    JPanel numbersGrid = new JPanel();
    JPanel actions = new JPanel();
    String text="";

    UI ui = new UI();

    Setup(){

        ui.phone.setSize(new Dimension(frame.getWidth(),100));
        ui.SMS.setSize(new Dimension(frame.getWidth(),100));
        ui.phone.setHorizontalAlignment(JLabel.CENTER);
        ui.SMS.setHorizontalAlignment(JLabel.CENTER);

        phoneHolder.setBackground(Color.BLACK);


        frame.setLayout(new BorderLayout());
        phoneHolder.setLayout(new GridLayout(2,1,1,10));
        phoneHolder.add(ui.phone);
        phoneHolder.add(ui.SMS);

        for(int i=0;i<9;i++){
            numbersGrid.add(ui.numbers[i]);
        }

        numbersGrid.add(ui.numbers[10]);
        numbersGrid.add(ui.numbers[9]);
        numbersGrid.add(ui.numbers[11]);

        numbersGrid.setLayout(new GridLayout(4,3,5,5));
        frame.add(numbersGrid);

        frame.add(phoneHolder,BorderLayout.NORTH);

        for(int i=0;i<12;i++){
            ui.numbers[i].addActionListener(this);
        }

        ui.send.addActionListener(this);
        ui.delete.addActionListener(this);

        actions.setLayout(new GridLayout(1,2));
        actions.add(ui.send);
        actions.add(ui.delete);
        frame.add(actions,BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<ui.numbers.length;i++){
            if(e.getSource()==ui.numbers[i]){
                ui.phone.setText(ui.phone.getText()+ui.numbers[i].getText());
            }
        }
        if(e.getSource()==ui.send){
            text=ui.SMS.getText();
        }
        else if(e.getSource()==ui.delete){
            ui.phone.setText(ui.phone.getText().substring(0,ui.phone.getText().length()-1));
        }
    }
}