package cpusim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SchedulingAlgos extends JPanel implements ActionListener{

    public SchedulingAlgos(){
        super();
        setLayout(null);
        setBackground(Color.RED);
        setVisible(true);
        setBounds(10,10,200,70);
        
        addSchedulingText();
        
    }
    
    public void addSchedulingText(){
        JLabel scheduling = new JLabel("Scheduling Algorithms");
        scheduling.setBounds(5, -15, 200, 50);
        add(scheduling);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
