package cpusim;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchedulingAlgos extends JPanel{
        private Color honeyDew = new Color(240,255,240);
        private int xPos = 12, yPos = 12;
        private Font font1 = new Font("SansSerif", Font.BOLD, 15);
        
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
        scheduling.setBounds(xPos + 35, yPos - 25, 250, 50);
        scheduling.setFont(font1);
        add(scheduling);
    }
    
    public void addSchedulingMenu(){
        String[] schedulingAlgorithmsList = {"1. First Come First Serve (FCFS)",
                                             "2. Shortest Job First (SJF)",
                                             "3. Shortest Remaining Time First (SRT)",
                                             "4. Round Robin (RR)",
                                             "5. Priority Schedule"};
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
            
            if(algo.startsWith("1")){
                runFirstComeFirstServed();
            }else if(algo.startsWith("2")){
                runShortestJobFirst();
            }else if(algo.startsWith("3")){
                runShortestRemainingTime();
            }else if(algo.startsWith("4")){
                runRoundRobin();
            }else if(algo.startsWith("5")){
                runPriority();
            }
        }
        
        public void runFirstComeFirstServed(){
        
        }
        
        public void runShortestJobFirst(){
        
        }
        
        public void runShortestRemainingTime(){
        
        }
        
        public void runRoundRobin(){
        
        }
        
        public void runPriority(){
        
        }
        
    }
    
    
    
}
