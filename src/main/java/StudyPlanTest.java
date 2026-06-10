import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class StudyPlanTest {

    @Test
    void createStudyPlan() {
//        Graph g = new Graph("dummy.txt");
//        g.addVertex(1, "A");
//        g.addVertex(2, "B");
//        g.addVertex(3, "C");
//
//        g.addEdge(1, 2, 1); // A → B
//        g.addEdge(2, 3, 1); // B → C
//
//        Queue<Integer> order = new LinkedList<>();
//        order.add(1);
//        order.add(2);
//        order.add(3);
//
//        StudyPlan sp = new StudyPlan(g, order, 1);
//        List<List<String>> plan = sp.CreateStudyPlan();
//
//        assertEquals(3, plan.size());
//        assertEquals(List.of("A"), plan.get(0));
//        assertEquals(List.of("B"), plan.get(1));
//        assertEquals(List.of("C"), plan.get(2));
    }

    @Test
    void PrerequisitesMet() {
//        Graph g = new Graph("dummy.txt");
//        g.addVertex(1, "A");
//        g.addVertex(2, "B");
//
//        g.addEdge(1, 2, 1); // A → B
//
//        Queue<Integer> order = new LinkedList<>();
//        order.add(1);
//        order.add(2);
//
//        StudyPlan sp = new StudyPlan(g, order, 2);
//        List<List<String>> plan = sp.CreateStudyPlan();
//
//        assertEquals(2, plan.get(0).size());
//        assertEquals(List.of("A", "B"), plan.get(0));
    }

    @Test
    void printPlan() {
    }

    @Test
    void getPrerequisites() {
//        Graph g = new Graph("dummy.txt");
//        g.addVertex(1, "A");
//        g.addVertex(2, "B");
//
//        g.addEdge(1, 2, 1);
//
//        StudyPlan sp = new StudyPlan(g, new LinkedList<>(), 1);
//
//        List<String> prereqs = sp.getPrerequisites("B");
//
//        assertEquals(1, prereqs.size());
//        assertEquals("A", prereqs.get(0));
    }
}