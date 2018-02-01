package entities.flow;

import entities.Subscription;

public class FlowFactory {

    public Flow flowType(String flowType) {
        Flow result;
        switch (flowType) {
            case "R":
                result = new ReservationFlow();
            break;
            case "C":
                result = new ContractFlow();
            break;
            case "S":
                result = new Subscription();
            break;
            default:
                result = new ContractFlow();
            break;
        }

        return result;
    }
}
