package n3exercici1;

/* Implementing methods for a car */
public class CarAction implements VehicleAction {

    @Override
    public void start() {
        System.out.println("Where the f*** are the keys?");
    }

    @Override
    public void accelerate() {
        System.out.println("YOLO, so step the pedal!");
    }

    @Override
    public void brake() {
        System.out.println("Well...YOLO but careful about da police");
    }
}
