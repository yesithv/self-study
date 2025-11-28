package ironcoding.creationals.abstractfactory.furniturestore.modernfamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Chair;

public class ModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return Boolean.FALSE;
    }

    @Override
    public void sitOn() {

    }
}
