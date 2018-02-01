package entities.flow;

import entities.Word;
import entities.flow.Flow;

public class SubscriptionFlow implements Flow {
    @Override
    public String asString(Word w) {
        return w.asString(this);
    }

}
