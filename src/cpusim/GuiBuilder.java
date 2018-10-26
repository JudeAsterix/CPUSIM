package cpusim;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiBuilder implements ActionListener {
    private final String[] algos = {"First Come First Serve (FCFS)",
                                    "Shortest Job First (SJF)",
                                    "Shortest Remaining Time First (SRT)",
                                    "Round Robin (RR)",
                                    "Priority Scehdule"};
    private final Integer[] numProcesses = {1,2,3,4,5,6,7,8,9,10};
    
    public GuiBuilder(){
        JFrame frame = new JFrame();
        frame.setSize(750, 464);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.red);
        frame.add(panel);
        addComponents(panel);
        
        frame.setVisible(true);
    }
    
    public void addComponents(JPanel panel){
        panel.setLayout(null);
        
        JLabel numProcesses = new JLabel("# of processes:");
        numProcesses.setBounds(7, 10, 120, 30);
        
        numProcesses.setVisible(true);
        
        JLabel algoType = new JLabel("Type of algorithm:");
        algoType.setBounds(7, 40, 120, 30);
        algoType.setVisible(true);
        
        JComboBox algoList = new JComboBox(algos);
        algoList.setBounds(0,0,150,50);
        algoList.setVisible(true);
        
        panel.add(numProcesses);
        panel.add(algoType);
        panel.add(algoList);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
