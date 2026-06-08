public class Vertex {
    private int id;
    private String value;

    public Vertex(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", value=" + value;
    }
}
