package n3exercici1;

/* Implementing methods for a bicycle */
public class BicycleAction implements VehicleAction {

    @Override
    public void start() {
        System.out.println("You better have strong legs, maid!");
    }

    @Override
    public void accelerate() {
        System.out.println("Hurry, boy! Your mom is near to catch you");
    }

    @Override
    public void brake() {
        System.out.println("Easy, tiger!");
    }
}
