package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;

public class GetReadyToPay implements WordForFlow {
    @Override
    public String asString2(ContractFlow flow) {
        return "Preparando todo para tu pago";
    }

    @Override
    public String asString2(ReservationFlow flow) {
        return "Preparando  todo para tu reserva";
    }

    @Override
    public String asString2(Subscription flow) {
        return "XXXXX";
    }
}
