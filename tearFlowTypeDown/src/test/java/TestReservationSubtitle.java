import entities.*;
import entities.flow.Flow;
import entities.flow.FlowFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestReservationSubtitle {

    @Test
    public void testModealTitleFlowSubscriptions3() {
        Flow flow = new FlowFactory().flowType("S");
        Word modalTitle = new TinyWroding();

        // We don't care about this test. We only want IDE to compile classes
        assertEquals(1,1);
    }

    @Test
    public void testModealTitleFlowSubscriptions2() {
        Flow flow = new FlowFactory().flowType("S");
        Word modalTitle = new HugeWroding();

        // We don't care about this test. We only want IDE to compile classes
        assertEquals(1,1);    }

    @Test
    public void testModealTitleFlowSubscriptions() {
        Flow flow = new FlowFactory().flowType("S");
        Word modalTitle = new AnotherWording();

        assertEquals(flow.asString(modalTitle), "Titulo de modal para contract");
    }

    @Test
    public void testModealTitleFlowDefault() {
        Flow flow = new FlowFactory().flowType("");
        Word modalTitle = new AnotherWording();

        assertEquals(flow.asString(modalTitle), "Titulo de modal para contract");
    }

    @Test
    public void testModealTitleFlowReservation() {
        Flow flow = new FlowFactory().flowType("R");
        Word modalTitle = new AnotherWording();

        assertEquals(flow.asString(modalTitle), "Titulo de modal para reservation");
    }

    @Test
    public void testSubtitleGetReadyToPayFlowDefault() {
        Flow flow = new FlowFactory().flowType("C");
        WordingXXX title = new WordingXXX();

        assertEquals(flow.asString(title), "Preparando todo para tu pago");
    }

    @Test
    public void testSubtitleGetReadyToPayFlowReservation() {
        Flow flow = new FlowFactory().flowType("R");
        WordingXXX title = new WordingXXX();

        assertEquals(flow.asString(title), "Preparando  todo para tu reserva");
    }

    @Test
    public void testSubtitleGetReadyToPayFlowSubscriptions() {
        Flow flow = new FlowFactory().flowType("S");
        WordingXXX title = new WordingXXX();

        assertEquals(flow.asString(title), "XXXXX");
    }

    @Test
    public void testQueseYouFlowSubscriptions() {
        Flow flow = new FlowFactory().flowType("S");
        Word title = new EvenOneMoreWording();

        assertEquals(flow.asString(title), "Que se you");
    }
}
