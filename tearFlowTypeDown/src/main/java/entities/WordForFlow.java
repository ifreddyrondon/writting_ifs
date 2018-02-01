package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;

public interface WordForFlow {
    String asString2(ContractFlow flow);
    String asString2(ReservationFlow flow);
    String asString2(Subscription flow);
}
