package cpusim;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class GuiBuilder extends JFrame implements ActionListener {
    
    public GuiBuilder(){
        super("CPU Scheduler");
        setLayout(null);
        setSize(850, 525);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        add(new SchedulingAlgos());
        add(new Process());
        add(new BurstTimes());
        add(new GanttChart());
        add(new Execute());
        setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
