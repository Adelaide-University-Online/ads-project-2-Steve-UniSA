/**
 * File: Graph.java
 * Description: This module defines a graph and its associated methods.
 * Author: Stephen Corns
 * Student ID: 2908741
 * Email ID: A2908741
 * AI Tool Used: Y
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    // Create two HashMaps to save vertices and edges. Vertices will be id and vertex object,
    // while the hashmap of edges will get the vertex id and list of edge objects.
    /**
     * Create two HashMaps to save vertices and edges. Vertices will be id and vertex object,
     * while the hashmap of edges will get the vertex id and list of edge objects.
     */
    private Map<Integer,Vertex> vertices = new HashMap<>();
    private Map<Integer, List<Edge>> edges = new HashMap<>();

    /**
     *
     * @param filePath
     */
    public Graph(String filePath) {
        loadFile(filePath);
    }

    /**
     * Add a vertex to the hashmap vertices
     * @param id
     * @param value
     */
    public void addVertex(int id, String value){
        vertices.put(id, new Vertex(id,value));
        edges.put(id, new ArrayList<>());
    }

    /**
     * Add an edge between two vertices
     * @param from
     * @param to
     * @param weight
     */
    public void addEdge(int from, int to, int weight){
        edges.get(from).add(new Edge(from,to,weight));
    }

    /**
     *
     * @return
     */
    public Map<Integer,Vertex> getVertices(){
        return vertices;
    }

    /**
     *
     * @return
     */
    public Map<Integer,List<Edge>> getEdges(){
        return edges;
    }

    /**
     *
     * @param filePath
     */
    private void loadFile(String filePath){
        CourseFileReader cfr = new CourseFileReader();
        List<String> courseList = cfr.readFile(filePath);

        List<String> subjectsRaw = List.of(courseList.getFirst().split(","));
        ArrayList<String> subjects = new ArrayList<String>();
        int i = 1;
        for(String subject: subjectsRaw) {
            this.addVertex(i, subject.trim());
            subjects.add(subject.trim());
            i++;
        }

        for (int j = 1; j < courseList.size(); j++) {
            List<String> prerequisites = List.of(courseList.get(j).split(","));
            String to = prerequisites.getFirst().trim();
            int toIndex = subjects.indexOf(to) + 1;
            for(int k = 1; k < prerequisites.size(); k++) {
                String from = prerequisites.get(k).trim();
                int fromIndex = subjects.indexOf(from) + 1;
                this.addEdge(fromIndex,toIndex,1);
            }
        }
    }
}
