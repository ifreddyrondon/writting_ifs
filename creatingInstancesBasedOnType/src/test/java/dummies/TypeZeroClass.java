package dummies;

public class TypeZeroClass implements AnInterface {
    @Override
    public boolean equlas(Object another) {
        return this.getClass().equals(another.getClass());
    }
}
