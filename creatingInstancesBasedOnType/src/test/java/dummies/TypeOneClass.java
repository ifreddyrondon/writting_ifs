package dummies;

public class TypeOneClass implements AnInterface {
    private final String s;
    private final Integer i;

    public TypeOneClass(Integer i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public boolean equlas(Object another) {
        if (another.getClass().equals(this.getClass())) {
            TypeOneClass other = (TypeOneClass)another;
            return this.i.equals( other.i ) && this.s.equals( other.s );
        }

        return false;
    }
}
