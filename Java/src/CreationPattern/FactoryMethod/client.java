package CreationPattern.FactoryMethod;

public class client {

	public static void main(String args[])
	{
         try
         {
         	ImageReader ir;
         	ImageReadFactory factory;
         	factory=(ImageReadFactory)XMLUtil.getBean();
         	ir=factory.createImageReader();
         	ir.readImage();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
