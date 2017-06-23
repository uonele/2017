package StructuredPattern.Adapt_Object_TODO;

public class Adapt implements Cat,Dog{
        private Cat cat;
        private Dog dog;
        public void setCat(Cat cat) {
                this.cat = cat;
        }
        public void setDog(Dog dog) {
                this.dog = dog;
        }
        
        @Override
        public void bark() {
                // TODO Auto-generated method stub
                dog.bark();
        }

        @Override
        public void catchMouse() {
                // TODO Auto-generated method stub
                cat.catchMouse();
        }
        public void catBark() {
                dog.bark();
        }
        public void dogCatchMouse() {
                cat.catchMouse();
        }

}
