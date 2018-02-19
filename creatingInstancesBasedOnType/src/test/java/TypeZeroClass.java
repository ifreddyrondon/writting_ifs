public class TypeZeroClass implements AnInterface {
    public TypeZeroClass() {

    }
    @Override
    public boolean equlas(Object another) {
        return this.getClass().equals(another.getClass());
    }
}
