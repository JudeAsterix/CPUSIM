package cpusim;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchedulingAlgos extends JPanel{
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
        String[] schedulingAlgorithmsList = {"1. First Come First Serve (FCFS)",
                                    "2. Shortest Job First (SJF)",
                                    "3. Shortest Remaining Time First (SRT)",
                                    "4. Round Robin (RR)",
                                    "5. Priority Scehdule"};
        JComboBox algosList = new JComboBox(schedulingAlgorithmsList);
        algosList.setBounds(xPos - 5, yPos, 250, 50);
        
        algosList.addActionListener(new ScheduleList());
        add(algosList);
    }
    
    public class ScheduleList implements ActionListener {
        private String algo;
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            algo = (String)cb.getSelectedItem();
            System.out.println(algo);
        }
        
    }
    
}
