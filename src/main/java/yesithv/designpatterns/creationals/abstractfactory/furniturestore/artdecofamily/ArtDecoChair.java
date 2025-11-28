package ironcoding.creationals.abstractfactory.furniturestore.artdecofamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Chair;

public class ArtDecoChair implements Chair {

    @Override
    public boolean hasLegs() {
        return Boolean.FALSE;
    }

    @Override
    public void sitOn() {

    }
}
