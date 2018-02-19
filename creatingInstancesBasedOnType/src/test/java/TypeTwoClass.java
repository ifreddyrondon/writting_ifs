
public class TypeTwoClass implements AnInterface {
    private final String s;
    private final Integer i;
    private final Double d;

    public TypeTwoClass(Integer i, String s, Double d) {
        this.i = i;
        this.s = s;
        this.d = d;
    }

    @Override
    public boolean equlas(Object another) {
        if (another.getClass().equals(this.getClass())) {
            TypeTwoClass other = (TypeTwoClass)another;
            return
                this.i.equals( other.i ) &&
                this.s.equals( other.s ) &&
                this.d.equals( other.d );
        }

        return false;

    }
}
