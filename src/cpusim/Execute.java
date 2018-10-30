package cpusim;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Execute extends JPanel{
        private Color honeyDew = new Color(240,255,240);  
        private int xPos = 730, yPos = 12;
        private Font font1 = new Font("SansSerif", Font.BOLD, 15);
    
    public Execute(){
        setLayout(null);
        setBackground(honeyDew);
        setBounds(xPos, yPos, 100,60);
        
        displayExecuteButton();
        
        setVisible(true);
    }
    
    public void displayExecuteButton(){
        JButton execute = new JButton("EXECUTE");
        execute.setBounds(xPos-725, yPos-5, 90, 50);
        execute.setFont(font1);
        execute.addActionListener(new RunSimulation());
        add(execute);
    }
    
    public class RunSimulation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.out.println(e.getActionCommand());
            
        }
    }
}
