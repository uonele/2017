package CreationPattern.AbstractFactory;
public class MACFactory implements ComputerFactory
{
	public CPU produceCPU()
	{
		return new PCCPU();
	}
	
	public RAM produceRAM()
	{
		return new PCRAM();
	}
}