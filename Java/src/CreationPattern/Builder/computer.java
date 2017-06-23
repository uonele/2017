package CreationPattern.Builder;
public class computer
{
	private String Cpu;
	private String Ram;
	private String HardDisk;
	private String MainFrame;
	private String Monitor;
	
	public void setCpu(String Cpu) {
		this.Cpu = Cpu; 
	}

	public void setRam(String Ram) {
		this.Ram = Ram; 
	}
	public void setHardDisk(String HardDisk) {
            this.HardDisk = HardDisk;
    }
	public void setMainFrame(String MainFrame) {
               this.MainFrame = MainFrame; 
    }
	public void setMonitor(String Monitor) {
                this.Monitor = Monitor;
    }

	public String getCpu() {
		return (this.Cpu); 
	}

	public String getHardDisk() {
		return (this.HardDisk); 
	}
	public String getMainFrame() {
	           return (this.MainFrame); 
	}
	public String getMonitor() {
	            return (this.Monitor); 
	}
	public String getRam() {
	            return (this.Ram); 
	}
}