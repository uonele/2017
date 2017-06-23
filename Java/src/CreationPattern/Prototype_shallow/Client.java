package CreationPattern.Prototype_shallow;

public class Client {

    public static void main(String[] args) {
    	Customer customer,copyCustomer=null;
    	customer = new Customer();
    	copyCustomer = (Customer)customer.clone();
    	System.out.println("customer == copyCustomer  ?? ");
    	System.out.println(customer == copyCustomer);
		customer.showAddress();
		copyCustomer.showAddress();
		System.out.println("customer.showAddress == copyCustomer.showAddress()  ??");
    	System.out.println(customer.getAddress() == copyCustomer.getAddress());
    }

}
