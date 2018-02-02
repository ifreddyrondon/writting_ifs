package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;
import entities.flow.SubscriptionFlow;

public class TinyWroding implements Word {
    @Override
    public String asString(ContractFlow flow) {
        return "";
    }

    @Override
    public String asString(ReservationFlow flow) {
        return "";
    }

    @Override
    public String asString(SubscriptionFlow flow) {
        return "";
    }
}
