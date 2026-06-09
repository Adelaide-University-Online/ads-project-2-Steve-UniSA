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
        List<String> periodPlan = new ArrayList<>();
        while (!subjectOrder.isEmpty()) {
            int subjectId = subjectOrder.poll();
            String subject = g.getVertices().get(subjectId).getValue();
            if(PrerequisitesMet(studyPlan, subject)) {
                periodPlan.add(subject);
                if(periodPlan.size() >= maxConcurrent) {
                    if(!periodPlan.isEmpty()) {
                        studyPlan.add(periodPlan);
                    }
                    periodPlan = new ArrayList<>();
                }
            } else {
                subjectOrder.offer(subjectId);
                if(!periodPlan.isEmpty()) {
                    studyPlan.add(periodPlan);
                }
                periodPlan = new ArrayList<>();
            }
        }
        if(!periodPlan.isEmpty()) {
            studyPlan.add(periodPlan);
        }
        return studyPlan;
    }

    /**
     *
     * @param studyPlan
     * @param subject
     * @return
     */
    private boolean PrerequisitesMet(List<List<String>> studyPlan, String subject) {
        List<String> prerequisites = getPrerequisites(subject);
        for (String prerequisite : prerequisites) {
            boolean prerequisiteFound = false;
            for (List<String> periodPlan : studyPlan) {
                if (periodPlan.contains(prerequisite)) {
                    prerequisiteFound = true;
                }
            }
            if (!prerequisiteFound) {
                return false;
            }
        }
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

    /**
     *
     * @param subject
     * @return
     */
    public List<String> getPrerequisites(String subject) {
        List<String> prerequisites = new ArrayList<>();
        Integer subjectId = null;
        for (Map.Entry<Integer, Vertex> entry : vertices.entrySet()) {
            if (entry.getValue().getValue().equals(subject)) {
                subjectId = entry.getKey();
                break;
            }
        }
        if (subjectId == null) {
            return prerequisites; // subject not found
        }
        for (List<Edge> edgeList : edges.values()) {
            for (Edge e : edgeList) {
                if (e.getTo() == subjectId) {
                    prerequisites.add(vertices.get(e.getFrom()).getValue());
                }
            }
        }
        return prerequisites;
    }
}
