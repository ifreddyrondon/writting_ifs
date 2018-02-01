package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;

public class
implements WordForFlow {
    @Override
    public String asString2(ContractFlow flow) {
        return "Titulo de modal para contract";
    }

    @Override
    public String asString2(ReservationFlow flow) {
        return "Titulo de modal para reservation";
    }

    @Override
    public String asString2(Subscription flow) {
        return "Titulo de modal para contract";
    }
}
