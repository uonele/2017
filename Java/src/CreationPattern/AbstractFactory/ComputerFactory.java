package CreationPattern.AbstractFactory;
public interface ComputerFactory
{
	public CPU produceCPU();
	public RAM produceRAM();
}