package ironcoding.creationals.factorymetod.transportapp;

public class TruckCreator extends Creator {

    @Override
    Transport createTransport() {
        return new Truck();
    }

    @Override
    void generateBill() {

    }

}
