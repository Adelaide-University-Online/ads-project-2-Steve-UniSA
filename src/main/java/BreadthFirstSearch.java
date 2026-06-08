/**
 * File: BreadthFirstSearch.java
 * Description: This module defines a BFS and its associated methods.
 * Author: Stephen Corns
 * Student ID: 2908741
 * Email ID: A2908741
 * AI Tool Used: Y
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.*;

public class BreadthFirstSearch {
    private Graph g;
    private Queue<Integer> visitedVertices = new LinkedList<>();
    private Queue<Integer> identifiedVertices = new LinkedList<Integer>();

    /**
     *
     * @param g
     */
    public BreadthFirstSearch(Graph g) {
        this.g = g;
        this.identifiedVertices = FindStartVertices();
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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
