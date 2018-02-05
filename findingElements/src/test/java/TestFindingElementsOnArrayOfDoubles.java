import entities.Finder;
import entities.CustomException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class TestFindingElementsOnArrayOfDoubles {
    Finder finder;

    @Before
    public void setup() {
        finder = new Finder();
    }

    @Test(expected = CustomException.class)
    public void testFindingElementsWhichDoesNotExistResultInThrowingException() throws Throwable {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        finder.findAtIfAbsentThrow(list,9.0, new CustomException());
    }

    @Test
    public void testFindingElementsWhichExistResultInNotThrowingException() throws Throwable {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        Double actual = finder.findAtIfAbsentThrow(list,1.0, new CustomException());
        Double expected = 1.0;

        assertEquals( expected, actual);
    }

    @Test
    public void testFindingElementsWhichDoesntExistResultInLambdaCall() {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        Function doSomething = Mockito.mock(Function.class);

        finder.findAtIfAbsentApply(list, 9.0, doSomething);
        verify(doSomething).apply(9.0);

    }

    @Test
    public void testFindingElementsWhichDoesntExistResultInNotLambdaCall() {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        Function doSomething = Mockito.mock(Function.class);

        Double actual = finder.findAtIfAbsentApply(list, 1.0, doSomething);
        Double expected = 1.0;

        assertEquals( expected, actual);
        verify(doSomething, never()).apply(1.0);
    }

    @Test
    public void testFindingElementsWhichDoesntExistResultInGettingDefaultValue() {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        Double actual = finder.findAtIfAbsentDefault(list, 55.0, 9.0);
        Double expected = 9.0;

        assertEquals( expected, actual);
    }

    @Test
    public void testFindingElementsWhichExistResultInGettingValue() {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0);

        Double actual = finder.findAtIfAbsentDefault(list, 3.0, 9.0);
        Double expected = 3.0;

        assertEquals( expected, actual);
    }

}
