package entities.flow;

import entities.Word;

public class ContractFlow implements Flow {
    @Override
    public String asString(Word w) {
        return w.asString(this);
    }
}
