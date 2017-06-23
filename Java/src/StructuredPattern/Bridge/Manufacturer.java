package StructuredPattern.Bridge;

abstract class Manufacturer {
        protected Implementor implementor;
        public abstract void produce();
        public void  setImplementor(Implementor implementor) {
                this.implementor = implementor;
        };
}
