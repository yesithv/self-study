package ironcoding.creationals.abstractfactory.furniturestore.victorianfamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Couch;

public class VictorianCouch implements Couch {

    @Override
    public Integer capacity() {
        return 3;
    }

    @Override
    public boolean isSleep() {
        return true;
    }
}
