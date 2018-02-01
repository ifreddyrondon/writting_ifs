package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;
import entities.flow.SubscriptionFlow;

public class AnotherWording implements Word {
    @Override
    public String asString(ContractFlow flow) {
        return "Titulo de modal para contract";
    }

    @Override
    public String asString(ReservationFlow flow) {
        return "Titulo de modal para reservation";
    }

    @Override
    public String asString(SubscriptionFlow flow) {
        return "Titulo de modal para contract";
    }
}
