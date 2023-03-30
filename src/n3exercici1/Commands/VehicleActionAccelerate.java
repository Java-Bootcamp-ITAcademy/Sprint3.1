package n3exercici1.Commands;

import n3exercici1.Receiver.VehicleAction;

/* Command accelerate */
public class VehicleActionAccelerate implements ExecuteAction {
    private VehicleAction vehicleActions;

    public VehicleActionAccelerate(VehicleAction vehicleActions) {
        this.vehicleActions = vehicleActions;
    }

    @Override
    public void execute() {
        vehicleActions.accelerate();
    }
}
