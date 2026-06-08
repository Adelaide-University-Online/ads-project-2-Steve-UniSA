import java.util.*;

public class BreadthFirstSearch {
    private Graph g;
    private Queue<Integer> visitedVertices = new LinkedList<>();
    private Queue<Integer> identifiedVertices = new LinkedList<Integer>();

    public BreadthFirstSearch(Graph g) {
        this.g = g;
        this.identifiedVertices = FindStartVertices();
    }

    private Queue<Integer> FindStartVertices() {
        // Find subjects without prerequisites
        Queue<Integer> allSubjects = new LinkedList<Integer>();
        Queue<Integer> subjectsWithPrerequisites = new LinkedList<Integer>();
        for(int v : g.getVertices().keySet()) {
            allSubjects.add(v);
            for(Edge e : g.getEdges().get(v)) {
                subjectsWithPrerequisites.add(e.getTo());
            }
        }
        Queue<Integer> subjectsWithoutPrerequisites = new LinkedList<>(allSubjects);
        subjectsWithoutPrerequisites.removeAll(subjectsWithPrerequisites);
        return subjectsWithoutPrerequisites;
    }

    public Queue<Integer> Search() {
        while(!identifiedVertices.isEmpty()) {
            int currentVertex = identifiedVertices.poll();
            visitedVertices.add(currentVertex);
            //find neighbours
            for(Edge e : g.getEdges().get(currentVertex)) {
                if(!identifiedVertices.contains(e.getTo())) {
                    identifiedVertices.add(e.getTo());
                }
            }
        }
        return visitedVertices;
    }
}
