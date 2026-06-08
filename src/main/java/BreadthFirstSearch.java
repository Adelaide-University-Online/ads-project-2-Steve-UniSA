import java.util.*;

public class BreadthFirstSearch {
    private Graph g;

    public BreadthFirstSearch(Graph g) {
        this.g = g;
    }

    public void FindStartVertices() {
        // Find subjects without prerequisites
        HashSet<Integer> allSubjects = new HashSet<Integer>();
        HashSet<Integer> subjectsWithPrerequisites = new HashSet<Integer>();
        for(int v : g.getVertices().keySet()) {
            allSubjects.add(v);
            for(Edge e : g.getEdges().get(v)) {
                subjectsWithPrerequisites.add(e.getTo());
            }
        }
        HashSet<Integer> subjectsWithoutPrerequisites = new HashSet<>(allSubjects);
        subjectsWithoutPrerequisites.removeAll(subjectsWithPrerequisites);

        for(int v : subjectsWithoutPrerequisites) {
            System.out.println(v);
        }
    }
}
