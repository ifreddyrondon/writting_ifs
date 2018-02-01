package entities;

import entities.flow.ContractFlow;
import entities.flow.ReservationFlow;
import entities.flow.SubscriptionFlow;

public interface Word {
    String asString(ContractFlow flow);
    String asString(ReservationFlow flow);
    String asString(SubscriptionFlow flow);
}
