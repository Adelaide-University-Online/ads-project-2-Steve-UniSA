import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VertexTest {

    @Test
    void getValue() {
        Vertex v = new Vertex(1, "Maths");
        assertEquals("Maths", v.getValue());
    }

    @Test
    void getId() {
        Vertex v = new Vertex(1, "Maths");
        assertEquals(1, v.getId());
    }

    @Test
    void testToString() {
        Vertex v = new Vertex(2, "Physics");
        assertEquals("id=2, value=Physics", v.toString());
    }
}