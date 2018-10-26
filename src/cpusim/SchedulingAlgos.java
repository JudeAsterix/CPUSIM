package cpusim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SchedulingAlgos extends JPanel implements ActionListener{
        private Color honeyDew = new Color(240,255,240);
        private int xPos = 12, yPos = 12;
       
    public SchedulingAlgos(){
        super();
        setLayout(null);
        setBackground(honeyDew);
        
        setBounds(xPos,yPos,265,60);
        
        addSchedulingText();
        addSchedulingMenu();
        setVisible(true);
    }
    
    public void addSchedulingText(){
        JLabel scheduling = new JLabel("Scheduling Algorithms");
        scheduling.setBounds(xPos + 42, yPos - 25, 250, 50);
        add(scheduling);
    }
    
    public void addSchedulingMenu(){
        String[] schedulingAlgorithmsList = {"First Come First Serve (FCFS)",
                                    "Shortest Job First (SJF)",
                                    "Shortest Remaining Time First (SRT)",
                                    "Round Robin (RR)",
                                    "Priority Scehdule"};
        JComboBox algosList = new JComboBox(schedulingAlgorithmsList);
        algosList.setBounds(xPos - 5, yPos, 250, 50);
        add(algosList);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
