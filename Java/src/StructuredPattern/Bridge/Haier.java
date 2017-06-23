package StructuredPattern.Bridge;

public class Haier extends Manufacturer {

        @Override
        public void produce() {
                // TODO Auto-generated method stub
                System.out.println("海尔生产电器ing");
                implementor.assemble();
        }

}
