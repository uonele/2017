package StructuredPattern.Composite;

public class Office extends Unit {
        private String name;
        public  Office(String name) {
                // TODO Auto-generated constructor stub
                this.name = name;
        }
        @Override
        public void handleArchives() {
                // TODO Auto-generated method stub
                System.out.println(this.name+"下发公文");
        }

}
