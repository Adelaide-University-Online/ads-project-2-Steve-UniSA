import java.util.HashSet;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String filePath = "C:\\Temp\\test_project\\uniSort\\src\\XBIT.txt";
        Graph g = new Graph(filePath);

        BreadthFirstSearch bfs = new BreadthFirstSearch(g);
        bfs.FindStartVertices();
    }
}
