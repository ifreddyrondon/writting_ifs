import entities.*;
import entities.flow.Flow;
import entities.flow.FlowFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestReservationSubtitle {

    @Test
    public void testModealTitleFlowSubscriptions() {
        Flow flow = new FlowFactory().flowType("S");
        WordForFlow modalTitle = new ModalTitle();

        assertEquals(flow.asString2(modalTitle), "Titulo de modal para contract");
    }

    @Test
    public void testModealTitleFlowDefault() {
        Flow flow = new FlowFactory().flowType("");
        WordForFlow modalTitle = new ModalTitle();

        assertEquals(flow.asString2(modalTitle), "Titulo de modal para contract");
    }

    @Test
    public void testModealTitleFlowReservation() {
        Flow flow = new FlowFactory().flowType("R");
        WordForFlow modalTitle = new ModalTitle();

        assertEquals(flow.asString2(modalTitle), "Titulo de modal para reservation");
    }

    @Test
    public void testSubtitleGetReadyToPayFlowDefault() {
        Flow flow = new FlowFactory().flowType("C");
        GetReadyToPay title = new GetReadyToPay();

        assertEquals(flow.asString2(title), "Preparando todo para tu pago");
    }

    @Test
    public void testSubtitleGetReadyToPayFlowReservation() {
        Flow flow = new FlowFactory().flowType("R");
        GetReadyToPay title = new GetReadyToPay();

        assertEquals(flow.asString2(title), "Preparando  todo para tu reserva");
    }

    @Test
    public void testSubtitleGetReadyToPayFlowSubscriptions() {
        Flow flow = new FlowFactory().flowType("S");
        GetReadyToPay title = new GetReadyToPay();

        assertEquals(flow.asString2(title), "XXXXX");
    }

    @Test
    public void testQueseYouFlowSubscriptions() {
        Flow flow = new FlowFactory().flowType("S");
        WordForFlow title = new QueSeYou();

        assertEquals(flow.asString2(title), "Que se you");
    }
}
