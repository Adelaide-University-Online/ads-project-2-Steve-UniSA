/**
 * File: Edge.java
 * Description: This module defines an edge and its associated methods.
 * Author: Stephen Corns
 * Student ID: 2908741
 * Email ID: A2908741
 * AI Tool Used: Y
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

public class Edge {
    private int from;
    private int to;
    private int weight;

    /**
     *
     * @param from
     * @param to
     * @param weight
     */
    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public int getFrom() {
        return from;
    }

    /**
     *
     * @return
     */
    public int getTo() {
        return to;
    }

    /**
     *
     * @return
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Edge: {" +
                "from=" + from +
                ", to=" + to +
                ", weight=" + weight +
                '}';
    }
}
