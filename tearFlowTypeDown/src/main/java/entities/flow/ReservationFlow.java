package entities.flow;

import entities.Word;

public class ReservationFlow implements Flow {
    @Override
    public String asString(Word w) {
        return w.asString(this);
    }
}
