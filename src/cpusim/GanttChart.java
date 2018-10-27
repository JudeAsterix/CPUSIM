package cpusim;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GanttChart extends JPanel{
        private Color honeyDew = new Color(240,255,240);
        private int xPos = 12, yPos = 340;
        private Font font1 = new Font("SansSerif", Font.BOLD, 20);
        
    public GanttChart(){
        super();
        
        setLayout(null);
        setBackground(honeyDew);
        setBounds(xPos,yPos,819, 145);
        
        addGanttChartLabel();
        
        setVisible(true);       
    }
    
    public void addGanttChartLabel(){
        JLabel ganttLabel = new JLabel("Gantt Chart");
        ganttLabel.setBounds(xPos+7, yPos - 333, 200, 30);
        ganttLabel.setFont(font1);
        add(ganttLabel);
    }
}
