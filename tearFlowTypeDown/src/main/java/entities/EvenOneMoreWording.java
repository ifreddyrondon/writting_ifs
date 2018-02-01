package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;
import entities.flow.SubscriptionFlow;

public class EvenOneMoreWording implements Word {
    @Override
    public String asString(ContractFlow flow) {
        return "agregar wording";
    }

    @Override
    public String asString(ReservationFlow flow) {
        return "agregar wording";
    }

    @Override
    public String asString(SubscriptionFlow flow) {
        return "Que se you";
    }
}
