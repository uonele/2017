package CreationPattern.Prototype_deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class Customer implements Serializable {
        private Address address = null;
        public Customer(){
                this.address = new Address();
        }
        public Object deepClone() throws ClassNotFoundException,IOException {
                ByteArrayOutputStream bao = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bao);
                oos.writeObject(this);
                ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bis);
                return (ois.readObject());
        }
        public Address getAddress() {
                // TODO Auto-generated method stub
                return this.address;
        }
        public void showAddress() {
                System.out.println("查看地址");
                this.address.showAddress();
        }
}
