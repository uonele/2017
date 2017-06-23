package StructuredPattern.Composite;

import java.util.ArrayList;

public class Institution extends Unit {
        private ArrayList list = new ArrayList();
        private String name;
         public Institution(String name ) {
                // TODO Auto-generated constructor stub
                 this.name = name;
        }
         public void add(Unit unit) {
                list.add(unit);
        }
        @Override
        public void handleArchives() {
                // TODO Auto-generated method stub
                System.out.println(this.name+"接收并下发公文");
                for(Object object : list){
                        ((Unit)object).handleArchives();
                }
        }

}
