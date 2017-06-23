package CreationPattern.AbstractFactory;
public class PCFactory implements ComputerFactory
{
	public CPU produceCPU()
	{
		return new MACCPU();
	}
	
	public RAM produceRAM()
	{
		return new MACRAM();
	}
}