package n3exercici1.Client;

import n3exercici1.Commands.VehicleActionAccelerate;
import n3exercici1.Commands.VehicleActionBrake;
import n3exercici1.Commands.VehicleActionStart;
import n3exercici1.Invoker.VehicleActionExecutor;
import n3exercici1.Receiver.BicycleAction;
import n3exercici1.Receiver.BoatAction;
import n3exercici1.Receiver.CarAction;
import n3exercici1.Receiver.PlaneAction;

public class Main {
    public static void main(String[] args) {
        VehicleActionExecutor vehicleActionExecutor=new VehicleActionExecutor();
        vehicleActionExecutor.fillActions(new VehicleActionAccelerate(new CarAction()));
        vehicleActionExecutor.fillActions(new VehicleActionAccelerate(new BicycleAction()));
        vehicleActionExecutor.fillActions(new VehicleActionBrake(new BoatAction()));
        vehicleActionExecutor.fillActions(new VehicleActionStart(new PlaneAction()));
        vehicleActionExecutor.executeActions();

    }
}
