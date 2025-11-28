package ironcoding.creationals.factorymetod.generic;

public class ConcreteCreationB extends Creator {

    @Override
    public Product createProduct() {
        return new ProductB();
    }

    @Override
    public void someOperation() {

    }
}
