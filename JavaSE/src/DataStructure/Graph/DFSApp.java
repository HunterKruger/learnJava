package DataStructure.Graph;

/**
 * Created by FY on 17/3/15.
 */
public class DFSApp {
    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('d');
        graph.addVertex('e');
        graph.addVertex('f');
        graph.addVertex('g');
        graph.addVertex('h');
        graph.addVertex('i');

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(0,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(0,7);
        graph.addEdge(7,8);

        graph.depthFirstSearch();

    }
}
