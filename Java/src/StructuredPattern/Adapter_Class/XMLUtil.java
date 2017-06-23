package StructuredPattern.Adapter_Class;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtil
{
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean()
    {
        try{
            System.out.println("");
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;                           
            doc = builder.parse(new File("config.xml"));
            NodeList nl = doc.getElementsByTagName("adapter");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
           }   
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
}