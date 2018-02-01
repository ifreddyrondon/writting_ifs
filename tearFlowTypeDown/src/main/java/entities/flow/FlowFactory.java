package entities.flow;

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
                result = new SubscriptionFlow();
            break;
            default:
                result = new ContractFlow();
            break;
        }

        return result;
    }
}
