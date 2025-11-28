package ironcoding.creationals.abstractfactory.furniturestore;

import ironcoding.creationals.abstractfactory.furniturestore.products.Chair;
import ironcoding.creationals.abstractfactory.furniturestore.products.Couch;
import ironcoding.creationals.abstractfactory.furniturestore.products.Table;
import ironcoding.creationals.abstractfactory.furniturestore.victorianfamily.VictorianChair;
import ironcoding.creationals.abstractfactory.furniturestore.victorianfamily.VictorianCouch;
import ironcoding.creationals.abstractfactory.furniturestore.victorianfamily.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Couch createCouch() {
        return new VictorianCouch();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
