package cpusim;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Process extends JPanel{
        private Color honeyDew = new Color(240,255,240);  
        private int xPos = 300, yPos = 12;
    
    public Process(){
        super();
        setLayout(null);
        setBackground(honeyDew);
        setBounds(xPos-10,yPos,150,60);
        
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
        processesList.setBounds(xPos - 290, yPos + 10, 70, 60);
        add(processesList);
        eventNumberOfProcess e = new eventNumberOfProcess();
        processesList.addActionListener(e);
    }
    
    public void addNumberOfProcessesTextField(){
        JTextField enterNumOfProcessesManually = new JTextField("");
        enterNumOfProcessesManually.setBounds(xPos - 205, yPos + 17, 40,25);
        add(enterNumOfProcessesManually);
    }
    
    public class eventNumberOfProcess implements ActionListener //WIP - Method for when you select the number of processes from combobox -- should display correct number of labels 
    {
        
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JLabel process1 = new JLabel("1st Process");
            process1.setBounds(30, 302, 40, 40);
            
            JComboBox combo = (JComboBox) e.getSource();
            int selectedProcess = (Integer) combo.getSelectedItem();
            if(selectedProcess == 1)
            {
                add(process1);
                process1.setVisible(true);
                
                System.out.println("Selected 1");
            }
            else if(selectedProcess == 2)
            {
                add(process1);
                process1.setVisible(true);
                System.out.println("Selected 2");
            }
            else if(selectedProcess == 3)
            {
                System.out.println("Selected 3");
            }
            else if(selectedProcess == 4)
            {
                System.out.println("Selected 4");
            }
            else if(selectedProcess == 5)
            {
                System.out.println("Selected 5");
            }
            else if(selectedProcess == 6)
            {
                add(process1);
                process1.setVisible(true);
                
                System.out.println("Selected 6");
            }
            else if(selectedProcess == 7)
            {
                add(process1);
                process1.setVisible(true);
                System.out.println("Selected 7");
            }
            else if(selectedProcess == 8)
            {
                System.out.println("Selected 8");
            }
            else if(selectedProcess == 9)
            {
                System.out.println("Selected 9");
            }
            else if(selectedProcess == 10)
            {
                System.out.println("Selected 10");
            }
        }
    }
    
}
