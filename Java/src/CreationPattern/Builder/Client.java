package CreationPattern.Builder;
public class Client
{
	public static void main(String args[])
	{
	    computerBuilder mb=(computerBuilder)XMLUtil.getBean();
		computerDirector  cd=new computerDirector();
	    cd.setcomputerBuilder(mb);
	    computer c=cd.construct();
        System.out.println("开始");
        System.out.println(c.getCpu());
        System.out.println(c.getHardDisk());
        System.out.println(c.getMainFrame());
        System.out.println(c.getMonitor());
        System.out.println(c.getRam());
	}
}
