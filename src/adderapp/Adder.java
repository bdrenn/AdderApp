/*
Brian Drennan
 */
package adderapp;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.*;

/**
 *
 * @author briandrennan
 */
public class Adder {
    private JFrame frame;
    private JButton add;
    private JPanel panel;
    private JTextField add1;
    private JTextField add2;
    private JTextField sum1;
    private JLabel addend1;
    private JLabel addend2;
    private JLabel sum;
    
    public Adder(){
        Frame();
    }
    
    public void Frame(){
        //creating instance of objects
        frame = new JFrame();
        panel = new JPanel();
        add1 = new JTextField();
        add2 = new JTextField();
        sum1 = new JTextField();
        
        //JLabel
        addend1 = new JLabel("Addend1");
        addend2 = new JLabel("Addend2");
        sum = new JLabel("Sum");
        
        //panel sizing
        panel.setSize(400, 150);
        
        //text box size
        add1.setPreferredSize(new Dimension(60,20));
        add2.setPreferredSize(new Dimension(60,20));
        sum1.setPreferredSize(new Dimension(60,20));
        
        //text feild 
        panel.add(addend1);
        panel.add(add1);
        
        panel.add(addend2);
        panel.add(add2);
        
        panel.add(sum);
        panel.add(sum1);
        
        //buttons
        add = new JButton("Add");
        add.addActionListener(new AddListener());
        panel.add(add);
        
        //adding contents to frame
        frame.getContentPane().add(panel);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
    
    class AddListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           int a = 0;
           int b = 0;
           int sumTemp = 0;
           
           a = parseInt(add1.getText());
           b = parseInt(add2.getText());
           sumTemp = a + b;
           sum1.setText(Integer.toString(sumTemp));
        }
        
    }
    
}
