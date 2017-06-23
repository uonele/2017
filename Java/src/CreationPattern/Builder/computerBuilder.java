package CreationPattern.Builder;
public abstract class computerBuilder
{
	protected computer c=new computer();
	public abstract void buildCPU();
	public abstract void buildRam();
	public abstract void buildHardDisk();
	public abstract void buildMainframe();
	public abstract void buildMonitor();
	public computer produceComputere()
	{
		return c;
	}
}