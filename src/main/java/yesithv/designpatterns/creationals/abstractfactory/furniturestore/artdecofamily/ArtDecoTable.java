package ironcoding.creationals.abstractfactory.furniturestore.artdecofamily;

import ironcoding.creationals.abstractfactory.furniturestore.products.Table;

public class ArtDecoTable implements Table {

    @Override
    public Integer capacity() {
        return 4;
    }

    @Override
    public boolean isSquare() {
        return true;
    }
}
