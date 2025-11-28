package ironcoding.creationals.abstractfactory.furniturestore;

import ironcoding.creationals.abstractfactory.furniturestore.modernfamily.ModernChair;
import ironcoding.creationals.abstractfactory.furniturestore.modernfamily.ModernCouch;
import ironcoding.creationals.abstractfactory.furniturestore.modernfamily.ModernTable;
import ironcoding.creationals.abstractfactory.furniturestore.products.Chair;
import ironcoding.creationals.abstractfactory.furniturestore.products.Couch;
import ironcoding.creationals.abstractfactory.furniturestore.products.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Couch createCouch() {
        return new ModernCouch();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
