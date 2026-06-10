import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void getVertices() {
        List<String> dummyData =  new ArrayList<>();
        dummyData.add("A, B, C");
        dummyData.add("A, B");
        dummyData.add("B, C");
        Graph g = new Graph(dummyData);
        assertEquals(g.getVertices().toString(), "{1=id=1, value=A, 2=id=2, value=B, 3=id=3, value=C}");
    }

    @Test
    void getEdges() {
        List<String> dummyData =  new ArrayList<>();
        dummyData.add("A, B, C");
        dummyData.add("A, B");
        dummyData.add("B, C");
        Graph g = new Graph(dummyData);
        assertEquals(g.getEdges().toString(), "{1=[], 2=[Edge: {from=2, to=1, weight=1}], 3=[Edge: {from=3, to=2, weight=1}]}");
    }
}