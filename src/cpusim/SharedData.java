package cpusim;

public class SharedData {
        private int numberOfProcesses = 1;
        
    public SharedData(){
        System.out.println(numberOfProcesses);
    }
    
    public void setNumberOfProcesses(int numberOfProcesses){
        this.numberOfProcesses = numberOfProcesses;
        System.out.println(numberOfProcesses);
    }
    
    public int getNumberOfProcesses(){
        return this.numberOfProcesses;
    }
}
