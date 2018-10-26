package cpusim;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BurstTimes extends JPanel{
    private Color honeyDew = new Color(240,255,240);
    private int xPos = 455, yPos = 12;
    
    public BurstTimes(){
        super();
        setLayout(null);
        setBackground(honeyDew);
        setBounds(xPos,yPos,250,60);
        
        
        addBurstTimes();
        addRandomButton();
        addManualButton();
        setVisible(true);
        
    }
    
    public void addBurstTimes(){
        JLabel burstTimeStatement = new JLabel("Enter burst times for processes");
        burstTimeStatement.setBounds(xPos-430, yPos-22, 200, 50);
        add(burstTimeStatement);
    }
    
    public void addRandomButton(){
        JButton randomButton = new JButton("randomly");
        randomButton.setBounds(xPos-440, yPos+14, 100, 30);
        add(randomButton);
    }
    
    public void addManualButton(){
        JButton manualButton = new JButton("manually");
        manualButton.setBounds(xPos - 325, yPos + 14, 100, 30);
        add(manualButton);
    }
}
