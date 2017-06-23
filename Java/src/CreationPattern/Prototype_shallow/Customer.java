package CreationPattern.Prototype_shallow;

public class Customer implements Cloneable {
        private Address address = null;
        public Customer(){
                this.address = new Address();
        }
        public Customer clone() {
                Customer obj = null;
                try{
                obj = (Customer) super.clone();
                }catch (CloneNotSupportedException e) {
                        System.out.println("clone failed！");
                }
                return obj;
        }
        public Address getAddress() {
                // TODO Auto-generated method stub
                return this.address;
        }
        public void showAddress() {
                System.out.println("查看地址:");
                this.address.showAddress();

        }
}
