import entities.Maybe;
import org.junit.Test;

import java.util.function.Function;

import static junit.framework.TestCase.assertEquals;

public class MaybeTest {
    @Test
    public void maybeValueWhichIsNotNullShouldReturnItself() {
        Maybe<Integer> optional = new Maybe<Integer>(1);
        Integer expected = 1;
        assertEquals(expected, optional.valueOrDefault(9));
    }

    @Test
    public void maybeValueWhichIsNullShouldReturnDefault() {
        Maybe<Integer> optional = new Maybe<Integer>();
        Integer expected = 9;
        assertEquals(expected, optional.valueOrDefault(9));
    }

    @Test( expected = Throwable.class)
    public void maybeValueWhichIsNullShouldThrowExceptionWhileGettingValue() {
        Maybe<Integer> optional = new Maybe<Integer>(null);
        optional.valueOrThrow(new IllegalAccessError());
    }

    @Test
    public void maybeValueWhichIsNullShouldNotThrowException() {
        Maybe<Integer> optional = new Maybe<Integer>(5);
        Integer expected = 5;
        assertEquals(expected, optional.valueOrThrow(new IllegalAccessError()) );
    }

    @Test
    public void maybeValueWhichIsNullShouldApplyFunction() {
        Maybe<Integer> optional = new Maybe<Integer>(null);

        Integer actual = optional.valueOrApply(Function.identity(), 1);
        Integer expected = 1;

        assertEquals( expected, actual);
    }

    @Test
    public void maybeValueWhichIsNotNullShouldReturnValue() {
        Maybe<Integer> optional = new Maybe<Integer>(9);

        Integer actual = optional.valueOrApply(Function.identity(), 6);
        Integer expected = 9;

        assertEquals( expected, actual);
    }
}
