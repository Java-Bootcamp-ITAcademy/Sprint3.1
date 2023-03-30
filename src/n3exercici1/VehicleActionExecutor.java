package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class VehicleActionExecutor {
    private List<ExecuteAction> actionsToExecute = new ArrayList<>();
    public void executeActions() {
        for(ExecuteAction action:actionsToExecute) {
            action.execute();
        }
    }
    public void fillActions(ExecuteAction executeAction) {
        actionsToExecute.add(executeAction);
    }

}
