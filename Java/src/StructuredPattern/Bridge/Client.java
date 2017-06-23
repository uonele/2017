package StructuredPattern.Bridge;

public class Client {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                Manufacturer manufacturer;
                Implementor implementor;
                manufacturer = (Manufacturer)XMLUtil.getBean("factory");
                implementor = (Implementor)XMLUtil.getBean("things");
                manufacturer.setImplementor(implementor);
                manufacturer.produce();
        }

}
