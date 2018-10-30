package cpusim;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BurstTimes extends JPanel{
    private Color honeyDew = new Color(240,255,240);
    private int xPos = 455, yPos = 12;
    private Font font1 = new Font("SansSerif", Font.BOLD, 15);
    
    public BurstTimes(){
        super();
        setLayout(null);
        setBackground(honeyDew);
        setBounds(xPos,yPos,257,60);
        
        
        addBurstTimes();
        addRandomButton();
        addManualButton();
        setVisible(true);
        
    }
    
    public void addBurstTimes(){
        JLabel burstTimeStatement = new JLabel("Enter burst times for processes");
        burstTimeStatement.setBounds(xPos-450, yPos-22, 250, 50);
        burstTimeStatement.setFont(font1);
        add(burstTimeStatement);
    }
    
    public void addRandomButton(){
        JButton randomButton = new JButton("randomly");
        randomButton.setBounds(xPos-455, yPos+14, 120, 30);
        add(randomButton);
    }
    
    public void addManualButton(){
        JButton manualButton = new JButton("manually");
        manualButton.setBounds(xPos - 318, yPos + 14, 120, 30);
        add(manualButton);
    }
}
