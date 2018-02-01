package entities.flow;

import entities.WordForFlow;

public class ContractFlow implements Flow {
    @Override
    public String asString2(WordForFlow modalTitle) {
        return modalTitle.asString2(this);
    }
}
