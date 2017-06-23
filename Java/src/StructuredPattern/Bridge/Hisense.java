package StructuredPattern.Bridge;

public class Hisense extends Manufacturer {

        @Override
        public void produce() {
                // TODO Auto-generated method stub
                System.out.println("海信生产电器ing");
                implementor.assemble();
        }

}
