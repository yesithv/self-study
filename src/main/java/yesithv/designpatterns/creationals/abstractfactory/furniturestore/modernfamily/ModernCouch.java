package ironcoding.creationals.abstractfactory.furniturestore.modernfamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Couch;

public class ModernCouch implements Couch {

    @Override
    public Integer capacity() {
        return 2;
    }

    @Override
    public boolean isSleep() {
        return false;
    }
}
