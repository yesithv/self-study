package ironcoding.creationals.abstractfactory.furniturestore;

import ironcoding.creationals.abstractfactory.furniturestore.artdecofamily.ArtDecoChair;
import ironcoding.creationals.abstractfactory.furniturestore.artdecofamily.ArtDecoCouch;
import ironcoding.creationals.abstractfactory.furniturestore.artdecofamily.ArtDecoTable;
import ironcoding.creationals.abstractfactory.furniturestore.products.Chair;
import ironcoding.creationals.abstractfactory.furniturestore.products.Couch;
import ironcoding.creationals.abstractfactory.furniturestore.products.Table;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Couch createCouch() {
        return new ArtDecoCouch();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
}
