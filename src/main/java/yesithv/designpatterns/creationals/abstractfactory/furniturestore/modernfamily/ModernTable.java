package ironcoding.creationals.abstractfactory.furniturestore.modernfamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Table;

public class ModernTable implements Table {

    @Override
    public Integer capacity() {
        return 5;
    }

    @Override
    public boolean isSquare() {
        return false;
    }
}
