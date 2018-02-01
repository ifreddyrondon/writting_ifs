package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;

public class QueSeYou implements WordForFlow {
    @Override
    public String asString2(ContractFlow flow) {
        return null;
    }

    @Override
    public String asString2(ReservationFlow flow) {
        return null;
    }

    @Override
    public String asString2(Subscription flow) {
        return "Que se you";
    }
}
