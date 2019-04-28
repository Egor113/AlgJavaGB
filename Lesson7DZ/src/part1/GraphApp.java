package part1;

public class GraphApp {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addEdge(0, 1); // A - B
        graph.addEdge(1, 2); // B - C
        graph.addEdge(0, 3); // A - D
        graph.addEdge(3, 4); // D - E
        //graph.dfs();
        graph.bfs();
    }
}
