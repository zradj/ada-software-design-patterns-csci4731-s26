package az.edu.ada.modules.module02.lecture06;

public class TruckDelivery extends Delivery {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
