import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyPlanTest {

    @Test
    void createStudyPlan() {
        List<String> dummyData =  new ArrayList<>();
        dummyData.add("A, B, C");
        dummyData.add("A, B");
        dummyData.add("B, C");
        Graph g = new Graph(dummyData);
        Map<Integer,Vertex> vertices = g.getVertices();

        BreadthFirstSearch bfs = new BreadthFirstSearch(g);
        Queue<Integer> result = bfs.Search();
        StudyPlan sp = new StudyPlan(g, result, 1);
        List<List<String>>plan = sp.CreateStudyPlan();

        assertEquals(plan.get(0).get(0), "C");
        assertEquals(plan.get(1).get(0), "B");
        assertEquals(plan.get(2).get(0), "A");

    }
}