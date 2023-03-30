package n3exercici1;

/* Command start */
public class VehicleActionStart implements ExecuteAction {
    private VehicleAction vehicleActions;

    public VehicleActionStart(VehicleAction vehicleActions) {
        this.vehicleActions = vehicleActions;
    }

    @Override
    public void execute() {
        vehicleActions.start();
    }
}
