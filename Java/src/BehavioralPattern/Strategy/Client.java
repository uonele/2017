package BehavioralPattern.Strategy;

/**
 * Created by uonele on 2016/12/25.
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Cipher cipher = (Cipher)XMLUtil.getBean();
        String inputStr = "abc";
        System.out.println("原文:\n" + inputStr);
        byte[] inputData = inputStr.getBytes();

        byte[] outData_md5 = cipher.doEncrypy(inputData);
        String outputStr_md5 = new String(outData_md5);
        System.out.println("加密后: "+outputStr_md5);

    }
}
