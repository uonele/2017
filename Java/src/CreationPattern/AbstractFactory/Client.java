package CreationPattern.AbstractFactory;
public class Client
{	public static void main(String args[])
	{
         try
         {
         	ComputerFactory factory;
         	CPU cpu;
         	RAM ram;
         	factory=(ComputerFactory)XMLUtil.getBean();
         	cpu=factory.produceCPU();
         	cpu.produceCPU();
         	ram=factory.produceRAM();
         	ram.produceRAM();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
