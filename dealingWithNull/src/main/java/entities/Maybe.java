package entities;

import java.util.function.Function; /**
 * Nowadays there is a similar concept on Java8 called Optional. We've created it for those
 * developers who run project under java7
 *
 * @param <T> Type of value wrapped by class
 *
 */
public class Maybe <T> {
    private final T value;

    public Maybe(T value) {

        this.value = value;
    }

    public Maybe() {

        this.value = null;
    }

    public <X extends Throwable> T valueOrThrow(X error) throws X {
        if (this.value == null) {
            throw error;
        }
        return this.value;
    }

    public T valueOrApply(Function doSomething, T arg) {
        if (this.value == null) {
            return (T) doSomething.apply(arg);
        }
        return this.value;
    }

    public T valueOrDefault(T defaultValue) {
        if (this.value == null) {
            return defaultValue;
        }
        return this.value;
    }
}
