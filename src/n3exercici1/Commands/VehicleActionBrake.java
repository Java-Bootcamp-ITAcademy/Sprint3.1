package n3exercici1.Commands;

import n3exercici1.Receiver.VehicleAction;

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
