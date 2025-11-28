package ironcoding.creationals.abstractfactory.furniturestore.victorianfamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Chair;

public class VictorianChair implements Chair {

    @Override
    public boolean hasLegs() {
        return Boolean.TRUE;
    }

    @Override
    public void sitOn() {

    }
}
