package n3exercici1;

/* Implementing methods for a boat */
public class BoatAction implements VehicleAction {
    @Override
    public void start() {
        System.out.println("Enjoy the view...before you get dizzy");
    }

    @Override
    public void accelerate() {
        System.out.println("Can you feel that? It'll take 21.9h instead of 22h");
    }

    @Override
    public void brake() {
        System.out.println("Can even a boat break?");
    }
}
