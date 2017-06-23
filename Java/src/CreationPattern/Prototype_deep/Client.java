package CreationPattern.Prototype_deep;

import java.io.IOException;
import java.io.OptionalDataException;

public class Client {

    public static void main(String[] args) {
    	Customer customer,copyCustomer=null;
    	customer = new Customer();
    	try {  
                copyCustomer = (Customer)customer.deepClone();
        } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    	System.out.println("customer == copyCustomer  ?? ");
    	System.out.println(customer == copyCustomer);

        customer.showAddress();
        copyCustomer.showAddress();
    	System.out.println("customer.showAddress == copyCustomer.showAddress()  ??");
    	System.out.println(customer.getAddress() == copyCustomer.getAddress());

    }

}
