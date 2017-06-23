package BehavioralPattern.Command;


import org.w3c.dom.NodeList;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

/**
 * Created by uonele on 2016/12/22.
 */
public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File("config.xml"));

            NodeList nl = document.getElementsByTagName("function");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            Class c = Class.forName(cName);
            System.out.println(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
