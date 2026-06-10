import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstSearchTest {

    @Test
    void testBFSOrderSimpleGraph() {
        List<String> dummyData =  new ArrayList<>();
        dummyData.add("A, B, C");
        dummyData.add("A, B");
        dummyData.add("B, C");
        Graph g = new Graph(dummyData);
        Map<Integer,Vertex> vertices = g.getVertices();

        BreadthFirstSearch bfs = new BreadthFirstSearch(g);
        Queue<Integer> result = bfs.Search();
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(3);
        expected.add(2);
        expected.add(1);

        assertEquals(expected, result);
    }
}