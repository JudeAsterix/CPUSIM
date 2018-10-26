package cpusim;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiBuilder extends JFrame implements ActionListener {
    
    public GuiBuilder(){
        super("CPU Scheduler");
        setLayout(null);
        setSize(850, 525);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        add(new SchedulingAlgos());
        add(new Process());
        add(new BurstTimes());
        setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
