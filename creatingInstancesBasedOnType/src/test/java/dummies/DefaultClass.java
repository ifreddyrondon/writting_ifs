package dummies;

public class DefaultClass implements AnInterface {
    private final String arg;

    public DefaultClass(String arg) {
        this.arg = arg;
    }

    @Override
    public boolean equlas(Object another) {
        if (another.getClass().equals(this.getClass())) {
            DefaultClass other = (DefaultClass)another;
            return this.arg.equals( other.arg );
        }

        return false;
    }
}
