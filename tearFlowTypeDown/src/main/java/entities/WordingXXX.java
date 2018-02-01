package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;
import entities.flow.SubscriptionFlow;

public class WordingXXX implements Word {
    @Override
    public String asString(ContractFlow flow) {
        return "Preparando todo para tu pago";
    }

    @Override
    public String asString(ReservationFlow flow) {
        return "Preparando  todo para tu reserva";
    }

    @Override
    public String asString(SubscriptionFlow flow) {
        return "XXXXX";
    }
}
