package ironcoding.creationals.abstractfactory.furniturestore.victorianfamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Table;

public class VictorianTable implements Table {

    @Override
    public Integer capacity() {
        return 6;
    }

    @Override
    public boolean isSquare() {
        return false;
    }
}
