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
        Graph g = new Graph(dummyData);
        Map<Integer,Vertex> vertices = g.getVertices();
        assertEquals(3, vertices.size());
    }

    @Test
    void getEdges() {
//        List<String> dummyData =  new ArrayList<>();
//        dummyData.add("A, B, C");
//        dummyData.add("A, B");
//        dummyData.add("B, C");
//        Graph g = new Graph(dummyData);
//        Vertex v = g.getVertices().get(2);
//        Map<Integer,List<Edge>> e = g.getEdges();
//        Edge e1 = e.get(0).get(1);
//        assertEquals(0, e.get(0).size());
    }
}