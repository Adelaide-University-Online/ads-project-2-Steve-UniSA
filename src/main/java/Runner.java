/**
 * File: Runner.java
 * Description: This is the main entry point for the applciation.
 * Author: Stephen Corns
 * Student ID: 2908741
 * Email ID: A2908741
 * AI Tool Used: Y
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.List;
import java.util.Queue;

public class Runner {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String filePath = "C:\\Temp\\test_project\\uniSort\\src\\XBIT.txt";
        CourseFileReader cfr = new CourseFileReader();
        List<String> courseList = cfr.readFile(filePath);

        int maxConcurrent = 20;
        Graph g = new Graph(courseList);

        BreadthFirstSearch bfs = new BreadthFirstSearch(g);
        Queue<Integer> subjectOrder = bfs.Search();
        StudyPlan sp = new StudyPlan(g, subjectOrder, maxConcurrent);
        List<List<String>>plan = sp.CreateStudyPlan();
        sp.printPlan(plan);
    }
}
