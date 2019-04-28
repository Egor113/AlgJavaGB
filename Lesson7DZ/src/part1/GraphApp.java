package part1;

public class GraphApp {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addFinalVertex('J');
        graph.addEdge(0, 1); // A - B
        graph.addEdge(1, 2); // B - C
        graph.addEdge(2, 9); // C - J
        graph.addEdge(0, 3); // A - D
        graph.addEdge(3, 4); // D - E
        graph.addEdge(4, 5); // E - F
        graph.addEdge(5, 9); // F - J
        graph.addEdge(0, 6); // A - G
        graph.addEdge(6, 7); // G - H
        graph.addEdge(7, 8); // H - I
        graph.addEdge(8, 9); // I - J
        //graph.dfs();
        //graph.bfs();
        System.out.println("Длина кратчайшего пути: " + graph.getShortestPath());
    }
}
