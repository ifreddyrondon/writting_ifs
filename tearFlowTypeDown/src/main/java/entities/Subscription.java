package entities;

import entities.flow.Flow;

public class Subscription implements Flow {
    @Override
    public String asString2(WordForFlow modalTitle) {
        return modalTitle.asString2(this);
    }

}
