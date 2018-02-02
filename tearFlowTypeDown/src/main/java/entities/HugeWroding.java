package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;
import entities.flow.SubscriptionFlow;

public class HugeWroding implements Word {
    @Override
    public String asString(ContractFlow flow) {
        return "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
    }

    @Override
    public String asString(ReservationFlow flow) {
        return "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
    }

    @Override
    public String asString(SubscriptionFlow flow) {
        return "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
    }
}
