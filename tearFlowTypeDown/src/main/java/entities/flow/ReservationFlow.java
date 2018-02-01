package entities.flow;

import entities.WordForFlow;

public class ReservationFlow implements Flow {
    @Override
    public String asString2(WordForFlow word) {
        return word.asString2(this);
    }
}
