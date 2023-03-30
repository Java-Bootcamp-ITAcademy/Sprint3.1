package n3exercici1;

/* Command brake */
public class VehicleActionBrake implements ExecuteAction {
    private VehicleAction vehicleActions;

    public VehicleActionBrake(VehicleAction vehicleActions) {
        this.vehicleActions = vehicleActions;
    }

    @Override
    public void execute() {
        vehicleActions.brake();
    }

}
