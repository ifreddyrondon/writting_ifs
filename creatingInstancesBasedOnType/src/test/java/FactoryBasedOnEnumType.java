/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import dummies.*;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertTrue;

public class FactoryBasedOnEnumType {
    @Test
    public void testFactoryCreateObjectTypedDefault() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        FactoryBasedOnType<AnInterface, EnumKey> factory = new FactoryBasedOnType(DefaultClass.class);

        AnInterface actual = factory.createType(EnumKey.Key0, "Constructor Arg");
        AnInterface expected = new DefaultClass("Constructor Arg");

        assertTrue(expected.equlas(actual));

    }

    @Test
    public void testFactoryCreateObjectTypedConstructingObjectWithTwoArguments() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        FactoryBasedOnType<AnInterface,EnumKey> factory = new FactoryBasedOnType(DefaultClass.class);

        factory.map(EnumKey.Key1, TypeOneClass.class);

        AnInterface actual = factory.createType(EnumKey.Key1, 1, "str arg");
        AnInterface expected = new TypeOneClass(1, "str arg");

        assertTrue(expected.equlas(actual));

    }

    @Test
    public void testFactoryCreateObjectTypedConstructingObjectWithThreeArguments() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        FactoryBasedOnType<AnInterface,EnumKey> factory = new FactoryBasedOnType(DefaultClass.class);

        factory.map(EnumKey.Key2, TypeTwoClass.class);

        AnInterface actual = factory.createType(EnumKey.Key2, 1, "str arg", 2.0);
        AnInterface expected = new TypeTwoClass(1, "str arg", 2.0);

        assertTrue(expected.equlas(actual));

    }

    @Test
    public void testFactoryCreateObjectTypedAsSpecified() throws InstantiationException, IllegalAccessException {
        FactoryBasedOnType<AnInterface, EnumKey> factory = new FactoryBasedOnType(DefaultClass.class);

        factory.map(EnumKey.Key0, TypeZeroClass.class);

        AnInterface actual = factory.createType(EnumKey.Key0);
        AnInterface expected = new TypeZeroClass();

        assertTrue(expected.equlas(actual));

    }
}