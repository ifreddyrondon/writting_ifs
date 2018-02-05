package entities;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Finder {
    private <T> Maybe<T> findAt(T element, List<T> list) {
        for(T e : list) {
            if ( e.equals(element) ) {
                return new Maybe<T>(e);
            }
        }

        return new Maybe();
    }

    public <T> T findAtIfAbsentThrow(List<T> list, T element, Throwable error) throws Throwable {
        Maybe<T> result = findAt(element, list);

        return result.valueOrThrow(error);
    }

    public <T> T findAtIfAbsentApply(List<T> list, T element, Function doSomething) {
        Maybe<T> result = findAt(element, list);

        return result.valueOrApply( doSomething, element );
    }

    public <T> T findAtIfAbsentDefault(List<T> list, T element, T defaultValue) {
        Maybe<T> result = findAt(element, list);

        return result.valueOrDefault( defaultValue );
    }
}
