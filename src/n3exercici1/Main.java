package n3exercici1;

import java.util.ArrayList;
import java.util.List;

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
