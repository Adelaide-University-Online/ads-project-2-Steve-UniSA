/**
 * File: Vertex.java
 * Description: This module defines a vertex and its associated methods.
 * Author: Stephen Corns
 * Student ID: 2908741
 * Email ID: A2908741
 * AI Tool Used: Y
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

public class Vertex {
    private int id;
    private String value;

    /**
     *
     * @param id
     * @param value
     */
    public Vertex(int id, String value) {
        this.id = id;
        this.value = value;
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "id=" + id + ", value=" + value;
    }
}
