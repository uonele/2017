package CreationPattern.Builder;
public class computerDirector
{
	private computerBuilder cb;
	public void setcomputerBuilder(computerBuilder cb)
	{
		this.cb=cb;
	}
	public computer construct()
	{
		cb.buildCPU();
		cb.buildHardDisk();
		cb.buildMainframe();
		cb.buildMonitor();
		cb.buildRam();
		return cb.produceComputere();
	}
}