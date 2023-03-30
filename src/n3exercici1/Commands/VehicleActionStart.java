package n3exercici1.Commands;

import n3exercici1.Receiver.VehicleAction;

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
