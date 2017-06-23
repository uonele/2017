package StructuredPattern.Adapter_Class;

public class Client {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                CreateDog dog = new CreateDog();
                CreateCat cat=(CreateCat)XMLUtil.getBean();
                System.out.print("初始化了一只猫，");
                Adapt adapt = new Adapt();
                adapt.setCat(cat);
                adapt.setDog(dog);
                
                adapt.catchMouse();
                adapt.bark();
        }

}
