/**
 * File: StudyPlan.java
 * Description: This module defines a study plan and its associated methods.
 * Author: Stephen Corns
 * Student ID: 2908741
 * Email ID: A2908741
 * AI Tool Used: Y
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.*;

public class StudyPlan {
    private final Queue<Integer> subjectOrder;
    private final int maxConcurrent;
    private final Graph g;
    private final Map<Integer, Vertex> vertices;
    private final Map<Integer, List<Edge>> edges;

    /**
     *
     * @param g
     * @param subjectOrder
     * @param maxConcurrent
     */
    public StudyPlan(Graph g, Queue<Integer> subjectOrder, int maxConcurrent) {
        this.subjectOrder = subjectOrder;
        this.maxConcurrent = maxConcurrent;
        this.g = g;
        this.vertices = g.getVertices();
        this.edges = g.getEdges();
    }

    /**
     *
     * @return
     */
    public List<List<String>> CreateStudyPlan() {
        List<List<String>> studyPlan = new ArrayList<>();

        while (!subjectOrder.isEmpty()) {

            int currentSubjects = 0;
            List<String> periodPlan = new ArrayList<>();

            while (!subjectOrder.isEmpty() &&
                    currentSubjects < maxConcurrent ) {

                int subjectId = subjectOrder.peek();

                if (PrerequisitesMet(subjectId)) {
                    String subject = g.getVertices().get(subjectId).getValue();
                    periodPlan.add(subject);
                    subjectOrder.remove();
                    currentSubjects++;
                } else {
                    subjectOrder.add(subjectOrder.remove());
                }
            }

            studyPlan.add(periodPlan);
        }
        return studyPlan;
    }

    /**
     *
     * todo: Create code to ensure prerequisites were met in a previous study period
     * @param subjectId
     * @return
     */
    /**
     * Returns true if ALL prerequisites of subjectId
     * have already been completed (i.e., not in subjectOrder anymore).
     */
    private boolean PrerequisitesMet(int subjectId) {
        return true;
    }

    /**
     *
     * @param plan
     */
    public void printPlan(List<List<String>> plan) {
        for (int i = 0; i < plan.size(); i++) {
            System.out.println("Study period " + (i + 1) + ": " + plan.get(i));
        }
    }
}
