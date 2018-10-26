package cpusim;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Process extends JPanel{
    
    private int xPos = 300, yPos = 12;
    public Process(){
        super();
        setLayout(null);
        setBackground(Color.BLUE);
        setBounds(xPos,yPos,150,60);
        
        addNumberOfProcessesLabel();
        addNumberOfProcessesList();
        addNumberOfProcessesTextField();
        setVisible(true);
    }
    
    public void addNumberOfProcessesLabel(){
        JLabel processQuantity = new JLabel("# of Processes");
        processQuantity.setBounds(xPos - 270, yPos-28, 200,60);
        add(processQuantity);
    }
    
    public void addNumberOfProcessesList(){
        Integer[] numOfProcessesOptions = {1,2,3,4,5,6,7,8,9,10};
        JComboBox processesList = new JComboBox(numOfProcessesOptions);
        processesList.setBounds(xPos - 290, yPos, 70, 60);
        add(processesList);
    }
    
    public void addNumberOfProcessesTextField(){
        JTextField enterNumOfProcessesManually = new JTextField("");
        enterNumOfProcessesManually.setBounds(xPos - 205, yPos + 17, 40,25);
        add(enterNumOfProcessesManually);
    }
    
    
    
}
