package cpusim;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Process extends JPanel {
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
    
    public Process(int numSelected){
        numOfProcess = this.numOfProcess;
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
        processesList.addActionListener(new ProcessRun());
        add(processesList);
    }
    
    public class ProcessRun implements ActionListener{
        private int numOfProcesses;
        SharedData x;
        @Override
        public void actionPerformed(ActionEvent e) {
            x = new SharedData();
            JComboBox cb = (JComboBox)e.getSource();
            numOfProcesses = (int)cb.getSelectedItem();
            System.out.println(numOfProcesses);
            x.setNumberOfProcesses(numOfProcesses);
        }   
        
        
    }
    
}
