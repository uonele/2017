package StructuredPattern.Bridge;

public class TCL extends Manufacturer {

        @Override
        public void produce() {
                // TODO Auto-generated method stub
                System.out.println("TCL生产电器ing");
                implementor.assemble();
        }

}
