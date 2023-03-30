package n3exercici1.Receiver;

/* Implementing methods for a plane */
public class PlaneAction implements VehicleAction {

    @Override
    public void start() {
        System.out.println("This a plane. Take it easy");
    }

    @Override
    public void accelerate() {
        System.out.println("Hurry, man! We are overflying Syria");
    }

    @Override
    public void brake() {
        System.out.println("Smooth or passengers will disapprove");
    }
}
