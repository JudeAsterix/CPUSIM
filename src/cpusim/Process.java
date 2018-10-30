package cpusim;
//Add in reset Button
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Process extends JPanel implements ActionListener{
        private Color honeyDew = new Color(240,255,240);  
        private int xPos = 300, yPos = 12;
    
         //Adding JLabels and TextBoxes
            JLabel pro1 = new JLabel("Process 1");
            JLabel pro2 = new JLabel("Process 2");
            JLabel pro3 = new JLabel("Process 3");
            JLabel pro4 = new JLabel("Process 4");
            JLabel pro5 = new JLabel("Process 5");
            JLabel pro6 = new JLabel("Process 6");
            JLabel pro7 = new JLabel("Process 7");
            JLabel pro8 = new JLabel("Process 8");
            JLabel pro9 = new JLabel("Process 9");
            JLabel pro10 = new JLabel("Process 10");
            
            JTextField txtPro1 = new JTextField();
            JTextField txtPro2 = new JTextField();
            JTextField txtPro3 = new JTextField();
            JTextField txtPro4 = new JTextField();
            JTextField txtPro5 = new JTextField();
            JTextField txtPro6 = new JTextField();
            JTextField txtPro7 = new JTextField();
            JTextField txtPro8 = new JTextField();
            JTextField txtPro9 = new JTextField();
            JTextField txtPro10 = new JTextField();
             
    public Process(){
        super();
        setLayout(null);
        setBackground(honeyDew);
        setBounds(xPos-10,yPos,150,310);
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
        processesList.setSize(80, 33);
        processesList.addActionListener(this);
        add(processesList);
        JLabel processQuantity = new JLabel("# of Processes");
        processQuantity.setBounds(xPos - 270, yPos-100, 200,60);
        add(processQuantity);
        
    }
    
    public void addNumberOfProcessesTextField(){
        JTextField enterNumOfProcessesManually = new JTextField("");
        enterNumOfProcessesManually.setBounds(xPos - 205, yPos + 17, 40,25);
        add(enterNumOfProcessesManually);
    }
    
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JComboBox combo = (JComboBox) e.getSource();
            int selectedProcess = (Integer) combo.getSelectedItem();
            updateProcessesShown(selectedProcess);
            repaint();
        }
        
        /*public int getTextData(int numOfText)
        {
            if(numOfText == 1)
            {
                
            }
        }*/
        public void updateProcessesShown(int numSelectedProcess)
        {
            drawLabelsAndText();
            if (numSelectedProcess == 1)
            {
                //Visibility
            pro1.setVisible(true);
            pro2.setVisible(false);
            pro3.setVisible(false);
            pro4.setVisible(false);
            pro5.setVisible(false);
            pro6.setVisible(false);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(false);
            txtPro3.setVisible(false);
            txtPro4.setVisible(false);
            txtPro5.setVisible(false);
            txtPro6.setVisible(false);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            //getTextData(numSelectedProcess);
            repaint();
            }
             else if(numSelectedProcess == 2)
            {
                //Visibility
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(false);
            pro4.setVisible(false);
            pro5.setVisible(false);
            pro6.setVisible(false);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(false);
            txtPro4.setVisible(false);
            txtPro5.setVisible(false);
            txtPro6.setVisible(false);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            }
            else if(numSelectedProcess == 3)
            {
            //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(false);
            pro5.setVisible(false);
            pro6.setVisible(false);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(false);
            txtPro5.setVisible(false);
            txtPro6.setVisible(false);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            }
            else if(numSelectedProcess == 4)
            {
                 //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(true);
            pro5.setVisible(false);
            pro6.setVisible(false);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(true);
            txtPro5.setVisible(false);
            txtPro6.setVisible(false);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            repaint();
            }
            else if(numSelectedProcess == 5)
            {
                 //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(true);
            pro5.setVisible(true);
            pro6.setVisible(false);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(true);
            txtPro5.setVisible(true);
            txtPro6.setVisible(false);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            repaint();
            }
            else if(numSelectedProcess == 6)
            {
                 //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(true);
            pro5.setVisible(true);
            pro6.setVisible(true);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(true);
            txtPro5.setVisible(true);
            txtPro6.setVisible(true);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            repaint();
            }
            else if(numSelectedProcess == 7)
            {
                 //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(true);
            pro5.setVisible(true);
            pro6.setVisible(true);
            pro7.setVisible(true);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(true);
            txtPro5.setVisible(true);
            txtPro6.setVisible(true);
            txtPro7.setVisible(true);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            repaint();
            }
            else if(numSelectedProcess == 8)
            {
                //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(true);
            pro5.setVisible(true);
            pro6.setVisible(true);
            pro7.setVisible(true);
            pro8.setVisible(true);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(true);
            txtPro5.setVisible(true);
            txtPro6.setVisible(true);
            txtPro7.setVisible(true);
            txtPro8.setVisible(true);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            repaint();
            }
            else if(numSelectedProcess == 9)
            {
                    //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(true);
            pro5.setVisible(true);
            pro6.setVisible(true);
            pro7.setVisible(true);
            pro8.setVisible(true);
            pro9.setVisible(true);
            pro10.setVisible(false);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(true);
            txtPro5.setVisible(true);
            txtPro6.setVisible(true);
            txtPro7.setVisible(true);
            txtPro8.setVisible(true);
            txtPro9.setVisible(true);
            txtPro10.setVisible(false);
            repaint();
            }
            else if(numSelectedProcess == 10)
            {
                  //Visiblity
            pro1.setVisible(true);
            pro2.setVisible(true);
            pro3.setVisible(true);
            pro4.setVisible(true);
            pro5.setVisible(true);
            pro6.setVisible(true);
            pro7.setVisible(true);
            pro8.setVisible(true);
            pro9.setVisible(true);
            pro10.setVisible(true);
            
            txtPro1.setVisible(true);
            txtPro2.setVisible(true);
            txtPro3.setVisible(true);
            txtPro4.setVisible(true);
            txtPro5.setVisible(true);
            txtPro6.setVisible(true);
            txtPro7.setVisible(true);
            txtPro8.setVisible(true);
            txtPro9.setVisible(true);
            txtPro10.setVisible(true);
            repaint();
            }
        
        
        
        }       

    public void drawLabelsAndText() 
    {
            int x1 = 10;
            int w1 = 60;
            int h1 = 40;
            
            //Setting Bounds for JLabel and TextFields
            pro1.setBounds(x1, 50, w1, h1);
            pro2.setBounds(x1, 75, w1, h1);
            pro3.setBounds(x1, 100, w1, h1);
            pro4.setBounds(x1, 125, w1, h1);
            pro5.setBounds(x1, 150, w1, h1);
            pro6.setBounds(x1, 175, w1, h1);
            pro7.setBounds(x1, 200, w1, h1);
            pro8.setBounds(x1, 225, w1, h1);
            pro9.setBounds(x1, 250, w1, h1);
            pro10.setBounds(x1, 275, 70, h1);
            
            txtPro1.setBounds(90, 60, 40, 20);
            txtPro2.setBounds(90, 85, 40, 20);
            txtPro3.setBounds(90, 110, 40, 20);
            txtPro4.setBounds(90, 135, 40, 20);
            txtPro5.setBounds(90, 160, 40, 20);
            txtPro6.setBounds(90, 185, 40, 20);
            txtPro7.setBounds(90, 210, 40, 20);
            txtPro8.setBounds(90, 235, 40, 20);
            txtPro9.setBounds(90, 260, 40, 20);
            txtPro10.setBounds(90, 285, 40, 20);
            
            //Adding in Components
            add(pro1);
            add(pro2);
            add(pro3);
            add(pro4);
            add(pro5);
            add(pro6);
            add(pro7);
            add(pro8);
            add(pro9);
            add(pro10);
            
            add(txtPro1);
            add(txtPro2);
            add(txtPro3);
            add(txtPro4);
            add(txtPro5);
            add(txtPro6);
            add(txtPro7);
            add(txtPro8);
            add(txtPro9);
            add(txtPro10);
            
            //Visibility
            
            pro1.setVisible(false);
            pro2.setVisible(false);
            pro3.setVisible(false);
            pro4.setVisible(false);
            pro5.setVisible(false);
            pro6.setVisible(false);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(false);
            txtPro2.setVisible(false);
            txtPro3.setVisible(false);
            txtPro4.setVisible(false);
            txtPro5.setVisible(false);
            txtPro6.setVisible(false);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            repaint();
            revalidate();
            
            
              
            
            pro1.setVisible(false);
            pro2.setVisible(false);
            pro3.setVisible(false);
            pro4.setVisible(false);
            pro5.setVisible(false);
            pro6.setVisible(false);
            pro7.setVisible(false);
            pro8.setVisible(false);
            pro9.setVisible(false);
            pro10.setVisible(false);
            
            txtPro1.setVisible(false);
            txtPro2.setVisible(false);
            txtPro3.setVisible(false);
            txtPro4.setVisible(false);
            txtPro5.setVisible(false);
            txtPro6.setVisible(false);
            txtPro7.setVisible(false);
            txtPro8.setVisible(false);
            txtPro9.setVisible(false);
            txtPro10.setVisible(false);
            repaint();    
    }
        
    
    
}
