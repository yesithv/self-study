package ironcoding.creationals.abstractfactory.furniturestore.artdecofamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Couch;

public class ArtDecoCouch implements Couch {

    @Override
    public Integer capacity() {
        return 3;
    }

    @Override
    public boolean isSleep() {
        return false;
    }
}
