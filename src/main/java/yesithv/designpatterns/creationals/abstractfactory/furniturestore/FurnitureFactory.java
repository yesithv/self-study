package ironcoding.creationals.abstractfactory.furniturestore;

import ironcoding.creationals.abstractfactory.furniturestore.products.Chair;
import ironcoding.creationals.abstractfactory.furniturestore.products.Couch;
import ironcoding.creationals.abstractfactory.furniturestore.products.Table;

public interface FurnitureFactory {

    Chair createChair();

    Couch createCouch();

    Table createTable();

}
