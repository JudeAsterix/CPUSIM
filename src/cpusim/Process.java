package cpusim;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Process extends JPanel implements ActionListener {
        private Color honeyDew = new Color(240,255,240);
        private int xPos = 300, yPos = 12;
        private Font font1 = new Font("SansSerif", Font.BOLD, 15);
        private int numOfProcess = 0;
        
    public Process(){
        super();
        setLayout(null);
        setBackground(honeyDew);
        setBounds(xPos-10,yPos,150,60);
        
        addNumberOfProcessesLabel();
        addNumberOfProcessesList();
        //addNumberOfProcessesTextField();
        setVisible(true);
    }
    
    public void addNumberOfProcessesLabel(){
        JLabel processQuantity = new JLabel("# of Processes");
        processQuantity.setBounds(xPos - 280, yPos-28, 200,60);
        processQuantity.setFont(font1);
        add(processQuantity);
    }
    
    public void addNumberOfProcessesList(){
        Integer[] numOfProcessesOptions = {1,2,3,4,5,6,7,8,9,10};
        JComboBox processesList = new JComboBox(numOfProcessesOptions);
        processesList.setBounds(xPos - 290, yPos, 130, 60);
        processesList.addActionListener(this);
        processesList.
        add(processesList);
    }
    
    public int getNumberOfProcesses(){
        return numOfProcess;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            numOfProcess = (int)cb.getSelectedItem();
    }   
   
    
    /*public void addNumberOfProcessesTextField(){
    JTextField enterNumOfProcessesManually = new JTextField("");
    enterNumOfProcessesManually.setBounds(xPos - 205, yPos + 17, 40,25);
    add(enterNumOfProcessesManually);
    }*/

}
