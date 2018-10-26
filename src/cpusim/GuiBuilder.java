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
    private final String[] algos = {"First Come First Serve (FCFS)",
                                    "Shortest Job First (SJF)",
                                    "Shortest Remaining Time First (SRT)",
                                    "Round Robin (RR)",
                                    "Priority Scehdule"};
    
    
    public GuiBuilder(){
        super("CPU Scheduler");
        setLayout(null);
        setSize(750, 464);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        add(new SchedulingAlgos());
        setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
