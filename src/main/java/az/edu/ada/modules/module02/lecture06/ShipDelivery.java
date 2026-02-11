package az.edu.ada.modules.module02.lecture06;

public class ShipDelivery extends Delivery {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
