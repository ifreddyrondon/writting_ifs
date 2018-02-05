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

public class TestFingingElementsOnArraysOfInteger {
    Finder finder;

    @Before
    public void setup() {
        finder = new Finder();
    }

    @Test(expected = CustomException.class)
    public void testFindingElementsWhichDoesntExistResultInThrowingException() throws Throwable {
        List<Integer> list = Arrays.asList(1,2,3,4);

        finder.findAtIfAbsentThrow(list, 9, new CustomException());
    }

    @Test
    public void testFindingElementsWhichExistResultInNotThrowingException() throws Throwable {
        List<Integer> list = Arrays.asList(1,2,3,4);

        Integer actual = finder.findAtIfAbsentThrow(list, 1, new CustomException());
        Integer expected = 1;

        assertEquals( expected, actual);

    }

    @Test
    public void testFindingElementsWhichDoesntExistResultInLambdaCall() {
        List<Integer> list = Arrays.asList(1,2,3,4);

        Function doSomething = Mockito.mock(Function.class);

        finder.findAtIfAbsentApply(list, 9, doSomething);
        verify(doSomething).apply(new Integer(9));

    }

    @Test
    public void testFindingElementsWhichDoesntExistResultInNotLambdaCall() {
        List<Integer> list = Arrays.asList(1,2,3,4);

        Function doSomething = Mockito.mock(Function.class);

        Integer actual = finder.findAtIfAbsentApply(list, 1, doSomething);
        Integer expected = 1;

        assertEquals( expected, actual);
        verify(doSomething, never()).apply(new Integer(9));
    }
}
