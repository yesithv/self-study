package ironcoding.creationals.factorymetod.transportapp;

public class ShipCreator extends Creator {

    @Override
    Transport createTransport() {
        return new Ship();
    }

    @Override
    void generateBill() {

    }
}
