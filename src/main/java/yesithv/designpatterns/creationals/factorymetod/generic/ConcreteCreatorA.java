package ironcoding.creationals.factorymetod.generic;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ProductA();
    }

    @Override
    public void someOperation() {

    }
}
