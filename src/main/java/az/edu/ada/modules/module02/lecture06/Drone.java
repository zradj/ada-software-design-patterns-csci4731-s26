package az.edu.ada.modules.module02.lecture06;

public class Drone implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by drone");
    }
}
