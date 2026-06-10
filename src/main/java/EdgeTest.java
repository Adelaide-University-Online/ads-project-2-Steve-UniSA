import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {

    @Test
    void getFrom() {
        Edge e = new Edge(1, 2, 1);
        assertEquals(1, e.getFrom());
    }

    @Test
    void getTo() {
        Edge e = new Edge(1, 2, 1);
        assertEquals(2, e.getTo());
    }

    @Test
    void getWeight() {
        Edge e = new Edge(1, 2, 1);
        assertEquals(1, e.getWeight());
    }

    @Test
    void testToString() {
        Edge e = new Edge(3, 4, 2);
        assertEquals("Edge: {from=3, to=4, weight=2}", e.toString());
    }
}